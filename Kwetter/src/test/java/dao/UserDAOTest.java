/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.User;
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
        long id = 0L;
        UserDAO instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.GetUserById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetUserByUsername method, of class UserDAO.
     */
    @Test
    public void testGetUserByUsername() {
        System.out.println("GetUserByUsername");
        String username = "";
        UserDAO instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.GetUserByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddUser method, of class UserDAO.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        User user = null;
        UserDAO instance = new UserDAOImpl();
        instance.AddUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UserDAO.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        UserDAO instance = new UserDAOImpl();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteUser method, of class UserDAO.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("DeleteUser");
        User user = null;
        UserDAO instance = new UserDAOImpl();
        instance.DeleteUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditUsername method, of class UserDAO.
     */
    @Test
    public void testEditUsername() {
        System.out.println("EditUsername");
        User user = null;
        UserDAO instance = new UserDAOImpl();
        instance.EditUsername(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddFollowing method, of class UserDAO.
     */
    @Test
    public void testAddFollowing() {
        System.out.println("AddFollowing");
        User user = null;
        User userFollowing = null;
        UserDAO instance = new UserDAOImpl();
        instance.AddFollowing(user, userFollowing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveFollowing method, of class UserDAO.
     */
    @Test
    public void testRemoveFollowing() {
        System.out.println("RemoveFollowing");
        User user = null;
        User userUnfollowing = null;
        UserDAO instance = new UserDAOImpl();
        instance.RemoveFollowing(user, userUnfollowing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserDAOImpl implements UserDAO {

        public List<User> GetAllUsers() {
            return null;
        }

        public User GetUserById(long id) {
            return null;
        }

        public User GetUserByUsername(String username) {
            return null;
        }

        public void AddUser(User user) {
        }

        public boolean login(String username, String password) {
            return false;
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
