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
public class TumbuhanTest {
    
    public TumbuhanTest() {
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
     * Test of Reaction method, of class Tumbuhan.
     */
    @Test
    public void testReaction() {
        System.out.println("Reaction");
        MakhlukHidup m = null;
        Tumbuhan instance = new Tumbuhan();
        instance.Reaction(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
