/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

import com.google.gson.Gson;
import java.io.StringReader;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

/**
 * Decodes {@link Message}s from JSON
 * @author jgeenen
 */
public class JsonDecoder implements Decoder.Text<Message>{

    private final Gson gson = new Gson();
    
    @Override
    public void init(EndpointConfig config) {

    }
    
    @Override
    public Message decode(String jsonMessage) throws DecodeException {
        JsonObject jsonObject = Json
                .createReader(new StringReader(jsonMessage)).readObject();
        Message msg = new Message();
        msg.setUser(jsonObject.getString("user"));
        msg.setMsg(jsonObject.getString("message"));
        return msg;
    }

    @Override
    public boolean willDecode(String arg0) {
        return true;
    }


    @Override
    public void destroy() {

    }
    
}
