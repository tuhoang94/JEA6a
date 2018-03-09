/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDAO;
import domain.User;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    @Override
    public void createUser(User user) {
        //TODO: Check if username exist in userdao
        userDAO.AddUser(user);
    }

    @Override
    public void editUsername(String username) {
        //TODO: Check if username exist in userdao 
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
            this.userDAO.followUser(user, otherUser);
        } else {
            throw new Exception("Cannot follow yourself");
        }
    }

    @Override
    public void unfollowUser(User user, User otherUser) throws Exception {
        if (user != otherUser) {
            this.userDAO.unfollowUser(user, otherUser);
        } else {
            throw new Exception("Cannot unfollow yourself");
        }
    }

}


//    public void followUser(User user, User otherUser) {
//        if(user!=null && otherUser !=null){
//            user.addFollowing(otherUser);
//            otherUser.addFollower(user);
//        }
//    }
//
//    @Override
//    public void unfollowUser(User user, User otherUser) {
//        if(user!=null && otherUser !=null){
//            user.removeFollowing(otherUser);
//            otherUser.removeFollower(user);
//        } 
//    }
