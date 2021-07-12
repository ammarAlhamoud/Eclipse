package schiffe_versenken;

import java.util.ArrayList;

public abstract class Schiff{
	
	protected int x_bug, y_bug, laenge;
	protected boolean is_versenkt=false, is_getroffen=false, is_mehrmals_getroffen=false;
	protected char ausrichtung;
	protected ArrayList<Schiffteil> lst_schiffteil = new ArrayList<>();
	
	public Schiff(int ss_x, int ss_y, char ss_aurichtung, int ss_laenge) {
		x_bug=ss_x;
		y_bug=ss_y;
		ausrichtung=ss_aurichtung;
		laenge=ss_laenge;
		
		Spielfeld.set_laenge(laenge);
		
		for(int i=0;i<laenge;i++)	
		{	if(ausrichtung=='V')	lst_schiffteil.add(new Schiffteil(x_bug, y_bug+i));
			if(ausrichtung=='H')	lst_schiffteil.add(new Schiffteil(x_bug+i, y_bug));
		}
	}
		
	public abstract void set_schuss(int ss_x_Schuss, int ss_y_Schuss);
	
	public boolean is_innerhalb( int ss_x_point, int ss_y_point, char ss_ausrichtung, int ss_laenge) {
		boolean is_innerhalb=false;
		for(Schiffteil i_schiffteil:lst_schiffteil)	
		{	if(i_schiffteil.liegt_auf(ss_x_point, ss_y_point, ss_ausrichtung, ss_laenge))
				is_innerhalb=true;
		}
		return is_innerhalb;
	}
	
	public boolean is_versenkt() {
		return is_versenkt;
	}
	
	public boolean is_getroffen() {
		return is_getroffen;
	}
	
	public boolean is_mehrmals_getroffen() {
		return is_mehrmals_getroffen;
	}

}
