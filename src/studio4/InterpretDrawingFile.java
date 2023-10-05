package studio4;

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
		
		String shape = in.next();
		
		int redComponent = in.nextInt();
		
		int greenComponent = in.nextInt(); 
		
		int blueCompenent = in.nextInt(); 
		
		boolean isFilled = in.nextBoolean(); 
		
		double  x = in.nextDouble();
		
		double  y = in.nextDouble();
	
		double halfWidth = in.nextDouble();
		
		double halfHeight = in.nextDouble();
		
		
		if (shape.equals("rectangle")) {
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
		}
		else if (shape.equals("ellipse")) {
			StdDraw.ellipse(x, y, halfWidth, halfHeight);
			
		}
			
	}
}
