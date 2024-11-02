/*
Taryn Boonpongmanee
10.7.21
This program draws a random time on an analog clock
 */

import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.*;
import acm.util.*;

public class RandomTime extends GraphicsProgram{
	
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run() {
		//find the middle
		double xMiddle = getWidth()/2;
		double yMiddle = getHeight()/2;
		
		//draw the inside and outside rims
		drawClockCircle(Color.blue, 200, xMiddle, yMiddle);
		drawClockCircle(Color.white, 180, xMiddle, yMiddle);
		
		//draw the small and big clock hands
		drawClockHand(xMiddle, yMiddle, 90);
		drawClockHand(xMiddle, yMiddle, 50);
		
		//draw the numbers on the clock
		drawClockNumbers();
		
	}
	
	//draw a clock hand
	public void drawClockHand(double xMiddle, double yMiddle, int size) {
		int angle = rgen.nextInt(0, 360);
		
		GLine clockHand = new GLine(xMiddle, yMiddle, xMiddle + size * Math.sin(angle), yMiddle + size * Math.cos(angle));
		add(clockHand);
	}
	
	//draw a circle for the clock
	public void drawClockCircle(Color color, double radius, double xMiddle, double yMiddle) {
		double clockWidth = xMiddle - radius/2;
		double clockHeight = yMiddle - radius/2;
		
		GOval clockCircle = new GOval(clockWidth, clockHeight, radius, radius);
		clockCircle.setFilled(true);
		clockCircle.setColor(color);
		add(clockCircle);
	}
	
	//draw the numbers on the clock
	public void drawClockNumbers() {
		GLabel numberThree = new GLabel ("3" , getWidth()/2 + 70, getHeight()/2 + 10);
		numberThree.setFont("SansSerif-18");
		numberThree.setColor(Color.black);
		add(numberThree);
		
		GLabel numberSix = new GLabel ("6" , getWidth()/2, getHeight()/2 + 80);
		numberSix.setFont("SansSerif-18");
		numberSix.setColor(Color.black);
		add(numberSix);
		
		GLabel numberNine = new GLabel ("9" , getWidth()/2 - 75, getHeight()/2 + 10);
		numberNine.setFont("SansSerif-18");
		numberNine.setColor(Color.black);
		add(numberNine);
		
		GLabel numberTwelve = new GLabel ("12" , getWidth()/2 - 10, getHeight()/2 - 70);
		numberTwelve.setFont("SansSerif-18");
		numberTwelve.setColor(Color.black);
		add(numberTwelve);
	}
}
