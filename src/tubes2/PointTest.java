package tubes2;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PointTest{
	@Test
	public void constructPointZeroPointZero(){
		Point tester = new Point();
		assertTrue("The ordinate is not 0",tester.getOrdinat() == 0);
		assertTrue("The absis is not 0",tester.getAbsis() == 0);
	}

	@Test
	public void constructPointOnePointOne(){
		Point tester = new Point(1,1);
		assertTrue("The ordinat is not 0",tester.getOrdinat() == 1);
		assertTrue("The absis is not 0",tester.getAbsis() == 1);
	}

	@Test
	public void movePoint1UnitInAbsisAnd2UnitInOrdinate() {
		Point tester = new Point();
		tester.geser(1, 2);
		assertTrue("The ordinat is not 2", tester.getOrdinat()==2);
		assertTrue("The ordinat is not 1", tester.getAbsis()==1);
	}

	@Test
	public void setAbsisTo5andSetOrdinatTo7(){
		Point tester = new Point();
		tester.setAbsis(5);
		tester.setOrdinat(7);
		assertTrue("The ordinat is not 2", tester.getAbsis()==5);
		assertTrue("The ordinat is not 1", tester.getOrdinat()==7);
	}
}
