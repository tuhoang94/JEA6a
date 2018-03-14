/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import domain.Role;
import domain.User;
import java.util.ArrayList;
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
public class UserDAOTest {

    String aPF = "ProfilePhoto1";
    Long aID = 123l;
    String aName = "Jaap";
    String aPsswd = "abcd";
    Role aRole = Role.USER;
    User a = new User(aRole, aName, aPsswd, aPF);

    String bPF = "ProfilePhoto2";
    Long bID = 8879l;
    String bName = "Piet";
    String bPsswd = "1234";
    Role bRole = Role.USER;
    User b = new User(bRole, bName, bPsswd, bPF);

    String cPF = "ProfilePhoto3";
    Long cID = 877767l;
    String cName = "Karel";
    String cPsswd = "defg";
    Role cRole = Role.USER;
    User c = new User(cRole, cName, cPsswd, cPF);

    String dPF = "ProfilePhoto4";
    Long dID = 22343l;
    String dName = "Henk";
    String dPsswd = "678";
    Role dRole = Role.USER;
    User d = new User(dRole, dName, dPsswd, dPF);
    UserDAO udao = new UserDAOImpl();

    public UserDAOTest() {
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
     * Test of GetUserById method, of class UserDAO.
     */
    @Test
    public void testGetUserById() {
        assertEquals(udao.GetUserById(aID).getID(), a.getID());
    }

    @Test
    public void testGetUserByName() {
        assertEquals(udao.GetUserByUsername(aName).getID(), a.getID());
    }

    /**
     * Test of AddUser method, of class UserDAO.
     */
    @Test
    public void testAddUserGetAllUsers() {
        udao.AddUser(a);
        udao.AddUser(b);
        assertEquals(udao.GetAllUsers().size(), 2);
    }

    /**
     * Test of AddFollowing method, of class UserDAO.
     */
    @Test
    public void testAddFollowing() {
      //  udao.AddFollowing(a, b);
        a.addFollowing(b);

    }

    /**
     * Test of RemoveFollowing method, of class UserDAO.
     */
    @Test
    public void testRemoveFollowing() {
       // udao.RemoveFollowing(a, b);
        a.removeFollowing(b);
        assertEquals(a.getFollowing().size(), 0);

    }

    /**
     * Test of DeleteUser method, of class UserDAO.
     */
    @Test
    public void testDeleteUser() {
        udao.DeleteUser(b);
        assertEquals(udao.GetAllUsers().size(), 1);
    }

//    public class UserDAOImpl implements UserDAO {
//
//        public List<User> GetAllUsers() {
//            return null;
//        }
//
//        public User GetUserById(int id) {
//            return null;
//        }
//
//        public void AddUser(User user) {
//        }
//
//        public void DeleteUser(User user) {
//        }
//
//        public void EditUsername(User user) {
//        }
//
//        public void AddFollowing(User user, User userFollowing) {
//        }
//
//        public void RemoveFollowing(User user, User userUnfollowing) {
//        }
//    }
}
