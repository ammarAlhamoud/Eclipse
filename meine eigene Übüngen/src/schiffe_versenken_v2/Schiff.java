package schiffe_versenken_v2;

import java.util.ArrayList;

public class Schiff {
	private int x_bug, y_bug, laenge;
	private boolean is_versenkt=false, is_getroffen=false, is_mehrmals_getroffen=false;;
	private char ausrichtung; // H=horizontal V=vertikal
	
	private static int last_schussergebnis;
	private  ArrayList<Schiffteil> lst_schiffteil = new ArrayList<>();
	
	public Schiff(int ss_x, int ss_y, char ss_aurichtung, int ss_laenge) {
		x_bug=ss_x;
		y_bug=ss_y;
		ausrichtung=ss_aurichtung;
		laenge=ss_laenge;
		
		for(int i=0;i<laenge;i++)	
		{	if(ausrichtung=='V')	lst_schiffteil.add(new Schiffteil(x_bug, y_bug+i));
			if(ausrichtung=='H')	lst_schiffteil.add(new Schiffteil(x_bug+i, y_bug));
		}
	}
	
	public void set_schuss(int ss_x_Schuss, int ss_y_Schuss) {
		int z_getroffen=0;
		is_getroffen=false;
		is_mehrmals_getroffen=false;

		for(Schiffteil i_schiffteil:lst_schiffteil)	
		{if(i_schiffteil.is_getroffen())
			{z_getroffen++;	
				if(i_schiffteil.is_mehrmals_getroffen(ss_x_Schuss, ss_y_Schuss))
				{	is_mehrmals_getroffen=true;
				}
			}
			if( ! i_schiffteil.is_getroffen())
			{	i_schiffteil.set_schuss(ss_x_Schuss, ss_y_Schuss);
				if(i_schiffteil.is_getroffen()) 
				{	is_getroffen=true;
					z_getroffen++;
				}
			}
		}
		if(z_getroffen==laenge) 
		{	is_versenkt=true;
		}
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
	
	public int get_last_schussergebnis() {
		return last_schussergebnis;
	}
	
	public int get_x_bug() {
		return x_bug;
	}

	public int get_y_bug() {
		return y_bug;
	}
	
	public char get_ausrichtung() {
		return ausrichtung;
	}
	
	public int get_laenge() {
		return laenge;
	}
	
}
