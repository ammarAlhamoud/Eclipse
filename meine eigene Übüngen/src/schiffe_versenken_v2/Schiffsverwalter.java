package schiffe_versenken_v2;

import java.util.ArrayList;

public class Schiffsverwalter {
	private static int z_schiffe, schiff_maxlength, x_lengthmax, y_lengthmax;
	
	private static int last_schussergebnis, z_versenkte_schiffe;
	private static ArrayList<Schiff> lst_schiff = new ArrayList<>();
	
	public static void schiffsverwalter(int ss_z_feldmax, int ss_z_schiffe, int ss_schiff_maxlength) {
		z_schiffe = ss_z_schiffe;
		schiff_maxlength =  ss_schiff_maxlength;
		x_lengthmax = ss_z_feldmax;
		y_lengthmax = ss_z_feldmax;
		
		
		for(int i=0; i<z_schiffe; i++)
		{	int w_x_bug, w_y_bug, w_laenge;
			char w_ausrichtung;
			
			do{
				w_laenge = (int)( Math.random() * (schiff_maxlength))+1;
				
				if((int)(Math.random()*2) == 0)
				{	w_ausrichtung = 'V';
					w_x_bug = (int)(Math.random() * (x_lengthmax+1));
					w_y_bug = (int)(Math.random() * (y_lengthmax+1-w_laenge));
				}
				else 
				{	w_ausrichtung = 'H';
					w_x_bug = (int)(Math.random() * (x_lengthmax+1-w_laenge));
					w_y_bug = (int)(Math.random() * (y_lengthmax+1));
				}
			}while(!is_kollisionsfrei(w_x_bug, w_y_bug, w_ausrichtung, w_laenge));
		
			System.out.println(w_x_bug+" "+w_y_bug+" "+w_ausrichtung+" "+w_laenge);
			lst_schiff.add(new Schiff(w_x_bug, w_y_bug, w_ausrichtung, w_laenge));
				
		}
		
		Spielfeld.ausgeben();
		
	}
	
	public static void schuss_auf_schiffe_setzen(int ss_x_schuss, int ss_y_schuss) {
		last_schussergebnis = 0;
		z_versenkte_schiffe=0;
		
		for(Schiff i_schiff:lst_schiff)	
		{		if(i_schiff.is_versenkt())
				{	i_schiff.set_schuss(ss_x_schuss,ss_y_schuss);
					z_versenkte_schiffe++;
					if(i_schiff.is_mehrmals_getroffen())	last_schussergebnis=4;
				}
				else
				{	i_schiff.set_schuss(ss_x_schuss,ss_y_schuss);
					if(i_schiff.is_getroffen()) 		last_schussergebnis=1;
					if(i_schiff.is_versenkt())
					{	last_schussergebnis=3;
						z_versenkte_schiffe++;	
					}
					if(i_schiff.is_mehrmals_getroffen())	last_schussergebnis=2;
				}
				
		}
	}
	
	public static int get_last_schussergebnis() {
		return last_schussergebnis;
	}
	
	public static boolean is_alle_versenkt() {
		boolean is_alle_versenkt=false;
		if(z_schiffe==z_versenkte_schiffe) is_alle_versenkt=true;
		return is_alle_versenkt;
	}
	
	private static boolean is_kollisionsfrei(int w_x_bug, int w_y_bug, char w_ausrichtung, int w_laenge) {
		boolean is_kollisionsfrei=true;
		int w_x_heck, w_y_heck;
		
		if(w_ausrichtung=='H')
		{	w_x_heck = w_x_bug + w_laenge -1;
			w_y_heck = w_y_bug;
		}
		else
		{	w_x_heck = w_x_bug;
			w_y_heck = w_y_bug + w_laenge -1;
		}
		
		
		for(Schiff i_schiff:lst_schiff)	
		{	int i_schiff_x_heck, i_schiff_y_heck;
			if(i_schiff.get_ausrichtung()=='H')
			{	i_schiff_x_heck = i_schiff.get_x_bug() + i_schiff.get_laenge() -1;
				i_schiff_y_heck = i_schiff.get_y_bug();
			}
			else
			{	i_schiff_x_heck = i_schiff.get_x_bug();
				i_schiff_y_heck = i_schiff.get_y_bug() + i_schiff.get_laenge() -1;	
			}
			
			if(	!(i_schiff.get_x_bug() > w_x_heck
				|| i_schiff_x_heck < w_x_bug
				|| i_schiff.get_y_bug() > w_y_heck
				|| i_schiff_y_heck < w_y_bug)
			   )
			{	is_kollisionsfrei=false;
			}
			
		}
		return is_kollisionsfrei;
	}
	
}
