/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import domain.Kweet;
import domain.Page;
import domain.Role;
import domain.User;
import dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import service.KweetServiceImpl;
import service.UserServiceImpl;

/**
 *
 * @author Ronal
 */
@Path("user")
@Stateless
public class UserREST {

    @Inject
    UserServiceImpl userService;

    @Inject
    KweetServiceImpl kweetService;

    @GET
    @Path("add")
    public String test() {
        return "Üser API called test";
    }

    @POST
    @Path("test")
    @Produces({MediaType.APPLICATION_JSON})
    public String postParamTest(@FormParam("test") String test, @FormParam("test2") String test2) {
        return test + test2;
    }

    @GET
    @Path("inserttest")
    public String addMockUsers(@Context HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");

        try {
            //Page page = new Page("biotest", "locationtest", "www.test.nl", "Color BLUE");
            //Page pageB = new Page("biotest", "locationtest", "www.test.nl", "Color BLUE");

            User a = new User(Role.MODERATOR, "Jaap", "pass123", "profilePhoto1");
            //OneToOne user-page
            // a.setPage(page);
            // page.setUser(a);
            User b = new User(Role.USER, "Piet", "pass123", "profilePhoto2");
            //  b.setPage(pageB);
            //  pageB.setUser(b);
            User c = new User(Role.USER, "Bob", "pass123", "profilePhoto3");
            User d = new User(Role.USER, "Aap", "pass123", "profilePhoto4");
            this.userService.createUser(a);
            this.userService.createUser(b);
            this.userService.createUser(c);
            this.userService.createUser(d);
             Kweet k = new Kweet("Hallo alles goed?", a);
             this.kweetService.createKweet(k);
            a.getPage().setBio("kutaapje");
            this.userService.editUser(a);
            System.out.print("printline for addMockUser rest");
            return "Mock users added";
        } catch (Exception e) {
            System.out.print(e);
            return (e.getMessage());
        }

    }

    @GET
    @Path("/get/")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUsers(@Context HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            List<User> users = this.userService.findAllUsers();
            System.out.println("Size users:" + users.size());

            List<UserDTO> usersDTO = new ArrayList<>();
            for (User user : users) {
                UserDTO userDTO = new UserDTO(user);
                usersDTO.add(userDTO);
            }
            if (usersDTO != null) {
                return Response.ok(usersDTO).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();

        }
    }

    @GET
    @Path("/get/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUser(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            User user = this.userService.findUserById(id);
            UserDTO userDTO = new UserDTO(user);
            if (user != null) {
                return Response.ok(userDTO).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    
    //TODO: TOKEN BASED
    @POST
    @Path("/login")
    @Produces({MediaType.APPLICATION_JSON})
    public Response Login(@Context HttpServletResponse response, @FormParam("username") String username, @FormParam("password") String password) {

        System.out.println("username:" + username + " password:" + password);
        try {
            User user = this.userService.getUserByUsername(username);
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    return Response.ok(user).build();
                }
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
        return null;
    }

    @POST
    @Path("/editprofile")
    @Produces({MediaType.APPLICATION_JSON})
    public Response editProfile(@Context HttpServletResponse response, @FormParam("id") Long id, @FormParam("username") String username, @FormParam("password") String password, @FormParam("bio") String bio, @FormParam("location") String location, @FormParam("website") String website) {

        try {
            User user = this.userService.findUserById(id);

            if (user != null) {
                user.setUsername(username);
                user.setPassword(password);
                user.getPage().setBio(bio);
                user.getPage().setLocation(location);
                user.getPage().setWebsite(website);

                this.userService.editUser(user);
                return Response.ok().build();

            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/followers/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getFollowers(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            User user = this.userService.findUserById(id);
            List<User> followers = user.getFollowers();
            List<UserDTO> usersDTO = new ArrayList<>();
            if (user != null) {
                for(User u : followers){
                    UserDTO userDTO = new UserDTO(u);
                    usersDTO.add(userDTO);
                }
                return Response.ok(usersDTO).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("/following/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getFollowing(@Context HttpServletResponse response, @PathParam("id") long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            User user = this.userService.findUserById(id);
            List<User> following = user.getFollowing();
            List<UserDTO> usersDTO = new ArrayList<>();
            if (user != null) {
                for(User u : following){
                    UserDTO userDTO = new UserDTO(u);
                    usersDTO.add(userDTO);
                }
                return Response.ok(usersDTO).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }
    }

    @POST
    @Path("/create/")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public User createUser(@Context HttpServletResponse response, User user) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            userService.createUser(user);
            return user;
        } catch (Exception ex) {
            throw ex;
        }
    }

    @DELETE
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public void removeUser(@Context HttpServletResponse response, @PathParam("id") Long id) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = this.userService.findUserById(id);
        this.userService.deleteUser(user);
    }

    @POST
    @Path("/follow")
    @Produces({MediaType.APPLICATION_JSON})
    public Response followUser(@Context HttpServletResponse response, @FormParam("username") String username, @FormParam("otherUsername") String otherUsername) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        try {
            User user = this.userService.getUserByUsername(username);
            User otherUser = this.userService.getUserByUsername(otherUsername);
            if (user != null && otherUser != null) {
                this.userService.followUser(user, otherUser);
                return Response.ok().build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception ex) {
            return Response.serverError().build();
        }

    }

    @POST
    @Path("/unfollow")
    @Produces({MediaType.APPLICATION_JSON})
    public void unfollowUser(@Context HttpServletResponse response, @FormParam("username") String username, @FormParam("otherUsername") String otherUsername) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = this.userService.getUserByUsername(username);
        User otherUser = this.userService.getUserByUsername(otherUsername);
        this.userService.unfollowUser(user, otherUser);
    }

}
