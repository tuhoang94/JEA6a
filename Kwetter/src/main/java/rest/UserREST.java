/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.Role;
import domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import service.UserService;

/**
 *
 * @author Ronal
 */
@Path("user")
@Produces({MediaType.APPLICATION_JSON})
@Stateless
public class UserREST {

    @Inject 
    UserService userService;

    @GET
    @Path("add")
    public String test() {
        return "Üser API called test";
    }

    @GET
    @Path("inserttest")
    public String addMockUsers(@Context HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");

        try {
            User a = new User(Role.USER, "Jaap", "pass123", "profilePhoto1");
            User b = new User(Role.USER, "Piet", "pass123", "profilePhoto2");
            User c = new User(Role.USER, "Bob", "pass123", "profilePhoto3");
            User d = new User(Role.USER, "Aap", "pass123", "profilePhoto4");
            this.userService.createUser(a);
            this.userService.createUser(b);
            this.userService.createUser(c);
            this.userService.createUser(d);
            return "Mock users added";
        } catch (Exception e) {
            System.out.print(e);
            return(e.getMessage());
        }

    }

    @GET
    @Path("/get/")
    @Produces({MediaType.APPLICATION_JSON})
    public List<User> getUsers(@Context HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return this.userService.findAllUsers();
    }

    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public User getUser(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return this.userService.findUserById(id);
    }

    @PUT
    @Path("/put/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public User createUser(@Context HttpServletResponse response, @PathParam("username") String username, @PathParam("password") String password) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = new User(username, password);

        try {
            userService.createUser(user);
            return user;
        } catch (Exception ex) {
            throw ex;
        }
    }

    @DELETE
    @Path("/delete/")
    @Produces({MediaType.APPLICATION_JSON})
    public void removeUser(@Context HttpServletResponse response, @PathParam("username") String username) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = this.userService.getUserByUsername(username);
        this.userService.deleteUser(user);
    }

    @POST
    @Path("/follow")
    @Produces({MediaType.APPLICATION_JSON})
    public void followUser(@Context HttpServletResponse response, @PathParam("username") String username, @PathParam("otherUsername") String otherUsername) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = this.userService.getUserByUsername(username);
        User otherUser = this.userService.getUserByUsername(otherUsername);
        this.userService.followUser(user, otherUser);
    }

    @POST
    @Path("/unfollow")
    @Produces({MediaType.APPLICATION_JSON})
    public void unfollowUser(@Context HttpServletResponse response, @PathParam("username") String username, @PathParam("otherUsername") String otherUsername) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = this.userService.getUserByUsername(username);
        User otherUser = this.userService.getUserByUsername(otherUsername);
        this.userService.unfollowUser(user, otherUser);
    }
}
