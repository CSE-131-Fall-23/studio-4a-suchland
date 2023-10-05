package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		System.out.println(shapeType);
		
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();

		boolean isFilled = in.nextBoolean();
		
		double[] parameterX = new double[3];
		double[] parameterY = new double[3];

		double parameterOne = in.nextDouble();
		parameterX[0] = parameterOne;
		double parameterTwo = in.nextDouble();
		parameterY[0] = parameterTwo;
		double parameterThree = in.nextDouble();
		parameterX[1] = parameterThree;
		double parameterFour = in.nextDouble();
		parameterY[1] = parameterFour;
		
		if (in.hasNextDouble())
		{
			parameterX[2] = in.nextDouble();
			parameterY[2] = in.nextDouble();
		}

		Color newColor = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(newColor);
		
		if (shapeType.equals("rectangle"))
		{
			if (isFilled)
			{
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else
			{
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		
		if (shapeType.equals("ellipse"))
		{
			if (isFilled)
			{
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else
			{
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}

		if (shapeType.equals("triangle"))
		{
			if (isFilled)
			{
				StdDraw.filledPolygon(parameterX, parameterY);
			}
			else
			{
				StdDraw.polygon(parameterX, parameterY);
			}
		}

	}
}
