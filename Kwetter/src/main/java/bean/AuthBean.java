/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.Role;
import domain.User;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.security.Principal;
import javax.faces.application.FacesMessage;

import service.UserServiceImpl;

/**
 *
 * @author Ronal
 */
@Named(value = "authBean")
@ViewScoped
public class AuthBean implements Serializable {

    @Inject
    private UserServiceImpl userService;
    @Inject
    private SessionBean sessionBean;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Creates a new instance of AuthBean
     */
    public AuthBean() {
    }

    public String Login() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        System.out.println(request.getSession().toString());
        try {
            if (request.getUserPrincipal() != null) {
                request.logout();
            }
            request.login(username, password);
            User loggedInUser = userService.getUserByUsername(request.getUserPrincipal().getName());
            this.sessionBean.setLoggedInUser(loggedInUser);
            if (loggedInUser != null) {
                return "testTable.xhtml";
            }
//
//            boolean isModerator = request.isUserInRole("MODERATOR");
//            boolean isUser = request.isUserInRole("USER");
//
//            if (isModerator) {
//                return "/pages/moderator/testTable.xhtml";
//            }
//
//            if (isUser) {
//                return "/pages/user/testTable.xhtml";
//            }

//            Principal userPrincipal = request.getUserPrincipal();
//            if (request.getUserPrincipal() != null) {
//                request.logout();
//            }
//            request.login(username, password);
//            userPrincipal = request.getUserPrincipal();
//            User loggedInUser = userService.getUserByUsername(userPrincipal.getName());
//            this.sessionBean.setLoggedInUser(loggedInUser);
        } catch (ServletException e) {

            context.addMessage(null, new FacesMessage(e.getMessage()));
        }

        return "";
    }

    public String LoginTemp() {
        User user = userService.getUserByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                if (user.getRole().equals(Role.MODERATOR)) {
                    this.sessionBean.setLoggedInUser(user);
                    return "testTable";
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error: Only moderators are allowed."));
                }
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error: Your password is WRONG. Try again."));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error: Account with this username doesn't exist. Try again."));
        }
        return null;

    }

}
