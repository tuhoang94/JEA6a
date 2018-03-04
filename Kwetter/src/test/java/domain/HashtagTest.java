/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

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
public class HashtagTest {

    Hashtag ht = new Hashtag(123, "abc");

    public HashtagTest() {
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
     * Test of getId method, of class Hashtag.
     */
    @Test
    public void testGetId() {

        assertEquals(ht.getId(), 123);

    }

    /**
     * Test of setId method, of class Hashtag.
     */
    @Test
    public void testSetId() {

        ht.setId(321);
        assertEquals(ht.getId(), 321);
    }

    /**
     * Test of getTag method, of class Hashtag.
     */
    @Test
    public void testGetTag() {
        assertEquals(ht.getTag(), "abc");
    }

    /**
     * Test of setTag method, of class Hashtag.
     */
    @Test
    public void testSetTag() {
        ht.setTag("cba");
        assertEquals(ht.getTag(), "cba");
    }

}
