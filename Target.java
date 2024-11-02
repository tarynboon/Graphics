//Taryn Boonpongmanee
//Target

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		
		//find the middle of the screen
		double xMiddle = getWidth()/2;
		double yMiddle = getHeight()/2;
		
		//draw three circles
		drawCircle(Color.red, 72, xMiddle, yMiddle);
		drawCircle(Color.white, 46.8, xMiddle, yMiddle);
		drawCircle(Color.red, 21.6, xMiddle, yMiddle);
	}
	
	//draw one circle
	public void drawCircle(Color color, double radius, double xMiddle, double yMiddle) {
		double targetWidth = xMiddle - radius/2;
		double targetHeight = yMiddle - radius/2;
		
		GOval targetCircle = new GOval(targetWidth, targetHeight, radius, radius);
		targetCircle.setFilled(true);
		targetCircle.setColor(color);
		add(targetCircle);
	}
}

