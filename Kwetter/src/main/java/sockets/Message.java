/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sockets;

import java.io.Serializable;

/**
 * Represents a simple message for websockets
 * @author jgeenen
 */
public class Message implements Serializable{
    
    private String user;
    private String msg;

    public Message() {
    }

    public Message(String usr, String msg) {
        this.user = usr;
        this.msg = msg;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public String getMsg(){
        return this.msg;
    }
    
    public void setMsg(String msg){
        this.msg = msg;
    }
}

