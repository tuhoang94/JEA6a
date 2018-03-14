/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import domain.Role;
import domain.User;
import javax.persistence.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronal
 */
public class test {

    KweetDAOJPaController kdao = new KweetDAOJPaController();
    UserDAOJpaController udao = new UserDAOJpaController();
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("kwetter");
    private EntityManager em;

    public test() {
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
            udao.setEm(em);
            kdao.setEm(em);

        } catch (Exception ex) {

        }
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAddUserGetAllUsers() {
        try {
            String aPF = "ProfilePhoto1";
            Long aID = 123l;
            String aName = "Jaap";
            String aPsswd = "abcd";
            Role aRole = Role.USER;
            User a = new User(aRole, aName, aPsswd, aPF);
            Kweet k = new Kweet("test123", a);
            Kweet i = new Kweet();
            i.setMessage("hallo");
            em.getTransaction().begin();
            kdao.AddKweet(k);
            udao.AddUser(a);
            em.getTransaction().commit();
            assertEquals(kdao.GetAllKweets().size(), 1);

        } catch (Exception ex) {

        }

    }
}
