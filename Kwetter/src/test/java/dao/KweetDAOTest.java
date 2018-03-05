/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import domain.Role;
import domain.User;
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
public class KweetDAOTest {

    Long aid = 123l;
    Long kid = 456l;
    Date kd = new Date();
    User a = new User(aid, Role.USER, "aUsername", "aPassword", "aProfilePhoto");
    Kweet k = new Kweet(kid, "test123", kd, a);
    Long cid = 888l;
    User c = new User(cid, Role.USER, "cUsername", "cPassword", "cProfilePhoto");
    KweetDAO kdao;

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


    @Test
    public void testAddKweet() {
        kdao.AddKweet(k);
        assertEquals(kdao.GetAllKweets().size(), 1);
    }

    /**
     * Test of GetKweetById method, of class KweetDAO.
     */
    @Test
    public void testGetKweetById() {
        assertEquals(kdao.GetKweetById(kid).getId(), k.getId());
    }

    /**
     * Test of DeleteKweet method, of class KweetDAO.
     */
    @Test
    public void testDeleteKweet() {
        kdao.DeleteKweet(k);
        assertEquals(kdao.GetAllKweets().size(), 0);
    }

    /**
     * Test of AddKweet method, of class KweetDAO.
     */

//    public class KweetDAOImpl {
//
//        Long aid = 123l;
//        Long kid = 456l;
//        Date kd = new Date();
//        User a = new User(aid, Role.USER, "aUsername", "aPassword", "aProfilePhoto");
//        Kweet k = new Kweet(kid, "test123", kd, a);
//        Long cid = 888l;
//        User c = new User(cid, Role.USER, "cUsername", "cPassword", "cProfilePhoto");
//
//        public List<Kweet> GetAllKweets() {
//            return null;
//        }
//
//        public Kweet GetKweetById(int id) {
//            return null;
//        }
//
//        public void DeleteKweet(Kweet kweet) {
//        }
//
//        public void AddKweet(Kweet kweet) {
//        }
//    }

}
