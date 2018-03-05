/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.Kweet;
import domain.User;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import service.KweetService;

/**
 *
 * @author Ronal
 */

@Path("/kweet")
public class KweetREST {
    KweetService kweetService;
    
    @GET
    @Path("/kweets")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Kweet> getKweets(){
        return this.kweetService.findallKweets();
    }
    
    @GET
    @Path("/kweets/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Kweet getKweet(@PathParam("id") long id){
        return this.kweetService.getKweetById(id);
    }
    
    @PUT 
    @Path("kweets/create/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Kweet createKweet(@PathParam("")){
        
    }
    
    
    
    
}
