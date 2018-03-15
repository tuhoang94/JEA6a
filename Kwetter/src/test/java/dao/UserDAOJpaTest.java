/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class UserDAOJpaTest {

    UserDAOJpaController dao = new UserDAOJpaController();
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("kwetter");
    private EntityManager em;
    private String aPF = "ProfilePhoto1";
    private Long aID = 123l;
    private String aName = "Jaap";
    private String aPsswd = "abcd";
    private Role aRole = Role.USER;
    private User a = new User(aRole, aName, aPsswd, aPF);

    public UserDAOJpaTest() {
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
    public void testAddUser() {

        dao.AddUser(a);
        assertEquals(dao.GetAllUsers().size(), 1);

    }

    @Test
    public void editUser() {
        a.setUsername("FransBauer");
        dao.EditUser(a);
        String s = a.getUsername();
        assertEquals(dao.GetAllUsers().size(), 1);
    }
    

//    @Test
//    public void deleteUser() {
//        dao.DeleteUser(a);
//        assertEquals(dao.GetAllUsers().size(), 0);
//    }
}
