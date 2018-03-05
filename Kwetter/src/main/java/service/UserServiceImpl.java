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
    public void addFollower(int followingId, int id) {
        if (followingId != id) {
            User user = userDAO.GetUserById(id);
            User userFollowing = userDAO.GetUserById(followingId);
            if (user != userFollowing) {
                user.addFollowing(userFollowing);
                userFollowing.addFollower(user);
                
                userDAO.AddFollowing(user, userFollowing);
                //TODO: userdao addfollower
            }
        }
    }

    @Override
    public void stopFollowing(int followingId, int id) {
        if (followingId != id) {
            User user = userDAO.GetUserById(id);
            User userFollowing = userDAO.GetUserById(followingId);
            if (user != userFollowing) {
                user.removeFollowing(userFollowing);
                userFollowing.removeFollower(user);
                
                //TODO
                //userdao for both
            }
        }
    }

}
