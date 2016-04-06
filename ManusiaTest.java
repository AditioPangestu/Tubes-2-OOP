package tubes2;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ali-pc on 4/6/2016.
 */

public class ManusiaTest {
    Manusia tester;

    @Before
    public void ConstructHuman() {
        tester = new Manusia();
    }

    @Test
    public void TestHumanInheritanceHewan() {
        assertTrue("Human is not Hewan", tester instanceof Hewan);
    }

    @Test
    public void TestHumanConstruction() {
        assertTrue("Human's menghindar is not false", tester.getMenghindar() == false);
    }

    @Test
    public void TestHumanSetToEvade() {
        tester.setMenghindar(true);
        assertTrue("Human is not hunting", tester.getMenghindar() == true);
    }

    @Test
    public void TestReaction(){
        Herbivora H = new Herbivora();

    }


}
