/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class Kweet {
    private int id;
    private String message;
    private Date date;
    private User user;
    private List<User> likedAccounts;
    private List<User> mentions;
    private List<Hashtag> hashtags;

    public Kweet(int id, String message, Date date, User user, List<User> likedAccounts, List<User> mentions, List<Hashtag> hashtags) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.user = user;
        this.likedAccounts = likedAccounts;
        this.mentions = mentions;
        this.hashtags = hashtags;
    }
    
    
    
    
    
    
}
