/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDAO;
import domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Ronal
 */
@Stateless
public class UserServiceImpl implements UserService {
    @Inject
    UserDAO userDAO;

    @Override
    public void createUser(User user) {
        if (userDAO.GetUserByUsername(user.getUsername()) != null) {
            userDAO.AddUser(user);
        }
    }

    @Override
    public void editUsername(String username) {
        if (userDAO.GetUserByUsername(username) != null) {
            User user = userDAO.GetUserByUsername(username);
            userDAO.EditUser(user);
        }
    }

    @Override
    public User findUserById(long id) {
        return userDAO.GetUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userDAO.GetAllUsers();
    }

    @Override
    public User getUserByUsername(String username) {
        return this.userDAO.GetUserByUsername(username);
    }

    @Override
    public void deleteUser(User user) {
        this.userDAO.DeleteUser(user);
    }

    @Override
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

    @Override
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
