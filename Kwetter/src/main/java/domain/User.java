/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronal
 */
public class User{
    
    private Long id;
    private Role role;
    private String username;
    private String password;
    private Page pageInfo;
    
    private String profilePhoto;
    private List<User> followingAccounts = new ArrayList<>();
    private List<User> followersAccounts = new ArrayList<>();
    private List<Kweet> kweets = new ArrayList<>();
    private List<Kweet> mentions = new ArrayList<>();
    

    public User(Long id, Role role, String username, String password, String profilePhoto) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.password = password;
        this.profilePhoto = profilePhoto;
    }
    
    public Long getID(){
        return id;
    }
    
    public void SetID(Long id){
        this.id  =id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
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
    
    public Page getPage(){
        return pageInfo;
    }
    
    public void setPage(Page page){
        this.pageInfo = page;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public List<Kweet> getKweets() {
        return kweets;
    }

    public void setKweets(List<Kweet> kweets) {
        this.kweets = kweets;
    }

    public void likeKweet(Kweet kweet)
    {
        kweet.getLikedAccounts().add(this);
    }
    
    public void createKweet(Kweet k)
    {
        this.kweets.add(k);
    }
    
   public List<User> getFollowers()
   {
       return this.followersAccounts;
   }
   
   public List<User> getFollowing()
   {
       return this.followingAccounts;
   }
   
   public void addFollower(User user)
   {
       if(!this.followersAccounts.contains(user)){
            this.followersAccounts.add(user);
       }
   }
   
   public void addFollowing(User user)
   {
       if(!this.followingAccounts.contains(user)){
            this.followingAccounts.add(user);
       }
   }
   
   public void removeFollowing(User user){
       this.followingAccounts.remove(user);
   }
   
   public void removeFollower(User user){
       this.followersAccounts.remove(user);
   }

    public List<Kweet> getMentions() {
        return mentions;
    }

    public void setMentions(List<Kweet> mentions) {
        this.mentions = mentions;
    }
   
   public void addMention(Kweet k){
       this.mentions.add(k);
   }


    
    
    
    
}
