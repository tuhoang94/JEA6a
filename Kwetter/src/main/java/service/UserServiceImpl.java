/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.JPA;
import dao.UserDAO;
import dao.UserDAOJpaController;
import domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 *
 * @author Ronal
 */
@Stateless @Default 
public class UserServiceImpl{
    @Inject @JPA
    UserDAO userDAO;

    public void createUser(User user) {
            userDAO.AddUser(user);
       
    }

    public void editUsername(String username) {
        if (userDAO.GetUserByUsername(username) != null) {
            User user = userDAO.GetUserByUsername(username);
            userDAO.EditUser(user);
        }
    }
    
    public void editUser(User user){
        userDAO.EditUser(user);
    }

    public User findUserById(long id) {
        return userDAO.GetUserById(id);
    }

    public List<User> findAllUsers() {
        return userDAO.GetAllUsers();
    }

    public User getUserByUsername(String username) {
        return this.userDAO.GetUserByUsername(username);
    }

    public void deleteUser(User user) {
        this.userDAO.DeleteUser(user);
    }

    public void followUser(User user, User otherUser) throws Exception {

        if (user != otherUser) {
            user.addFollowing(otherUser);
            otherUser.addFollower(user);

            this.userDAO.EditUser(user);
            this.userDAO.EditUser(otherUser);
        } else {
            throw new Exception("Cannot follow yourself");
        }
    }

    public void unfollowUser(User user, User otherUser) throws Exception {
        if (user != otherUser) {
            user.removeFollowing(otherUser);
            otherUser.removeFollower(user);

            this.userDAO.EditUser(user);
            this.userDAO.EditUser(otherUser);
        } else {
            throw new Exception("Cannot unfollow yourself");
        }
    }

}
