package schiffe_versenkt_V4;

import java.util.ArrayList;
public abstract class  Schiff 
{private int x_bug,
			 y_bug,
			 x_heck,
			 y_heck;
protected int laenge;
private char ausrichtung ;
protected boolean is_versenkt = false;
protected boolean is_schiffsteil_mehrmal_getroffen = false;
protected boolean is_schiffsteil_getroffen = false;
public  ArrayList<Schiffsteil> lst_schiffsteil = new ArrayList<Schiffsteil>();

public Schiff(int ss_x_bug, int ss_y_bug, int ss_laenge, char ss_ausrichtung)
	{x_bug = ss_x_bug;
	y_bug = ss_y_bug;
	laenge = ss_laenge;
	ausrichtung = ss_ausrichtung;
	for (int i = 0 ; i < laenge ; i++)
		{
		switch (ausrichtung)
			{case 'H' : 
				lst_schiffsteil.add(new Schiffsteil(x_bug + i, y_bug));		
				x_heck = x_bug + laenge-1;
				y_heck = y_bug ;
				break;
			case 'V' :
				lst_schiffsteil.add(new Schiffsteil(x_bug, y_bug + i));	
				x_heck = x_bug ; 
				y_heck =y_bug + laenge-1;
				break;
			}
		}
		
	}

public abstract void set_Schuss(int ss_x_schuss , int ss_y_schuss);
	
public boolean isGetroffen() 
	{return is_versenkt;
	}

public boolean isVersenkt() 
	{return is_versenkt;		
	}


public ArrayList<Schiffsteil> getLst_schiffsteil() {
	return lst_schiffsteil;
}



//Getter und Setter
public int getLaenge() {
	return laenge;
}


public char getAusrichtung() {
	return ausrichtung;
}


public int getX_bug() {
	return x_bug;
}


public int getY_bug() {
	return y_bug;
}


public int getX_heck() {
	return x_heck;
}


public int getY_heck() {
	return y_heck;
}


public boolean is_schiffsteil_mehrmal_getroffen() {
	return is_schiffsteil_mehrmal_getroffen;
}


public boolean is_schiffsteil_getroffen() {
	return is_schiffsteil_getroffen;
}

public String schiffsart()
	{return "Boot";
	}

public abstract boolean is_untertaucht();





	
}
