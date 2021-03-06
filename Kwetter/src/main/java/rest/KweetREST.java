/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.Kweet;
import domain.User;
import dto.KweetDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import service.KweetServiceImpl;
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
    public Response getKweets(@Context HttpServletResponse response) {
        try {
            List<Kweet> kweets = this.kweetService.findallKweets();
            List<KweetDTO> KweetsDTO = new ArrayList<>();
            for (Kweet k : kweets) {
                KweetDTO kd = new KweetDTO(k);
                KweetsDTO.add(kd);
            }
            if (kweets != null) {
                return Response.ok(KweetsDTO).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getKweetById(@Context HttpServletResponse response, @PathParam("id") long id) {
        try {
            KweetDTO kd = new KweetDTO(this.kweetService.getKweetById(id));
            if (kd != null) {
                return Response.ok(kd).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }

        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/get/userkweet/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getKweetsByUser(@Context HttpServletResponse response, @PathParam("id") long id) {
        try {
            User _user = this.userService.findUserById(id);
            List<Kweet> kweets = this.kweetService.getTweetsFromUser(_user);
            List<KweetDTO> dtos = new ArrayList<>();

            if (kweets != null) {
                for (Kweet k : kweets) {
                    KweetDTO dto = new KweetDTO(k);
                    dtos.add(dto);
                }
                return Response.ok(dtos).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }

    }

    @GET
    @Path("/kweetsfollowing/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getKweetsFollowing(@Context HttpServletResponse response, @PathParam("id") long id) {
        try {
            User user = this.userService.findUserById(id);

            if (user != null) {
                List<KweetDTO> kweetsFollowing = new ArrayList<>();
                for (User u : user.getFollowing()) {
                    for (Kweet kweet : u.getKweets()) {
                        KweetDTO kweetDTO = new KweetDTO(kweet);
                        kweetsFollowing.add(kweetDTO);
                    }
                }
                return Response.ok(kweetsFollowing).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();

            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/get/mention/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getKweetsByMention(@Context HttpServletResponse response, @PathParam("id") long id) {
        try {
            User _user = this.userService.findUserById(id);
            List<Kweet> kweets = this.kweetService.getMentionsFromUser(_user);
            List<KweetDTO> dtos = new ArrayList<>();

            if (kweets != null) {
                for (Kweet k : kweets) {
                    KweetDTO dto = new KweetDTO(k);
                    dtos.add(dto);
                }
                return Response.ok(dtos).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/get/hastag/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getKweetsByHashtag(@Context HttpServletResponse response, @PathParam("id") long id) {
        try {
            List<Kweet> kweets = this.kweetService.getKweetByHastagId(id);
            List<KweetDTO> dtos = new ArrayList<>();

            if (kweets != null) {
                for (Kweet k : kweets) {
                    KweetDTO dto = new KweetDTO(k);
                    dtos.add(dto);
                }
                return Response.ok(dtos).build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }

    }

    @POST
    @Path("/create")
    @Produces({MediaType.APPLICATION_JSON})
    public Response createKweet(@Context HttpServletResponse response, @FormParam("userid") long userid, @FormParam("message") String message) {
        try {
            User user = this.userService.findUserById(userid);

            if (user != null) {
                Kweet kweet = new Kweet(message, user);
                this.kweetService.createKweet(kweet);
                return Response.ok().build();

            } else {
                return Response.status(Response.Status.NOT_FOUND).build();

            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public void deleteKweet(@Context HttpServletResponse response, @FormParam("id") long id) {
        this.kweetService.deleteKweet(id);
    }

    @POST
    @Path("/like")
    @Produces({MediaType.APPLICATION_JSON})
    public Response likeKweet(@Context HttpServletResponse response, @FormParam("userid") long userid, @FormParam("kweetid") long kweetid) {
        try {
            User user = this.userService.findUserById(userid);
            Kweet kweet = this.kweetService.getKweetById(kweetid);

            if (user != null && kweet != null) {
                this.kweetService.likeKweet(user, kweet);
                return Response.ok().build();

            } else {
                return Response.status(Response.Status.NOT_FOUND).build();

            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }

    }

    @POST
    @Path("/unlike")
    @Produces({MediaType.APPLICATION_JSON})
    public Response unlikeKweet(@Context HttpServletResponse response, @FormParam("userid") long userid, @FormParam("kweetid") long kweetid) {
        try {
            User user = this.userService.findUserById(userid);
            Kweet kweet = this.kweetService.getKweetById(kweetid);

            if (user != null && kweet != null) {
                this.kweetService.unlikeKweet(user, kweet);
                return Response.ok().build();
            } else {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

}
