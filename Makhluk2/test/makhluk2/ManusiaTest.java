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
public class ManusiaTest {
    
    public ManusiaTest() {
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
     * Test of setMenghindar method, of class Manusia.
     */
    @Test
    public void testSetMenghindar() {
        System.out.println("setMenghindar");
        boolean m = false;
        Manusia instance = new Manusia();
        instance.setMenghindar(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMenghindar method, of class Manusia.
     */
    @Test
    public void testGetMenghindar() {
        System.out.println("getMenghindar");
        Manusia instance = new Manusia();
        boolean expResult = false;
        boolean result = instance.getMenghindar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Reaction method, of class Manusia.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup M = null;
        Manusia instance = new Manusia();
        instance.Reaction(M);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
