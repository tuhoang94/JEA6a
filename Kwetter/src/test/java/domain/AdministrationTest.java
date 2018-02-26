/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
public class AdministrationTest {

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

    String cPF = "ProfilePhoto1";
    List<User> cFollowing = new ArrayList<>();
    List<User> cFollowers = new ArrayList<>();
    List<Kweet> cOwnKweets = new ArrayList<>();
    List<Kweet> cMentions = new ArrayList<>();
    int cID = 1;
    String cName = "Jaap";
    String cPsswd = "abcd";
    Role cRole = Role.MODERATOR;
    User c = new User(cPF, cFollowing, cFollowers, cOwnKweets, cMentions, cID, cName, cPsswd, cRole);
    
   // Moderator d = new Moderator();

    public AdministrationTest() {
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
     * Test of getAccounts method, of class Administration.
     */
    @Test
    public void testGetUsers() {
 
        List<User> users = new ArrayList<>();
        users.add(a);
        users.add(b);
        users.add(c);
        List<Moderator> mods;
        mods = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        List<Kweet> kweets = new ArrayList<>();
        Administration admin = new Administration(users, mods, kweets, accounts);
        assertEquals(admin.GetUsers().size(), users.size());
//        mods.add(d);
//        Administration adm = new Administration()
//        Administration adm = new Administration(accounts);
//        assertEquals(accounts.size(), adm.getAccounts().size());
    }

}
