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
     * Test of EditUser method, of class User.
     */
    @Test
    public void testEditUser() {
        //todo
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
     * Test of getKwetter method, of class User.
     */
    @Test
    public void testGetKwetter() {
        System.out.println("getKwetter");
        int id = 0;
        User instance = null;
        Kweet expResult = null;
        Kweet result = instance.getKwetter(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createKweet method, of class User.
     */
    @Test
    public void testCreateKweet() {
        //todo
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
    
}
