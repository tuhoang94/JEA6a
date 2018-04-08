/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.User;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Ronal
 */
@Named(value = "sessionBean")
@SessionScoped
public class SessionBean implements Serializable{
    
    private User loggedInUser;

    /**
     * Creates a new instance of SessionBean
     */
    public SessionBean() {
    }
    
    public String Logout(){
        loggedInUser = null;
        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
        try {
            request.logout();
            return "/testLogin.xhtml";
        }
        catch (ServletException e) {
            System.out.print("Something went wrong while logging out: " + e.getMessage());
            return null;
        }
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
    
}
