/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
        System.out.println("getID");
        User instance = null;
        Long expResult = null;
        Long result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetID method, of class User.
     */
    @Test
    public void testSetID() {
        System.out.println("SetID");
        Long id = null;
        User instance = null;
        instance.SetID(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        User instance = null;
        Role expResult = null;
        Role result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        Role role = null;
        User instance = null;
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("setPage");
        Page page = null;
        User instance = null;
        instance.setPage(page);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfilePhoto method, of class User.
     */
    @Test
    public void testGetProfilePhoto() {
        System.out.println("getProfilePhoto");
        User instance = null;
        String expResult = "";
        String result = instance.getProfilePhoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfilePhoto method, of class User.
     */
    @Test
    public void testSetProfilePhoto() {
        System.out.println("setProfilePhoto");
        String profilePhoto = "";
        User instance = null;
        instance.setProfilePhoto(profilePhoto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKweets method, of class User.
     */
    @Test
    public void testGetKweets() {
        System.out.println("getKweets");
        User instance = null;
        List<Kweet> expResult = null;
        List<Kweet> result = instance.getKweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKweets method, of class User.
     */
    @Test
    public void testSetKweets() {
        System.out.println("setKweets");
        List<Kweet> kweets = null;
        User instance = null;
        instance.setKweets(kweets);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of likeKweet method, of class User.
     */
    @Test
    public void testLikeKweet() {
        System.out.println("likeKweet");
        Kweet kweet = null;
        User instance = null;
        instance.likeKweet(kweet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createKweet method, of class User.
     */
    @Test
    public void testCreateKweet() {
        System.out.println("createKweet");
        Kweet k = null;
        User instance = null;
        instance.createKweet(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFollowers method, of class User.
     */
    @Test
    public void testGetFollowers() {
        System.out.println("getFollowers");
        User instance = null;
        List<User> expResult = null;
        List<User> result = instance.getFollowers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFollowing method, of class User.
     */
    @Test
    public void testGetFollowing() {
        System.out.println("getFollowing");
        User instance = null;
        List<User> expResult = null;
        List<User> result = instance.getFollowing();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFollower method, of class User.
     */
    @Test
    public void testAddFollower() {
        System.out.println("addFollower");
        User user = null;
        User instance = null;
        instance.addFollower(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFollowing method, of class User.
     */
    @Test
    public void testAddFollowing() {
        System.out.println("addFollowing");
        User user = null;
        User instance = null;
        instance.addFollowing(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFollowing method, of class User.
     */
    @Test
    public void testRemoveFollowing() {
        System.out.println("removeFollowing");
        User user = null;
        User instance = null;
        instance.removeFollowing(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFollower method, of class User.
     */
    @Test
    public void testRemoveFollower() {
        System.out.println("removeFollower");
        User user = null;
        User instance = null;
        instance.removeFollower(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMentions method, of class User.
     */
    @Test
    public void testGetMentions() {
        System.out.println("getMentions");
        User instance = null;
        List<Kweet> expResult = null;
        List<Kweet> result = instance.getMentions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMentions method, of class User.
     */
    @Test
    public void testSetMentions() {
        System.out.println("setMentions");
        List<Kweet> mentions = null;
        User instance = null;
        instance.setMentions(mentions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMention method, of class User.
     */
    @Test
    public void testAddMention() {
        System.out.println("addMention");
        Kweet k = null;
        User instance = null;
        instance.addMention(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
