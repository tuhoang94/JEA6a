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
    List<User> aFollowing = new ArrayList<>();
    List<User> aFollowers = new ArrayList<>();
    List<Kweet> aOwnKweets = new ArrayList<>();
    List<Kweet> aMentions = new ArrayList<>();
    int aID = 1;
    String aName = "Jaap";
    String aPsswd = "abcd";
    Role aRole = Role.USER;
    User a = new User(aPF, aFollowing, aFollowers, aOwnKweets, aMentions, aID, aName, aPsswd, aRole);

    String bPF = "ProfilePhoto2";
    List<User> bFollowing = new ArrayList<>();
    List<User> bFollowers = new ArrayList<>();
    List<Kweet> bOwnKweets = new ArrayList<>();
    List<Kweet> bMentions = new ArrayList<>();
    int bID = 2;
    String bName = "Piet";
    String bPsswd = "1234";
    Role bRole = Role.USER;
    User b = new User(bPF, bFollowing, bFollowers, bOwnKweets, bMentions, bID, bName, bPsswd, bRole);
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
     * Test of GetAllUsers method, of class UserDAO.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("GetAllUsers");
        UserDAO instance = new UserDAOImpl();
        List<User> expResult = null;
        List<User> result = instance.GetAllUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUserById method, of class UserDAO.
     */
    @Test
    public void testGetUserById() {
        System.out.println("GetUserById");
        int id = 0;
        UserDAO instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.GetUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddUser method, of class UserDAO.
     */
    @Test
    public void testAddUser() {
        udao.AddUser(a);
        List<User> users = new ArrayList<>();
        users.add(a);
        udao.AddUser(a);
        assertEquals(udao.GetAllUsers().size(), users.size());
    }

    /**
     * Test of AddFollowing method, of class UserDAO.
     */
    @Test
    public void testAddFollowing() {
        udao.AddFollowing(a, b);
        a.addFollowing(b);
        
    }

    /**
     * Test of RemoveFollowing method, of class UserDAO.
     */
    @Test
    public void testRemoveFollowing() {
        udao.RemoveFollowing(a, b);
        a.removeFollowing(b);
        assertEquals(a.getFollowing().size(), 0);

    }

    /**
     * Test of DeleteUser method, of class UserDAO.
     */
    @Test
    public void testDeleteUser() {
        udao.DeleteUser(a);
        assertEquals(udao.GetAllUsers().size(), 0);
    }

    public class UserDAOImpl implements UserDAO {

        public List<User> GetAllUsers() {
            return null;
        }

        public User GetUserById(int id) {
            return null;
        }

        public void AddUser(User user) {
        }

        public void DeleteUser(User user) {
        }

        public void EditUsername(User user) {
        }

        public void AddFollowing(User user, User userFollowing) {
        }

        public void RemoveFollowing(User user, User userUnfollowing) {
        }
    }

}
