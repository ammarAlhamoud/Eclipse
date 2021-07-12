package Graphics_training;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Basis {

	public static void main (String[] args) {
		JFrame window = new JFrame();
		window.setSize(400,400);
		window.setTitle("my first graphics project");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		//window.setLayout(new BorderLayout(1,1));
		
		drawing d = new drawing();
		window.add(d);
		
		//SinusLine sinusline = new SinusLine();
		//window.add(sinusline);
	}

}
