/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Moderator;
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
public class ModeratorDAOTest {
    
    public ModeratorDAOTest() {
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
     * Test of GetAllModerators method, of class ModeratorDAO.
     */
    @Test
    public void testGetAllModerators() {
        System.out.println("GetAllModerators");
        ModeratorDAO instance = new ModeratorDAOImpl();
        List<Moderator> expResult = null;
        List<Moderator> result = instance.GetAllModerators();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ModeratorDAOImpl implements ModeratorDAO {

        public List<Moderator> GetAllModerators() {
            return null;
        }
    }
    
}
