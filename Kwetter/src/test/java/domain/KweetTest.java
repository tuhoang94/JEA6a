/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Kweet.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Kweet instance = null;
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Kweet.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Kweet instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Kweet.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Kweet instance = null;
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class Kweet.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        Kweet instance = null;
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Kweet.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Kweet instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Kweet.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Kweet instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Kweet.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Kweet instance = null;
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Kweet.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Kweet instance = null;
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLikedAccounts method, of class Kweet.
     */
    @Test
    public void testGetLikedAccounts() {
        System.out.println("getLikedAccounts");
        Kweet instance = null;
        List<User> expResult = null;
        List<User> result = instance.getLikedAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    public void testAddLike() {
        System.out.println("addLike");
        User user = null;
        Kweet instance = null;
        instance.addLike(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLike method, of class Kweet.
     */
    @Test
    public void testRemoveLike() {
        System.out.println("removeLike");
        User user = null;
        Kweet instance = null;
        instance.removeLike(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMentions method, of class Kweet.
     */
    @Test
    public void testGetMentions() {
        System.out.println("getMentions");
        Kweet instance = null;
        List<User> expResult = null;
        List<User> result = instance.getMentions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMentions method, of class Kweet.
     */
    @Test
    public void testSetMentions() {
        System.out.println("setMentions");
        List<User> mentions = null;
        Kweet instance = null;
        instance.setMentions(mentions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHashtags method, of class Kweet.
     */
    @Test
    public void testGetHashtags() {
        System.out.println("getHashtags");
        Kweet instance = null;
        List<Hashtag> expResult = null;
        List<Hashtag> result = instance.getHashtags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHashtags method, of class Kweet.
     */
    @Test
    public void testSetHashtags() {
        System.out.println("setHashtags");
        List<Hashtag> hashtags = null;
        Kweet instance = null;
        instance.setHashtags(hashtags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHashtag method, of class Kweet.
     */
    @Test
    public void testAddHashtag() {
        System.out.println("addHashtag");
        Hashtag hashtag = null;
        Kweet instance = null;
        instance.addHashtag(hashtag);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMention method, of class Kweet.
     */
    @Test
    public void testAddMention() {
        System.out.println("addMention");
        User mention = null;
        Kweet instance = null;
        instance.addMention(mention);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Kweet.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Kweet k = null;
        Kweet instance = null;
        int expResult = 0;
        int result = instance.compareTo(k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
