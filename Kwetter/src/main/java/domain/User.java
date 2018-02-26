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
public class User extends Account{
    
    
    private String ProfilePhoto;
    private List<User> FollowingAccounts;
    private List<User> FollowersAccounts;
    private List<Kweet> OwnKweets;
    private List<Kweet> Mentions;
    

    public User(String ProfilePhoto, List<User> FollowingAccounts, List<User> FollowersAccounts, List<Kweet> OwnKweets, List<Kweet> Mentions, int id, String username, String password, Role role) {
        super(id, username, password, role);
        this.ProfilePhoto = ProfilePhoto;
        this.FollowingAccounts = new ArrayList<User>();
        this.FollowersAccounts = new ArrayList<User>();
        this.OwnKweets = new ArrayList<Kweet>();
        this.Mentions = new ArrayList<Kweet>();
    }

    
    
    public void likeKweet(Kweet kweet)
    {
        kweet.getLikedAccounts().add(this);
    }
    
    public Kweet getKwetter(int id)
    {
        //TODO
        return null;
    }
    
    public void createKweet(Kweet k)
    {
        this.OwnKweets.add(k);
    }
    
   public List<User> getFollowers()
   {
       return this.FollowersAccounts;
   }
   
   public List<User> getFollowing()
   {
       return this.FollowingAccounts;
   }
   
   public void addFollower(User user)
   {
       if(!this.FollowersAccounts.contains(user)){
            this.FollowersAccounts.add(user);
       }
   }
   
   public void addFollowing(User user)
   {
       if(!this.FollowingAccounts.contains(user)){
            this.FollowingAccounts.add(user);
       }
   }
   
   public void removeFollowing(User user){
       this.FollowingAccounts.remove(user);
   }
   
   public void removeFollower(User user){
       this.FollowersAccounts.remove(user);
   }


    
    
    
    
}
