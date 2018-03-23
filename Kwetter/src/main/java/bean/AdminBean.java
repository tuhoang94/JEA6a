/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.User;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import service.UserServiceImpl;

/**
 *
 * @author Ronal
 */
@Named(value = "adminBean")
@RequestScoped
public class AdminBean {

    /**
     * Creates a new instance of AdminBean
     */
    @Inject
    private UserServiceImpl service;
    private String username;
    private String password;

    public AdminBean() {
    }

    public String Login() {
        User user = service.getUserByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return "AdminPage";
            } else {
                FacesContext.getCurrentInstance().addMessage("password", new FacesMessage("Error: Your password is WRONG. Try again."));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage("password", new FacesMessage("Error: Account with this username doesn't exist. Try again."));
        }
        return "false";

    }

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

}
