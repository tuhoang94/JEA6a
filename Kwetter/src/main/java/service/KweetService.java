/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Kweet;
import domain.User;
import java.util.List;

/**
 *
 * @author Ronal
 */
public interface KweetService {
    List<Kweet> findallKweets();

    User getLoggedInUser();

    List<Kweet> getMentionsFromUser(User user);
    
    List<Kweet> getKweetByHastagId(long id);

    List<Kweet> getTweetsFromUser(User user);
    
    void createKweet(Kweet kweet);
    
    void deleteKweet(long id);
    
    Kweet getKweetById(long id);
    

}
