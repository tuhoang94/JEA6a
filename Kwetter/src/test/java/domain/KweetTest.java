/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeroe
 */
public class KweetTest {

    Long aid = 123l;
    Long kid = 456l;
    Date kd = new Date();
    User a = new User(aid, Role.USER, "aUsername", "aPassword", "aProfilePhoto");
    Kweet k = new Kweet(kid, "test123", kd, a);
    Long cid = 888l;
    User c = new User(cid, Role.USER, "cUsername", "cPassword", "cProfilePhoto");

    public KweetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Kweet.
     */
    @Test
    public void testGetId() {
        assertEquals(k.getId(), kid);
    }

    /**
     * Test of setId method, of class Kweet.
     */
    @Test
    public void testSetId() {
        Long i = 98l;
        k.setId(i);
        assertEquals(k.getId(), i);
    }

    /**
     * Test of getMessage method, of class Kweet.
     */
    @Test
    public void testGetMessage() {
        assertEquals(k.getMessage(), "test123");
    }

    /**
     * Test of setMessage method, of class Kweet.
     */
    @Test
    public void testSetMessage() {
        k.setMessage("hallo");
        assertEquals(k.getMessage(), "hallo");
    }

    /**
     * Test of getDate method, of class Kweet.
     */
    @Test
    public void testGetDate() {
        assertEquals(k.getDate(), kd);
    }

    /**
     * Test of setDate method, of class Kweet.
     */
    @Test
    public void testSetDate() {
        Date d = new Date();
        k.setDate(d);
        assertEquals(k.getDate(), d);
    }

    /**
     * Test of getUser method, of class Kweet.
     */
    @Test
    public void testGetUser() {
        assertEquals(k.getUser().getID(), aid);
    }

    /**
     * Test of setUser method, of class Kweet.
     */
    @Test
    public void testSetUser() {
        Long bid = 666l;
        User b = new User(bid, Role.USER, "bUsername", "bPassword", "bProfilePhoto");
        k.setUser(b);
        assertEquals(k.getUser().getID(), bid);
    }

    /**
     * Test of setLikedAccounts method, of class Kweet.
     */
    @Test
    public void testSetLikedAccounts() {
        System.out.println("setLikedAccounts");
        List<User> likedAccounts = null;
        Kweet instance = null;
        instance.setLikedAccounts(likedAccounts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLike method, of class Kweet.
     */
    @Test
    public void testAddLikeAndGetLiked() {

        k.addLike(c);
        assertEquals(k.getLikedAccounts().size(), 1);
    }

    /**
     * Test of removeLike method, of class Kweet.
     */
    @Test
    public void testRemoveLike() {
        k.removeLike(c);
        assertEquals(k.getLikedAccounts().size(), 0);
    }

    /**
     * Test of setMentions method, of class Kweet.
     */
    @Test
    public void testSetMentionsAndGetMentions() {
        List<User> ls = new ArrayList<>();
        ls.add(c);
        k.setMentions(ls);
        assertEquals(k.getMentions().size(), 1);
    }

    /**
     * Test of getHashtags method, of class Kweet.
     */
    @Test
    public void testGetHashtags() {
        List<Hashtag> ls = new ArrayList<>();
        Hashtag ht = new Hashtag(123l, "hallo");
        ls.add(ht);
        k.setHashtags(ls);
        assertEquals(k.getHashtags().size(), 1);
    }

    /**
     * Test of addHashtag method, of class Kweet.
     */
    @Test
    public void testAddHashtag() {
        Hashtag p = new Hashtag(999l, "oppop");
        k.addHashtag(p);
        assertEquals(k.getHashtags().size(), 2);
    }

    /**
     * Test of addMention method, of class Kweet.
     */
    @Test
    public void testAddMention() {
        Long did = 889l;
        User d = new User(did, Role.USER, "dUsername", "dPassword", "dProfilePhoto");
        k.addMention(d);
        assertEquals(k.getMentions().size(), 2);
    }



}
