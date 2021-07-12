package Graphics_training;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class Kurve_Drawing extends JComponent
{	double x_schiebung = 400, y_schiebung = 300;
	//double x=50, y , f=0.02, y0 = 130, phi0= 90;
	double t = 0 , y, x;
	double r = 85, R = 150;
	public void paintComponent(Graphics shape)
		{Graphics2D sinus = (Graphics2D) shape;
		/*
		y = Schwingungsgleichung(y0,f,phi0,x)+150;
		Point2D.Double w_point1 = new Point2D.Double(x,y);
		x += 0.1;
		y0 -= 0.03;
		y = Schwingungsgleichung(y0,f,phi0,x)+150;
		Point2D.Double w_point2 = new Point2D.Double(x,y);
		Line2D.Double line = new Line2D.Double(w_point1, w_point2);
	
		sinus.setColor(Color.red);
		sinus.setStroke(new BasicStroke(2));
		sinus.draw(line);
		sinus.setColor(Color.GRAY);
		sinus.setStroke(new BasicStroke(1));
		sinus.drawLine(25, 150, 650, 150);
		*/
		
		
		
		x = Epicycloid(t,r,R)[0]+x_schiebung;
		y = Epicycloid(t,r,R)[1]+y_schiebung;
		Point2D.Double w_point1 = new Point2D.Double(x,y);
		t += 0.01;
		x = Epicycloid(t,r,R)[0]+x_schiebung;
		y = Epicycloid(t,r,R)[1]+y_schiebung;
		Point2D.Double w_point2 = new Point2D.Double(x,y);
		Line2D.Double line = new Line2D.Double(w_point1, w_point2);
		sinus.setColor(Color.gray);
		sinus.setStroke(new BasicStroke(1));
		sinus.draw(line);
		
		
		}
	
	public double Schwingungsgleichung(double ss_y0, double ss_f, double ss_phi0, double ss_x)
		{double y;
		double w = 2*Math.PI*ss_f;
		y = ss_y0*Math.sin(w*ss_x + ss_phi0);
		return y;	
		}
	
	public double[] sinuskreis(double t) 
		{double[] koordinaten = new double[2];
		double r = Math.sin(t)*150;
		double x = r*Math.cos(2*Math.PI*t);
		double y = r*Math.sin(2*Math.PI*t);
		koordinaten[0] = x;
		koordinaten[1] = y;
		return koordinaten;	
		}
	
	public double[] Blumenkurve(double t) 
		{double[] koordinaten = new double[2];
		double r = 200+Math.sin(40*Math.PI*t)*150;
		double x = r*Math.cos(2*Math.PI*t);
		double y = r*Math.sin(2*Math.PI*t);
		koordinaten[0] = x;
		koordinaten[1] = y;
		return koordinaten;	
		}
	
	public double[] Epicycloid(double t, double r, double R) 
		{double[] koordinaten = new double[2];
		
		double x = (R+r)*Math.cos(t)-r*Math.cos(((R+r)/r)*t);
		double y = (R+r)*Math.sin(t)-r*Math.sin(((R+r)/r)*t);
		koordinaten[0] = x;
		koordinaten[1] = y;
		return koordinaten;	
		}
	
	

}
