package schiffe_versenken;

import java.util.ArrayList;

public class Schiffsverwalter {
	private static int z_schiffe, schiff_maxlength;
	
	private static int last_schussergebnis, z_versenkte_schiffe;
	private static ArrayList<Schiff> lst_schiff = new ArrayList<>();
	
	public void schiffe_erzeugen(int ss_z_feldmax, int ss_z_schiffe, int ss_z_uboote, int ss_schiff_maxlength) {
		z_schiffe = ss_z_schiffe;
		schiff_maxlength =  ss_schiff_maxlength;
		
		System.out.println();
		
		for(int i=0; i<z_schiffe; i++)
		{	int w_x_bug, w_y_bug, w_laenge;
			char w_ausrichtung;
			int z_kollision=-1;
			
			do{
				w_laenge = (int)( Math.random() * (schiff_maxlength))+1;
				z_kollision++;
				if((int)(Math.random()*2) == 0)
				{	w_ausrichtung = 'V';
					w_x_bug = (int)(Math.random() * (ss_z_feldmax+1));
					w_y_bug = (int)(Math.random() * (ss_z_feldmax+2-w_laenge));
				}
				else 
				{	w_ausrichtung = 'H';
					w_x_bug = (int)(Math.random() * (ss_z_feldmax+2-w_laenge));
					w_y_bug = (int)(Math.random() * (ss_z_feldmax+1));
				}
			}while(!is_kollisionsfrei(w_x_bug, w_y_bug, w_ausrichtung, w_laenge));
			
			if(ss_z_uboote>0)
			{	lst_schiff.add(new UBoot(w_x_bug, w_y_bug, w_ausrichtung, w_laenge));
				ss_z_uboote--;
				System.out.println(i+1+": UBoot:   "+w_x_bug+" "+w_y_bug+" "+w_ausrichtung+" "+w_laenge+" mit "+z_kollision+" Kollsionen");
			}
			else
			{	lst_schiff.add(new Kreuzer(w_x_bug, w_y_bug, w_ausrichtung, w_laenge));
				System.out.println(i+1+": Kreuzer: "+w_x_bug+" "+w_y_bug+" "+w_ausrichtung+" "+w_laenge+" mit "+z_kollision+" Kollsionen");
			}
				
		}
		
		Spielfeld.ausgeben();
		System.out.println();
	}
	
	public void schuss_auf_schiffe_setzen(int ss_x_schuss, int ss_y_schuss) {
		last_schussergebnis = 0;
		z_versenkte_schiffe = 0;
		
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
	
	public int get_last_schussergebnis() {
		return last_schussergebnis;
	}
	
	public boolean is_alle_versenkt() {
		boolean is_alle_versenkt=false;
		if(z_schiffe==z_versenkte_schiffe) is_alle_versenkt=true;
		return is_alle_versenkt;
	}
	
	//ausrichtung: H horizontal; V vertikal; Q Quadrat
	public boolean is_einBott_in( int ss_x_point, int ss_y_point, char ss_ausrichtung, int ss_laenge) {
		boolean is_einBott_in=false;
		for(Schiff i_schiff:lst_schiff)	
		{	if(i_schiff.is_innerhalb(ss_x_point, ss_y_point, ss_ausrichtung, ss_laenge))
				is_einBott_in=true;
		}
		return  is_einBott_in;
	}
	
	private boolean is_kollisionsfrei(int w_x_bug, int w_y_bug, char w_ausrichtung, int w_laenge) {
		boolean is_kollisionsfrei = true;
		
		for(Schiff i_schiff:lst_schiff)	
		{ 	if(i_schiff.is_innerhalb(w_x_bug, w_y_bug, w_ausrichtung, w_laenge))
				is_kollisionsfrei = false;
		}
		
		return is_kollisionsfrei;
	}
	
}
