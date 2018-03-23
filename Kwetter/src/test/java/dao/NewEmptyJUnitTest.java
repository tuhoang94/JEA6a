/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Role;
import domain.User;
import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import service.UserService;
import service.UserServiceImpl;

/**
 *
 * @author jeroe
 */
public class NewEmptyJUnitTest {

    @Inject
    UserService us;

    public NewEmptyJUnitTest() {
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
    public void Test() {
        
    User a = new User(Role.USER, "aUsername", "aPassword", "aProfilePhoto");
    us.createUser(a);

    }
    

     }
