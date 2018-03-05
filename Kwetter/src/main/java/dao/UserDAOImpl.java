/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class UserDAOImpl implements UserDAO{
    List<User> users;
    
    public UserDAOImpl(){
        users = new ArrayList<User>();
        
    }
    @Override
    public List<User> GetAllUsers() {
        return this.users;
    }

    @Override
    public User GetUserById(long id) {
        for(User user : users){
            if(user.getID() == id)
            {
                return user;
            }
        }
        return null;
    }

    @Override
    public void AddUser(User user) {
        users.add(user);
    }

    @Override
    public void DeleteUser(User user) {
        users.remove(user);
    }

    @Override
    public void EditUsername(User user) {
        for(User u : users){
            if(u.getID() == user.getID()){
                u.setUsername(user.getUsername());
            }
        }
    }

    @Override
    public void followUser(User user, User otherUser) {
        if(user!=null && otherUser !=null){
            user.addFollowing(otherUser);
            otherUser.addFollower(user);
        }
    }

    @Override
    public void unfollowUser(User user, User otherUser) {
        if(user!=null && otherUser !=null){
            user.removeFollowing(otherUser);
            otherUser.removeFollower(user);
        } 
    }

    @Override
    public User GetUserByUsername(String username) {
        for(User u : users){
            if(u.getUsername() == username){
                return u;
            }
        }
        return null;
    }

    @Override
    public boolean login(String username, String password) {
        if(GetUserByUsername(username) != null){
            return GetUserByUsername(username).getPassword().equals(password);
        }
        return false;
    }
}
