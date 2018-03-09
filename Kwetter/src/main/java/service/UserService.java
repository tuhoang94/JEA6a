/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.User;
import java.util.List;

/**
 *
 * @author Ronal
 */
public interface UserService {
 
    void createUser(User user);

    void editUsername(String username);

    User findUserById(long id);

    List<User> findAllUsers();

    void followUser(User user, User otherUser) throws Exception;

    void unfollowUser(User user, User otherUser) throws Exception;
    
    User getUserByUsername(String username);
    
    void deleteUser(User user);
}
