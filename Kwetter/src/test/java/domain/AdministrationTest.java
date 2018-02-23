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
    int aID = 1;
    String aName = "Jaap";
    String aPsswd = "abcd";
    Role aRole = Role.USER;
    Account a = new Account(aID, aName, aPsswd, aRole);
    
    int bID = 2;
    String bName = "Piet";
    String bPsswd = "qwerty";
    Role bRole = Role.MODERATOR;
    Account b = new Account(bID, bName, bPsswd, bRole);        
    
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
    public void testGetAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(a);
        accounts.add(b);
        Administration adm = new Administration(accounts);
        assertEquals(accounts.size(), adm.getAccounts().size());
    }
    
}
