/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import domain.Kweet;
import domain.Page;
import domain.Role;
import domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class UserDTO {
    
    private Long ID;
    private String role;
    private String username;
    private String password;
    private String bio;
    private String location;
    private String website;    
    private String profilePhoto;
    private int followingAccountsCount;
    private int followersAccountsCount;
    private int kweetsCount;
    private int mentionCount;

    public UserDTO(User user) {
        this.ID = user.getID();
        this.role = user.getRole().toString();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.bio = user.getPage().getBio();
        this.location = user.getPage().getLocation();
        this.website = user.getPage().getWebsite();
        this.profilePhoto = user.getProfilePhoto();
        this.followersAccountsCount= user.getFollowers().size();
        this.followingAccountsCount= user.getFollowing().size();
        this.kweetsCount = user.getKweets().size();
        this.mentionCount = user.getMentions().size();
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public int getFollowingAccountsCount() {
        return followingAccountsCount;
    }

    public void setFollowingAccountsCount(int followingAccountsCount) {
        this.followingAccountsCount = followingAccountsCount;
    }

    public int getFollowersAccountsCount() {
        return followersAccountsCount;
    }

    public void setFollowersAccountsCount(int followersAccountsCount) {
        this.followersAccountsCount = followersAccountsCount;
    }

    public int getKweetsCount() {
        return kweetsCount;
    }

    public void setKweetsCount(int kweetsCount) {
        this.kweetsCount = kweetsCount;
    }

    public int getMentionCount() {
        return mentionCount;
    }

    public void setMentionCount(int mentionCount) {
        this.mentionCount = mentionCount;
    }
    
    
    
    
    

}
