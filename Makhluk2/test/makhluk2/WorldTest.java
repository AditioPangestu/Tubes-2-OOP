/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhluk2;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CXXXV
 */
public class WorldTest {
    
    public WorldTest() {
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
     * Test of initDisplay method, of class World.
     */
    @Test
    public void testInitDisplay() {
        System.out.println("initDisplay");
        World instance = new World();
        instance.initDisplay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDisplay method, of class World.
     */
    @Test
    public void testUpdateDisplay() {
        System.out.println("updateDisplay");
        World instance = new World();
        instance.updateDisplay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMakhluk method, of class World.
     */
    @Test
    public void testUpdateMakhluk() {
        System.out.println("updateMakhluk");
        int i = 0;
        World instance = new World();
        instance.updateMakhluk(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class World.
     */
    @Test
    public void testDraw_3args() {
        System.out.println("draw");
        Point Px = null;
        Point Pc = null;
        char display = ' ';
        World instance = new World();
        instance.draw(Px, Pc, display);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class World.
     */
    @Test
    public void testDraw_Point_char() {
        System.out.println("draw");
        Point Pc = null;
        char display = ' ';
        World instance = new World();
        instance.draw(Pc, display);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class World.
     */
    @Test
    public void testDraw_MakhlukHidup() {
        System.out.println("draw");
        MakhlukHidup m1 = null;
        World instance = new World();
        instance.draw(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initDraw method, of class World.
     */
    @Test
    public void testInitDraw() {
        System.out.println("initDraw");
        MakhlukHidup m1 = null;
        World instance = new World();
        instance.initDraw(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endDraw method, of class World.
     */
    @Test
    public void testEndDraw() {
        System.out.println("endDraw");
        MakhlukHidup m1 = null;
        World instance = new World();
        instance.endDraw(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGameOver method, of class World.
     */
    @Test
    public void testIsGameOver() {
        System.out.println("isGameOver");
        World instance = new World();
        boolean expResult = false;
        boolean result = instance.isGameOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tangkapLayar method, of class World.
     */
    @Test
    public void testTangkapLayar() throws Exception {
        System.out.println("tangkapLayar");
        World instance = new World();
        instance.tangkapLayar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creation method, of class World.
     */
    @Test
    public void testCreation() {
        System.out.println("creation");
        Point P = null;
        char opsi = ' ';
        World instance = new World();
        instance.creation(P, opsi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of killAll method, of class World.
     */
    @Test
    public void testKillAll() {
        System.out.println("killAll");
        World instance = new World();
        instance.killAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aging method, of class World.
     */
    @Test
    public void testAging() {
        System.out.println("aging");
        MakhlukHidup m1 = null;
        World instance = new World();
        instance.aging(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class World.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        World instance = new World();
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resume method, of class World.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        World instance = new World();
        instance.resume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCount method, of class World.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        int c = 0;
        World instance = new World();
        instance.setCount(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class World.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        World instance = new World();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hidup method, of class World.
     */
    @Test
    public void testHidup_Manusia() {
        System.out.println("hidup");
        Manusia m1 = null;
        World instance = new World();
        instance.hidup(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hidup method, of class World.
     */
    @Test
    public void testHidup_Herbivora() {
        System.out.println("hidup");
        Herbivora m1 = null;
        World instance = new World();
        instance.hidup(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hidup method, of class World.
     */
    @Test
    public void testHidup_Karnivora() {
        System.out.println("hidup");
        Karnivora m1 = null;
        World instance = new World();
        instance.hidup(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hidup method, of class World.
     */
    @Test
    public void testHidup_Omnivora() {
        System.out.println("hidup");
        Omnivora m1 = null;
        World instance = new World();
        instance.hidup(m1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hidup method, of class World.
     */
    @Test
    public void testHidup_Tumbuhan() {
        System.out.println("hidup");
        Tumbuhan t1 = null;
        World instance = new World();
        instance.hidup(t1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillDaftar method, of class World.
     */
    @Test
    public void testFillDaftar() {
        System.out.println("fillDaftar");
        MakhlukHidup n = null;
        World instance = new World();
        instance.fillDaftar(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pluck method, of class World.
     */
    @Test
    public void testPluck_MakhlukHidup() {
        System.out.println("pluck");
        MakhlukHidup n = null;
        World instance = new World();
        instance.pluck(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pluck method, of class World.
     */
    @Test
    public void testPluck_int() {
        System.out.println("pluck");
        int i = 0;
        World instance = new World();
        instance.pluck(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sinyal method, of class World.
     */
    @Test
    public void testSinyal() {
        System.out.println("sinyal");
        World instance = new World();
        instance.sinyal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_size method, of class World.
     */
    @Test
    public void testGet_size() {
        System.out.println("get_size");
        World instance = new World();
        int expResult = 0;
        int result = instance.get_size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_count method, of class World.
     */
    @Test
    public void testGet_count() {
        System.out.println("get_count");
        World instance = new World();
        int expResult = 0;
        int result = instance.get_count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_daftar method, of class World.
     */
    @Test
    public void testGet_daftar_0args() {
        System.out.println("get_daftar");
        World instance = new World();
        Vector<MakhlukHidup> expResult = null;
        Vector<MakhlukHidup> result = instance.get_daftar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_daftar method, of class World.
     */
    @Test
    public void testGet_daftar_int() {
        System.out.println("get_daftar");
        int i = 0;
        World instance = new World();
        MakhlukHidup expResult = null;
        MakhlukHidup result = instance.get_daftar(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_size method, of class World.
     */
    @Test
    public void testSet_size() {
        System.out.println("set_size");
        int s = 0;
        World instance = new World();
        instance.set_size(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_count method, of class World.
     */
    @Test
    public void testSet_count() {
        System.out.println("set_count");
        int c = 0;
        World instance = new World();
        instance.set_count(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
