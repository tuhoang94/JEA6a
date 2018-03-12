/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.persistence.*;

/**
 *
 * @author Ronal
 */
@Table(name = "page")
@Entity
public class Page {

    @Id
    @Column(name = "pid")
    Long id;
    @Column(name = "bio")
    String bio;
    @Column(name = "location")
    String location;
    @Column(name = "website")
    String website;
    @Column(name = "thema")
    String thema;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "uid")
    User user;

    public Page(Long id, String bio, String location, String website, String thema, User user) {
        this.id = id;
        this.bio = bio;
        this.location = location;
        this.website = website;
        this.thema = thema;
        this.user = user;
    }

    public Page() {

    }

}
