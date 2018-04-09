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
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import service.KweetService;
import service.KweetServiceImpl;
import service.UserService;
import service.UserServiceImpl;

/**
 *
 * @author Ronal
 */
@Path("kweet")
@Stateless
public class KweetREST {

    @Inject
    KweetServiceImpl kweetService;

    @Inject
    UserServiceImpl userService;

    @GET
    @Path("/get")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweets(@Context HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return this.kweetService.findallKweets();
    }

    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Kweet getKweetById(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return this.kweetService.getKweetById(id);
    }

    @GET
    @Path("/get/userkweet/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweetsByUser(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User _user = this.userService.findUserById(id);
        return this.kweetService.getTweetsFromUser(_user);
    }

    @GET
    @Path("/get/mention/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweetsByMention(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User _user = this.userService.findUserById(id);
        return this.kweetService.getMentionsFromUser(_user);
    }

    @GET
    @Path("/get/hastag/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweetsByHashtag(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return this.kweetService.getKweetByHastagId(id);
    }

    @POST
    @Path("/create")
    @Produces({MediaType.APPLICATION_JSON})
    public void createKweet(@Context HttpServletResponse response, @FormParam("userid") long userid, @FormParam("message") String message) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User _user = this.userService.findUserById(userid);
        Kweet _kweet = new Kweet(message, _user);
        this.kweetService.createKweet(_kweet);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public void deleteKweet(@Context HttpServletResponse response, @FormParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        this.kweetService.deleteKweet(id);
    }

}
