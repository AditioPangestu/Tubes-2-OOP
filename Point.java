import java.util.*;

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
		 * @param an integer, a range to random
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
		 * @param an integer for the absis
		 * @param an integer for the ordinate
		 */
		public Point(int _x, int _y){
			x = _x;
			y = _y;
		}
	
		/**
		 * A member procedure to make a point move tc x+dx and y+dy
		 * @param an integer for dx
		 * @param an integer for dy
		 */
		public void geser(int dx, int dy){
			x += dx; y += dy;
		}

		/**
		 * Get the absis of the Point
		 * @return an integer
		 */
		public int getAbsis(){
			return x;
		}
		
		/**
		 * Get the ordinate of the Point
		 * @return an integer
		 */
		public int getOrdinat(){
			return y;
		}

		/**
		 * Set the absis
		 * @param an integer
		 */
		public void setAbsis(int _x){
			x = _x;
		}
		
		/**
		 * Set the ordinate
		 * @param an integer
		 */
		public void setOrdinat(int _y){
			y = _y;
		}
}
