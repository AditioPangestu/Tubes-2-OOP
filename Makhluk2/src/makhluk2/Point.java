package makhluk2;

import java.util.*;

/**
 * A class that represent a point within Cartesian system
 * @author Aditio Pangestu
 */
public class Point {
		/* An attribute to store the absis of the Point */
		private int x;
		/* An attribute to store the ordinate of the Point */
		private int y;
		
		/**
		 * A ctor that construct A Point with cordinate(0,0)
		 */
		public Point(){
			x = 0; y = 0;
		}
		/**
		 * A ctor that construct A Point with a random cordinate that range from 0 to range
		 * @param range is an integer, a range to random
		 */
		public Point(int range){
			Random rand = new Random();
			int value1 = rand.nextInt(range);
			int value2 = rand.nextInt(range);
			x = value1;
			y = value2;
		}
		
		/**
		 * A ctor that construct A Point with absis = _x and ordinate = _y
		 * @param _x is an integer for the absis
		 * @param _y is an integer for the ordinate
		 */
		public Point(int _x, int _y){
			x = _x;
			y = _y;
		}
	
		/**
		 * A member procedure to make a point move tc x+dx and y+dy
		 * @param dx integer for dx
		 * @param dy integer for dy
		 */
		public void geser(int dx, int dy){
			x += dx; y += dy;
		}

		/**
		 * Get the absis of the Point
		 * @return an integer which represent abscissa 
		 */
		public int getAbsis(){
			return x;
		}
		
		/**
		 * Get the ordinate of the Point
		 * @return an integer which represent ordinate
		 */
		public int getOrdinat(){
			return y;
		}

		/**
		 * Set the absis
		 * @param _x is integer of new abscissa
		 */
		public void setAbsis(int _x){
			x = _x;
		}
		
		/**
		 * Set the ordinate
		 * @param _y integer of new ordinate
		 */
		public void setOrdinat(int _y){
			y = _y;
		}

                /**
                 * override toString function
                 * @return the value of x and y in "x y" format as string
                 */
		public String toString()
		{
			return(Integer.toString(x)+" "+Integer.toString(y));
		}
}
