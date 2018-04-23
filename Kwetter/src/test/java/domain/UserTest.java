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
public class UserTest {

    Long aid = 123l;
    User a = new User(aid, Role.BANNED, "aUsername", "aPassword", "aProfilePhoto");
    Long bid = 1234l;
    User b = new User(bid, Role.USER, "bUsername", "bPassword", "bProfilePhoto");
    Long cid = 444l;
    User c = new User(cid, Role.USER, "cUsername", "cPassword", "cProfilePhoto");
    Long kid = 555l;
    Date kd = new Date();
    Kweet k = new Kweet(kid, "test123", a);
    Long oid = 555l;
    Date od = new Date();
    Kweet o = new Kweet(oid, "kkkkaaaalll", c);
    Long wid = 555l;
    Date wd = new Date();
    Kweet w = new Kweet(wid, "iiiooopp", c);

    public UserTest() {
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
     * Test of getID method, of class User.
     */
    @Test
    public void testGetID() {
        assertEquals(a.getID(), aid);
    }

    /**
     * Test of SetID method, of class User.
     */
    @Test
    public void testSetID() {
        Long l = 234l;
        a.SetID(l);
        assertEquals(a.getID(), l);
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        assertEquals(a.getRole(), Role.BANNED);
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        a.setRole(Role.USER);
        assertEquals(a.getRole(), Role.USER);
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        assertEquals(a.getUsername(), "aUsername");
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        a.setUsername("hallo");
        assertEquals(a.getUsername(), "hallo");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        assertEquals(a.getPassword(), "aPassword");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        a.setPassword("lol");
        assertEquals(a.getPassword(), "lol");
    }

    /**
     * Test of getPage method, of class User.
     */
    @Test
    public void testGetPage() {
        System.out.println("getPage");
        User instance = null;
        Page expResult = null;
        Page result = instance.getPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPage method, of class User.
     */
    @Test
    public void testSetPage() {
        Page p = new Page(123l, "pBio", "pLocation", "pWebsite");
        a.setPage(p);
        assertEquals(a.getPage().bio, "pBio");
    }

    /**
     * Test of getProfilePhoto method, of class User.
     */
    @Test
    public void testGetProfilePhoto() {
        assertEquals(a.getProfilePhoto(), "aProfilePhoto");
    }

    /**
     * Test of setProfilePhoto method, of class User.
     */
    @Test
    public void testSetProfilePhoto() {
        a.setProfilePhoto("test");
        assertEquals(a.getProfilePhoto(), "test");
    }

    /**
     * Test of setKweets method, of class User.
     */
    @Test
    public void testSetGetKweets() {
        List<Kweet> kweets = new ArrayList<>();
        kweets.add(k);
        a.setKweets(kweets);
        assertEquals(a.getKweets().size(), 1);
    }

    /**
     * Test of likeKweet method, of class User.
     */
    @Test
    public void testLikeKweet() {
        a.likeKweet(k);
        assertEquals(k.getLikedAccounts().size(), 1);
    }

    /**
     * Test of createKweet method, of class User.
     */
    @Test
    public void testCreateKweet() {
        Long uid = 555l;
        Date ud = new Date();
        Kweet u = new Kweet(uid, "test123", a);
        a.createKweet(u);
        assertEquals(a.getKweets().size(), 2);
    }

    /**
     * Test of getFollowers method, of class User.
     */
    @Test
    public void testGetAddFollowers() {

        a.addFollower(b);
        assertEquals(a.getFollowers().size(), 1);
    }

    /**
     * Test of addFollowing method, of class User.
     */
    @Test
    public void testAddFollowing() {

        a.addFollowing(c);
        assertEquals(a.getFollowing().size(), 1);
    }

    /**
     * Test of removeFollowing method, of class User.
     */
    @Test
    public void testRemoveFollowing() {
        a.removeFollowing(c);
        assertEquals(a.getFollowing().size(), 0);
    }

    /**
     * Test of removeFollower method, of class User.
     */
    @Test
    public void testRemoveFollower() {
        a.removeFollower(b);
        assertEquals(a.getFollowers().size(), 0);
    }

    /**
     * Test of setMentions method, of class User.
     */
    @Test
    public void testSetMentions() {
        List<Kweet> klist = new ArrayList<>();
        klist.add(o);
        assertEquals(klist.size(), 1);
    }



    /**
     * Test of getMentions method, of class User.
     */
    @Test
    public void testGetSetMentions() {
        a.addMention(w);
        assertEquals(a.getMentions().size(), 2);
        
    }

}
