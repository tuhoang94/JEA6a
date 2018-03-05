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
public class UserREST {
    
    UserService userService;
    
    @Inject
    public UserREST(UserService userService){
        this.userService = userService;
    }
    
    @GET
    @Path("/get/users")
    @Produces({MediaType.APPLICATION_JSON})
    public List<User> getUsers(){
        return this.userService.findAllUsers();
    }
    
    @GET
    @Path("/get/users/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public User getUser(@PathParam("id") long id){
        return this.userService.findUserById(id);
    }
    
    
    
}
