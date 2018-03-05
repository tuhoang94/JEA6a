/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import domain.User;
import java.util.List;

/**
 *
 * @author Ronal
 */
public interface UserDAO {  
    
    public List<User> GetAllUsers();
    public User GetUserById (long id);
    public User GetUserByUsername(String username);
    public void AddUser(User user);
    public boolean login(String username, String password);
    public void DeleteUser (User user);
    public void EditUsername (User user);   
    public void followUser (User user, User otherUser);
    public void unfollowUser(User user, User otherUser);
}
