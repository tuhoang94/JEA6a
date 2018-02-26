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
public class Kweet implements Comparable<Kweet> {

    private Long id;
    private String message;
    private Date date;
    private User user;
    private List<User> likedAccounts;
    private List<User> mentions;
    private List<Hashtag> hashtags;

    public Kweet(Long id, String message, Date date, User user) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.user = user;
        this.likedAccounts = new ArrayList<>();
        this.mentions = new ArrayList<>();
        this.hashtags = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void addLike(User user) {
        if (!likedAccounts.contains(user) && user != null) {
            this.likedAccounts.add(user);
        }
    }

    public void removeLike(User user) {
        if (likedAccounts.contains(user) && user != null) {
            this.likedAccounts.remove(user);
        }
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

    public void addHashtag(Hashtag hashtag) {
        if (!hashtags.contains(hashtag) && hashtag != null) {
            this.hashtags.add(hashtag);
        }
    }

    public void addMention(User mention) {
        if (mention != null && !mentions.contains(mention)) {
            mentions.add(user);
            if (!mention.getMentions().contains(this)) {
                mention.addMention(this);
            }
        }
    }

    @Override
    public int compareTo(Kweet k) {
        return this.date.compareTo(k.getDate());
    }

}
