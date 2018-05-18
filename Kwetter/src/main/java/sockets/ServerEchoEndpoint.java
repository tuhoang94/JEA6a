/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

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

/**
 *
 * @author jeroe
 */
@ServerEndpoint("/echo")
public class ServerEchoEndpoint {

    private static Set<Session> allsessions;
    private static Map<User, Session> usersession;
    private static final Logger LOG = Logger.getLogger(ServerEchoEndpoint.class.getName());

    @OnOpen
    public void open(Session session, EndpointConfig conf, User u) {
        allsessions = session.getOpenSessions();
        usersession.put(u, session);
    }

    @OnMessage
    public void onMessage(Session session, KweetDTO message, User u) {
        //ToDo find the followers and send that kweet to those followers
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

    public void sendAllKweets(List<KweetDTO> kdtos, Session session) {
        for (KweetDTO kto : kdtos) {
            try {
                session.getAsyncRemote().sendObject(kto);
            } catch (Exception ex) {
                LOG.info("Fout bij het versturen van alle kweets naar: " + session);
            }
        }
    }

    public void SendToFollower(Session session, KweetDTO kdto) {
        try {
            session.getAsyncRemote().sendObject(kdto);
        } catch (Exception ex) {
            LOG.info("Fout bij het versturen van alle kweets naar: " + session);
        }

    }

    public void sendToAll(KweetDTO kdto) {
        for (Session ses : allsessions) {
            try {
                ses.getAsyncRemote().sendObject(kdto);

            } catch (Exception ex) {
                LOG.info("Fout bij het versturen van alle kweets naar: " + ses);
            }
        }
    }
    
    public void UpdateFollowers(Session session)
    {
     //   for ()
    }

}
