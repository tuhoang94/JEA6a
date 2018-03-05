/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.Kweet;
import domain.User;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import service.KweetService;
import service.UserService;

/**
 *
 * @author Ronal
 */

@Path("/kweet")
public class KweetREST {
    KweetService kweetService;
    UserService userService;
    
    @Inject
    public KweetREST(KweetService kweetService, UserService userService){
        this.kweetService = kweetService;
        this.userService = userService;
    }
    
    @GET
    @Path("/get")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweets(){
        return this.kweetService.findallKweets();
    }
    
    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Kweet getKweetById(@PathParam("id") long id){
        return this.kweetService.getKweetById(id);
    }
    
    @GET
    @Path("/get/mention/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweetsByMention(@PathParam("id") long id){
        User _user = this.userService.findUserById(id);
        return this.kweetService.getMentionsFromUser(_user);
    }
    
    @GET
    @Path("/get/hastag/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweetsByHashtag(@PathParam("id") long id){
        return this.kweetService.getKweetByHastagId(id);
    }
   
    @PUT 
    @Path("/put/create/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public void createKweet(@PathParam("userid") long userid, @PathParam("message") String message){
       User _user = this.userService.findUserById(userid);    
       Kweet _kweet = new Kweet(message, _user);      
       this.kweetService.createKweet(_kweet);
    }
    
    @POST
    @Path("/post/delete")
    @Produces({MediaType.APPLICATION_JSON})
    public void deleteKweet(@FormParam("id") long id) {
        this.kweetService.deleteKweet(id);
    }
    
    
    
    
    
    
    
}