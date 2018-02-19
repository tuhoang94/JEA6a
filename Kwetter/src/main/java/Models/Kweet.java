/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class Kweet {
    int id;
    String message;
    Date date;
    User user;
    List<User> likedAccounts;
    List<User> mentions;
    List<Hashtag> hashtags;
    
    
    
    
}
