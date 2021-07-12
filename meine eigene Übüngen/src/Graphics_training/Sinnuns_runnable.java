package Graphics_training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public  class Sinnuns_runnable  extends JComponent implements Runnable
{	public double x = 50;
	public Sinnuns_runnable s = new Sinnuns_runnable();;
	@Override
	public void run() 
		{
		Graphics w_Line = s.getGraphics() ;
		while(!Thread.currentThread().isInterrupted() && x<350) 
			{paint(w_Line);
			//System.out.println(x);
			x += 0.001;
			try {
				Thread.sleep(30);
				}
			catch(Exception e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
		}
	public void paint(Graphics ss_Line)
		{Graphics2D shape = (Graphics2D)  ss_Line;	
		Line2D.Double w_line1 = line2dDouble(x);
		ss_Line.setColor(Color.BLUE);
		shape.draw(w_line1);	
		}
	
	public Line2D.Double line2dDouble(double ss_x)
		{Line2D.Double w_line;
		double ss_y;
		
		ss_y = Math.sin(ss_x/20)*50+150;
		Point2D.Double w_point11 = new Point2D.Double(ss_x,ss_y);
		
		ss_y = Math.sin((ss_x+0.001)/20)*50+150;
		Point2D.Double w_point12 = new Point2D.Double(ss_x,ss_y);
		
		w_line = new Line2D.Double(w_point11, w_point12);
		return w_line;	
		}

}
