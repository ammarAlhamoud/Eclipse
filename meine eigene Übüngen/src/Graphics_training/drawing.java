package Graphics_training;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class drawing extends JComponent 
	{public void paintComponent(Graphics g)
		{Graphics2D g2 = (Graphics2D) g;
		Color red = new Color(0,0,255);
		g2.setColor(red);
		Rectangle rect1 = new Rectangle(50,50,200,100);
		g2.fill(rect1);
		
		Ellipse2D ellipse1 = new Ellipse2D.Double(100,250,50,20);
		g2.fill(ellipse1);
		
		Line2D.Double line1 = new Line2D.Double(300,3000,100,50);
		g2.draw(line1);
		
		Point2D.Double p1 = new Point2D.Double(100,350);
		Point2D.Double p2 = new Point2D.Double(200,370);
		Line2D.Double l1 = new Line2D.Double(p1,p2);
		g2.draw(l1);


		}
	
	}
