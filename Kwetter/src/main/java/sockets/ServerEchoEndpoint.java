/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import domain.Kweet;
import domain.User;
import dto.KweetDTO;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.Session;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import service.KweetServiceImpl;
import service.UserService;
import service.UserServiceImpl;

/**
 *
 * @author jeroe
 */
@ServerEndpoint(
    value = "/echo",
    encoders = JsonEncoder.class, 
    decoders = JsonDecoder.class
    )
public class ServerEchoEndpoint {

    UserServiceImpl userserv = new UserServiceImpl();
    KweetServiceImpl kweetserv = new KweetServiceImpl();
    private static Set<Session> allsessions;
    private static Map<User, Session> usersession;
    private static final Logger LOG = Logger.getLogger(ServerEchoEndpoint.class.getName());
    JsonEncoder json = new JsonEncoder();

    @OnOpen
    public void open(Message msg, Session session, EndpointConfig conf) {
        allsessions = session.getOpenSessions();
        usersession.put(userserv.getUserByUsername(msg.getUser()), session);
    }

    @OnMessage
    public void onMessage(Message message, Session session) {
        //ToDo find the followers and send that kweet to those followers
        //Message msg = new Message(message);
        User u = userserv.getUserByUsername(message.getUser());
        Kweet k = new Kweet(message.getMsg(), u);
        kweetserv.createKweet(k);
        for (User us : u.getFollowers()) {
            for (User i : usersession.keySet()) {
                if (i.getID() == us.getID()) {
                    SendToFollower(usersession.get(i), message);
                }
            }
        }

    }

    @OnError
    public void error(Session session, Throwable error) {
        LOG.info(error.toString() + "on: " + session);
    }

    @OnClose
    public void close(Session session, CloseReason reason) {
        allsessions.remove(session);
        for (User u : usersession.keySet()) {
            if (usersession.get(u) == session) {
                usersession.remove(u);
            }
        }
    }
//
//    public void sendAllKweets(List<KweetDTO> kdtos, Session session) {
//        for (KweetDTO kto : kdtos) {
//            try {
//                Message msg = new Message(kto);
//                session.getAsyncRemote().sendObject(json.encode(msg));
//            } catch (Exception ex) {
//                LOG.info("Fout bij het versturen van alle kweets naar: " + session);
//            }
//        }
//    }
    
        public void SendToFollower(Session session, Message kdto) {
        try {
            
            session.getAsyncRemote().sendObject(kdto);
        } catch (Exception ex) {
            LOG.info("Fout bij het versturen van alle kweets naar: " + session);
        }

    }

//    public void SendToFollower(Session session, KweetDTO kdto) {
//        try {
//            session.getAsyncRemote().sendObject(kdto);
//        } catch (Exception ex) {
//            LOG.info("Fout bij het versturen van alle kweets naar: " + session);
//        }
//
//    }

    public void sendToAll(Message message) {
        for (Session ses : allsessions) {
            try {
                ses.getAsyncRemote().sendObject(message);

            } catch (Exception ex) {
                LOG.info("Fout bij het versturen van alle kweets naar: " + ses);
            }
        }
    }
}
