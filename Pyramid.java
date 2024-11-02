//Taryn Boonpongmanee
//Pyramid

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		//make variables
		//coordinates for starting point
		double xCenter = getWidth();
		double yBottom = getHeight() - BRICK_HEIGHT;
		int numOfRows = BRICKS_IN_BASE;
		
		//make rows of bricks for the number of rows in the pyramid
		for(int j = 0; j < numOfRows; j++) {
			//the row that the loop is on
			int layerNumber = numOfRows - j;
			//change the position of each row
			double yPosition = yBottom - j * BRICK_HEIGHT;
			double xPosition = (xCenter - (layerNumber*BRICK_WIDTH))/2;
			
			//make one row of bricks
			for(int i = 0; i < layerNumber; i++) {
				//make one brick
				GRect oneBrick = new GRect(xPosition + i * BRICK_WIDTH, yPosition, BRICK_WIDTH, BRICK_HEIGHT);
				oneBrick.setColor(Color.BLACK);
				add(oneBrick);
			}
		}
}

}
	


