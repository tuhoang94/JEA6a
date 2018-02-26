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

    User findUserById(int id);

    List<User> findAllUsers();
    
    void addFollower(int followingId, int id);

    void stopFollowing(int followingId, int id);
}
