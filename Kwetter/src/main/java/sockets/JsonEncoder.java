/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

import com.google.gson.Gson;
import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * Encodes {@link Message}s to JSON
 * @author jgeenen
 */
public class JsonEncoder implements Encoder.Text<Message> {
    
    private final Gson gson = new Gson();

    @Override
    public String encode(Message msg) throws EncodeException {
        JsonObject json = Json.createObjectBuilder()
                .add("user", msg.getUser())
                .add("message",msg.getMsg()).build();
        return json.toString();
    }

    @Override
    public void init(EndpointConfig config) {
    }

    @Override
    public void destroy() {
    }
}
