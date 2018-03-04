/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
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
public class KweetDAOTest {
    
    public KweetDAOTest() {
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
     * Test of GetAllKweets method, of class KweetDAO.
     */
    @Test
    public void testGetAllKweets() {
        System.out.println("GetAllKweets");
        KweetDAO instance = new KweetDAOImpl();
        List<Kweet> expResult = null;
        List<Kweet> result = instance.GetAllKweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetKweetById method, of class KweetDAO.
     */
    @Test
    public void testGetKweetById() {
        System.out.println("GetKweetById");
        int id = 0;
        KweetDAO instance = new KweetDAOImpl();
        Kweet expResult = null;
        Kweet result = instance.GetKweetById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteKweet method, of class KweetDAO.
     */
    @Test
    public void testDeleteKweet() {
        System.out.println("DeleteKweet");
        Kweet kweet = null;
        KweetDAO instance = new KweetDAOImpl();
        instance.DeleteKweet(kweet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddKweet method, of class KweetDAO.
     */
    @Test
    public void testAddKweet() {
        System.out.println("AddKweet");
        Kweet kweet = null;
        KweetDAO instance = new KweetDAOImpl();
        instance.AddKweet(kweet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetKweetByMentionId method, of class KweetDAO.
     */
    @Test
    public void testGetKweetByMentionId() {
        System.out.println("GetKweetByMentionId");
        long mentionId = 0L;
        KweetDAO instance = new KweetDAOImpl();
        List<Kweet> expResult = null;
        List<Kweet> result = instance.GetKweetByMentionId(mentionId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetKweetByHashtagId method, of class KweetDAO.
     */
    @Test
    public void testGetKweetByHashtagId() {
        System.out.println("GetKweetByHashtagId");
        long hastagId = 0L;
        KweetDAO instance = new KweetDAOImpl();
        List<Kweet> expResult = null;
        List<Kweet> result = instance.GetKweetByHashtagId(hastagId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetKweetsByUser method, of class KweetDAO.
     */
    @Test
    public void testGetKweetsByUser() {
        System.out.println("GetKweetsByUser");
        long userId = 0L;
        KweetDAO instance = new KweetDAOImpl();
        List<Kweet> expResult = null;
        List<Kweet> result = instance.GetKweetsByUser(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class KweetDAOImpl implements KweetDAO {

        public List<Kweet> GetAllKweets() {
            return null;
        }

        public Kweet GetKweetById(int id) {
            return null;
        }

        public void DeleteKweet(Kweet kweet) {
        }

        public void AddKweet(Kweet kweet) {
        }

        public List<Kweet> GetKweetByMentionId(long mentionId) {
            return null;
        }

        public List<Kweet> GetKweetByHashtagId(long hastagId) {
            return null;
        }

        public List<Kweet> GetKweetsByUser(long userId) {
            return null;
        }
    }
    
}
