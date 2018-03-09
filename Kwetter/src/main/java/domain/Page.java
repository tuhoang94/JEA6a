/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Ronal
 */
public class Page {
    String id;
    String bio;
    String location;
    String website;
    String thema;
    User user;

    public Page(String id, String bio, String location, String website, String thema, User user) {
        this.id = id;
        this.bio = bio;
        this.location = location;
        this.website = website;
        this.thema = thema;
        this.user = user;
    }
    
    
}
