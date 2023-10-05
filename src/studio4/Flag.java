package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledRectangle(0.5, 0.5, 0.5 - 0.008, 0.25 + 0.004);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.008);
		StdDraw.rectangle(0.5, 0.5, 0.5 - 0.008, 0.25 + 0.004);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.setPenRadius();
		StdDraw.filledEllipse(0.5, 0.5, 0.125, 0.125);
		
		
		// Cat!
		
		double[] leftEarX = new double[3];
		double[] leftEarY = new double[3];
		
		// Middle
		leftEarX[0] = 0.475;
		leftEarY[0] = 0.62;
		// Tip
		leftEarX[1] = 0.35;
		leftEarY[1] = 0.7;
		// Side connection
		leftEarX[2] = 0.45;
		leftEarY[2] = 0.45;
		
		double[] rightEarX = new double[3];
		double[] rightEarY = new double[3];
		
		//  Middle
		rightEarX[0] = 0.525;
		rightEarY[0] = 0.62;
		// Tip
		rightEarX[1] = 0.65;
		rightEarY[1] = 0.7;
		// Side connection
		rightEarX[2] = 0.55;
		rightEarY[2] = 0.45;
		
		
		StdDraw.filledPolygon(leftEarX, leftEarY);
		StdDraw.filledPolygon(rightEarX, rightEarY);

		
		// Orange
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(0.82, 0.5, 0.145);
		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledEllipse(.86, 0.64, 0.04, 0.02);
		StdDraw.filledEllipse(0.82, 0.65, 0.01, 0.025);
		
		
		// Strawberry
		
		StdDraw.setPenColor(StdDraw.RED);
		
		StdDraw.filledCircle(.18, 0.5, 0.145);
		StdDraw.filledEllipse(0, 0, 0, 0);

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledEllipse(0.18, 0.65, 0.01, 0.025);

	}
}