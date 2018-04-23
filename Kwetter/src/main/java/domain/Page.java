/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.enterprise.inject.Model;
import javax.persistence.*;

/**
 *
 * @author Ronal
 */
@Table(name = "page")
@Entity
@Model
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    Long id;
    @Column(name = "bio")
    String bio;
    @Column(name = "location")
    String location;
    @Column(name = "website")
    String website;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    User user;

    public Page(Long id, String bio, String location, String website) {
        this.id = id;
        this.bio = bio;
        this.location = location;
        this.website = website;
    }

    public Page(String bio, String location, String website, User user) {
        this.bio = bio;
        this.location = location;
        this.website = website;
        this.user=user;
    }


    public Page() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
