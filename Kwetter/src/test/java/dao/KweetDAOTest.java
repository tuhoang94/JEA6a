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
import javax.persistence.*;
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

    private KweetDAOJPaController dao = new KweetDAOJPaController();
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("kwetter");
    private EntityManager em;

    Long aid = 123l;
    Long kid = 456l;
    Date kd = new Date();
    User a = new User(aid, Role.USER, "aUsername", "aPassword", "aProfilePhoto");
    Kweet k = new Kweet(kid, "test123", a);
    Long cid = 888l;
    User c = new User(cid, Role.USER, "cUsername", "cPassword", "cProfilePhoto");

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
        try {
            em = emf.createEntityManager();
            dao.setEm(em);

        } catch (Exception ex) {

        }
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddKweet() {

        dao.AddKweet(k);
        //em.getTransaction().commit();
        assertEquals(dao.GetAllKweets().size(), 1);

    }

    /**
     * Test of GetKweetById method, of class KweetDAO.
     */
    @Test
    public void testGetKweetById() {
        
        Kweet h = dao.GetKweetById(k.getId());
        assertEquals(h.getId(), k.getId());
    }

    /**
     * Test of DeleteKweet method, of class KweetDAO.
     */
    @Test
    public void testDeleteKweet() {
        dao.DeleteKweet(k);
        assertEquals(dao.GetAllKweets().size(), 0);
    }

    /**
     * Test of AddKweet method, of class KweetDAO.
     */
  
}
