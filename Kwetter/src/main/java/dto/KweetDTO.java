/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import domain.Kweet;
import java.util.Date;

/**
 *
 * @author Ronal
 */
public class KweetDTO {
    
    private Long id;
    private String message;
    private Date date;
    private String username;
    private int likedAccountsCounts;
    private int mentionAccountsCounts;
    private int hashtagCounts;

    public KweetDTO(Kweet kweet) {
        this.id = kweet.getId();
        this.message = kweet.getMessage();
        this.date = kweet.getDate();
        this.username = kweet.getUser().getUsername();
        this.likedAccountsCounts = kweet.getLikedAccounts().size();
        this.mentionAccountsCounts = kweet.getMentions().size();
        this.hashtagCounts = kweet.getHashtags().size();
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLikedAccountsCounts() {
        return likedAccountsCounts;
    }

    public void setLikedAccountsCounts(int likedAccountsCounts) {
        this.likedAccountsCounts = likedAccountsCounts;
    }

    public int getMentionAccountsCounts() {
        return mentionAccountsCounts;
    }

    public void setMentionAccountsCounts(int mentionAccountsCounts) {
        this.mentionAccountsCounts = mentionAccountsCounts;
    }

    public int getHashtagCounts() {
        return hashtagCounts;
    }

    public void setHashtagCounts(int hashtagCounts) {
        this.hashtagCounts = hashtagCounts;
    }
    
    
    
    
     
    
    
    
    
}
