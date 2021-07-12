package Graphics_training;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class SinusLine extends JComponent
	{
	public void paint(Graphics ss_Line, int ss_x, int ss_y)
		{double x1=50, y1,y2;
		Graphics2D shape = (Graphics2D)  ss_Line;
		while(x1<350)
			{y1 = Math.sin(x1/20)*50+150;
			y2 = Math.cos(x1/20)*30+150;
			Point2D.Double w_point11 = new Point2D.Double(x1,y1);
			Point2D.Double w_point21 = new Point2D.Double(x1,y2);
			x1 += 0.001;
			y1 = Math.sin(x1/20)*50+150;
			y2 = Math.cos(x1/20)*30+150;
			Point2D.Double w_point12 = new Point2D.Double(x1,y1);
			Point2D.Double w_point22 = new Point2D.Double(x1,y2);

			Line2D.Double w_line1 = new Line2D.Double(w_point11, w_point12);
			ss_Line.setColor(Color.BLUE);
			shape.draw(w_line1);

			Line2D.Double w_line2 = new Line2D.Double(w_point21, w_point22);
			ss_Line.setColor(Color.RED);
			shape.draw(w_line2);
			}
			
		}

	}
