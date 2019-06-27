package eightball;

import java.awt.Color;
import java.awt.Font;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Magiceightball2 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prompting and generating answer
		ArgsProcessor ap = new ArgsProcessor(args);
		String ans= ap.nextString("Ask a yes or no question");
		double num = Math.random();
		
		
		//make ball 
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledCircle(0.5, 0.5, 0.48);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.475);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledCircle(0.5, 0.5, 0.465);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.5, 0.5, 0.46);
		
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		
		
		num=num*8;
		if (num<1) {
			answer("YES");
		}
		else if (num<2) {
			answer("NO.");
		}
		else if (num<3) {
			answer("MAYBE");
		}
		else if (num<4) {
			answer("SIGNS POINT TO YES");
		}
		else if (num<5) {
			answer ("ASK AGAIN LATER");
		}
		else if (num<6) {
			answer ("MAYBE NEXT TIME");
		}
		else if (num <7) {
			answer ("IT IS CERTAIN");
		}
		else if (num <8) {
			answer ("IT IS UNLIKELY");
		}
		
	}
		
		private static Color Color(int i, int j, int k, double d) {
		// TODO Auto-generated method stub
		return null;
	}

		//make triangle method
		public static void answer(String print) {
			
			
			Font font = new Font("Calibri", Font.BOLD, 10);
			Font font2 = new Font("Calibri", Font.BOLD, 11);
			Font font3= new Font("Calibri", Font.BOLD, 12);
			Font font4 = new Font("Calibri", Font.BOLD,13);
			Font font5 = new Font("Calibri", Font.BOLD, 14);
			Font font6 = new Font("Calibri", Font.BOLD, 15);
			
			
			
			for (int i=0; i<20; i++) {
			StdDraw.setPenColor(Color.BLUE);
			double[]x= {0.5, 0.45, 0.55};
			double []y= {0.53,0.47, 0.47};
			StdDraw.filledPolygon(x, y);
			StdDraw.setPenColor(Color.white);
			StdDraw.setFont(font);
			StdDraw.text(0.5, 0.5, print);
			
			StdDraw.pause(200);
			StdDraw.setPenColor(Color.black);
			double[]x2= {0.5, 0.45, 0.55};
			double []y2= {0.53,0.47, 0.47};
			StdDraw.filledPolygon(x2, y2);
			StdDraw.setPenColor(Color.white);
			StdDraw.setFont(font2);
			StdDraw.text(0.5, 0.5, print);
			
			StdDraw.pause(100);
			StdDraw.setPenColor(Color.GRAY);
			StdDraw.setFont(font3);
			StdDraw.text(0.5, 0.5, print);
			
			StdDraw.pause(100);
			StdDraw.setPenColor(Color.DARK_GRAY);
			StdDraw.setFont(font5);
			StdDraw.text(0.5, 0.5, print);
			
			
			}
			
			StdDraw.pause(200);
			Color blue1=new Color(0,0,40);
			StdDraw.setPenColor(blue1);
			double[]x3= {0.5, 0.45, 0.55};
			double []y3= {0.53,0.47, 0.47};
			StdDraw.filledPolygon(x3, y3);
			StdDraw.setPenColor(Color.white);
			StdDraw.setFont(font4);
			StdDraw.text(0.5, 0.5, print);
			
			StdDraw.pause(200);
			Color blue2=new Color(0,0,42);
			StdDraw.setPenColor(blue2);
			double[]x4= {0.5, 0.45, 0.55};
			double []y4= {0.53,0.47, 0.47};
			StdDraw.filledPolygon(x4, y4);
			StdDraw.setPenColor(Color.white);
			StdDraw.setFont(font5);
			StdDraw.text(0.5, 0.5, print);
			
			StdDraw.pause(200);
			Color blue3=new Color(0,0,47);
			StdDraw.setPenColor(blue3);
			double[]x5= {0.5, 0.4, 0.6};
			double []y5= {0.7,0.4, 0.4};
			StdDraw.filledPolygon(x5, y5);
			StdDraw.setPenColor(Color.white);
			StdDraw.setFont(font6);
			StdDraw.text(0.5, 0.5, print);
			
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.filledCircle(0.5, 0.5, 0.2);
			StdDraw.setPenColor(blue1);
			double[]x6= {0.5, 0.3, 0.7};
			double []y6= {0.5,0.3, 0.7};
			StdDraw.filledPolygon(x6, y6);
			StdDraw.setPenColor(Color.white);
			StdDraw.setFont(font6);
			StdDraw.text(0.5, 0.5, print);
	
		
	}

}

