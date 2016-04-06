/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aditio Pangestu
 */
public class KarnivoraTest {
    
    public KarnivoraTest() {
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
     * Test of setMelambat method, of class Karnivora.
     */
    @Test
    public void testSetMelambat() {
        System.out.println("setMelambat");
        boolean lambat = false;
        Karnivora instance = new Karnivora();
        instance.setMelambat(lambat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeltaKecepatan method, of class Karnivora.
     */
    @Test
    public void testSetDeltaKecepatan() {
        System.out.println("setDeltaKecepatan");
        int delta = 0;
        Karnivora instance = new Karnivora();
        instance.setDeltaKecepatan(delta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMelambat method, of class Karnivora.
     */
    @Test
    public void testGetMelambat() {
        System.out.println("getMelambat");
        Karnivora instance = new Karnivora();
        boolean expResult = false;
        boolean result = instance.getMelambat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeltaKecepatan method, of class Karnivora.
     */
    @Test
    public void testGetDeltaKecepatan() {
        System.out.println("getDeltaKecepatan");
        Karnivora instance = new Karnivora();
        int expResult = 0;
        int result = instance.getDeltaKecepatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prosesMelambat method, of class Karnivora.
     */
    @Test
    public void testProsesMelambat() {
        System.out.println("prosesMelambat");
        Karnivora instance = new Karnivora();
        instance.prosesMelambat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class Karnivora.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup M = null;
        Karnivora instance = new Karnivora();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
