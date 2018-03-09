/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.User;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import service.UserService;

/**
 *
 * @author Ronal
 */
@Path("/user")
public class UserREST {

    UserService userService;

    @Inject
    public UserREST(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Path("/get/")
    @Produces({MediaType.APPLICATION_JSON})
    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public User getUser(@PathParam("id") long id) {
        return this.userService.findUserById(id);
    }

    @PUT
    @Path("/put/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public User createUser(@PathParam("username") String username, @PathParam("password") String password) {
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
    public void removeUser(@PathParam("username") String username) {
        User user = this.userService.getUserByUsername(username);
        this.userService.deleteUser(user);
    }

    @POST
    @Path("/follow")
    @Produces({MediaType.APPLICATION_JSON})
    public void followUser(@PathParam("username") String username, @PathParam("otherUsername") String otherUsername) throws Exception{
        User user = this.userService.getUserByUsername(username);
        User otherUser = this.userService.getUserByUsername(otherUsername);
        this.userService.followUser(user, otherUser);
    }
    
        @POST
    @Path("/unfollow")
    @Produces({MediaType.APPLICATION_JSON})
    public void unfollowUser(@PathParam("username") String username, @PathParam("otherUsername") String otherUsername) throws Exception{
        User user = this.userService.getUserByUsername(username);
        User otherUser = this.userService.getUserByUsername(otherUsername);
        this.userService.unfollowUser(user, otherUser);
    }





}
