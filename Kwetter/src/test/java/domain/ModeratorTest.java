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
public class ModeratorTest {
    
    public ModeratorTest() {
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
     * Test of deleteKweet method, of class Moderator.
     */
    @Test
    public void testDeleteKweet() {
        System.out.println("deleteKweet");
        Kweet kweet = null;
        Moderator instance = null;
        instance.deleteKweet(kweet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKweets method, of class Moderator.
     */
    @Test
    public void testGetKweets() {
        System.out.println("getKweets");
        Moderator instance = null;
        List<Kweet> expResult = null;
        List<Kweet> result = instance.getKweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class Moderator.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        Moderator instance = null;
        List<User> expResult = null;
        List<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
