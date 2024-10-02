package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//Purple base
		Color purply = new Color(212, 177, 229);
		StdDraw.setPenColor(purply);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//triangle in middle
		Color teal = new Color(107,193,188);
		StdDraw.setPenColor(teal);
		double[] x = {0.5, 0.3, 0.7};
		double[] y = {0.6, 0.4, 0.4};
		StdDraw.filledPolygon(x, y);
		
		//cicles at the corners
		Color orange = new Color(222,155,54);
		StdDraw.setPenColor(orange);
		StdDraw.filledCircle(.4, .6, .05);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.square(0.5, 0.5, 0.2);
		
	}
}