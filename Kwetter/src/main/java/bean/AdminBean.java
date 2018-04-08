/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.Kweet;
import domain.Role;
import domain.User;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import service.KweetServiceImpl;
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
    private KweetServiceImpl kweetService;
    private String username;
    private String password;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private List<User> users;
    private User user = new User();

    public User getUser() {
        return user;
    }

    public Role[] getRoles() {
        return Role.values();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String deleteUser(User user) {
        User u = service.findUserById(user.getID());
        try {
            service.deleteUser(u);
            return "testTable";
        } catch (Exception ex) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(ex.getMessage()));
            System.out.println(ex.getMessage());
        }
        return "Cant delete this user";
    }

    public void deleteKweet(Kweet kweet) {
        this.kweetService.deleteKweet(kweet.getId());
    }

    public String editPageUser(User user) {
        this.setUser(user);
        return "UpdateUserPage";
    }

    public String kweetPageUser(User user) {
        this.setUser(user);
        return "testKweets";
    }

    public String updateUser() {
        this.service.editUser(this.user);
        return "AdminPage";
    }

    public String editRole() {
        try {
            System.out.println(user);
            User userEdit = service.getUserByUsername(user.getUsername());
            userEdit.setRole(user.getRole());
            System.out.println(userEdit);
            this.service.editUser(userEdit);
            return "testTable";
        } catch (Exception ex) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(ex.getMessage()));
        }
        return null;

    }

    public List<User> getUsers() {
        users = service.findAllUsers();
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public AdminBean() {
    }

    public String Login() {
        User user = service.getUserByUsername(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                if (user.getRole().equals(Role.MODERATOR)) {
                    return "AdminPage";
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
