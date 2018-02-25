/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class Kweet implements Comparable<Kweet>{
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
        this.likedAccounts = new ArrayList<User>();
        this.mentions = new ArrayList<User>();
        this.hashtags = new ArrayList<Hashtag>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getLikedAccounts() {
        return likedAccounts;
    }

    public void setLikedAccounts(List<User> likedAccounts) {
        this.likedAccounts = likedAccounts;
    }

    public List<User> getMentions() {
        return mentions;
    }

    public void setMentions(List<User> mentions) {
        this.mentions = mentions;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }
    
    @Override
    public int compareTo(Kweet k){
        return this.date.compareTo(k.getDate());
    }
    
    
    
    
    
    
    
    
}
    