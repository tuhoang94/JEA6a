/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Ronal
 */
@Entity
@Table(name = "user")
@NamedQueries({
    @NamedQuery(
            name = "User.findAll",
            query = "SELECT u FROM User u"
    )
    ,
    @NamedQuery(
            name = "User.findById",
            query = "SELECT u FROM User u where u.id=:id"
    )
    ,
    @NamedQuery(
            name = "User.findByName",
            query = "SELECT u FROM User u WHERE u.username=:username"
    )
}
)

public class User {

    @Id @GeneratedValue
    @Column(name = "uid")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @OneToOne(mappedBy = "user")
    private Page pageInfo;
    @Column(name = "profilephoto")
    private String profilePhoto;
    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(
            name = "user_followsusers",
            joinColumns = @JoinColumn(
                    name = "user",
                    referencedColumnName = "uid"),
            inverseJoinColumns = @JoinColumn(
                    name = "followsuser",
                    referencedColumnName = "uid"
            )
    )
    private List<User> followingAccounts = new ArrayList<>();
    @ManyToMany(mappedBy = "followingAccounts")
    private List<User> followersAccounts = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private List<Kweet> kweets = new ArrayList<>();
    @ManyToMany(mappedBy = "mentions")
    private List<Kweet> mentions = new ArrayList<>();

    public User(){
        
    }
    
    public User(Role role, String username, String password, String profilePhoto) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.profilePhoto = profilePhoto;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getID() {
        return id;
    }

    public void SetID(Long id) {
        this.id = id;
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

    public Page getPage() {
        return pageInfo;
    }

    public void setPage(Page page) {
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

    public void likeKweet(Kweet kweet) {
        kweet.getLikedAccounts().add(this);
    }

    public void createKweet(Kweet k) {
        this.kweets.add(k);
    }

    public List<User> getFollowers() {
        return this.followersAccounts;
    }

    public List<User> getFollowing() {
        return this.followingAccounts;
    }

    public void addFollower(User user) {
        if (!this.followersAccounts.contains(user)) {
            this.followersAccounts.add(user);
        }
    }

    public void addFollowing(User user) {
        if (!this.followingAccounts.contains(user)) {
            this.followingAccounts.add(user);
        }
    }

    public void removeFollowing(User user) {
        this.followingAccounts.remove(user);
    }

    public void removeFollower(User user) {
        this.followersAccounts.remove(user);
    }

    public List<Kweet> getMentions() {
        return mentions;
    }

    public void setMentions(List<Kweet> mentions) {
        this.mentions = mentions;
    }

    public void addMention(Kweet k) {
        this.mentions.add(k);
    }

}
