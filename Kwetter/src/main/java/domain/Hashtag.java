/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.enterprise.inject.Model;
import javax.persistence.*;

import javax.persistence.Id;

/**
 *
 * @author Ronal
 */
@Entity @Model
@Table(name = "hashtag")
public class Hashtag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hid")
    private long id;
    @Column(name = "tag")
    private String tag;

    public Hashtag(long id, String tag) {
        this.tag = tag;
        this.id = id;
    }

    public Hashtag() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
