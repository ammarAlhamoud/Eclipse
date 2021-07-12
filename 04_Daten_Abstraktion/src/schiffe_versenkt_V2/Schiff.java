package schiffe_versenkt_V2;

import java.util.ArrayList;
public class Schiff 
{private int x_bug,
			 y_bug,
			 x_heck,
			 y_heck,
			 laenge;
private char ausrichtung ;
private boolean is_versenkt = false,
				is_schiffsteil_mehrmal_getroffen =false,
				is_schiffsteil_getroffen = false;
private  ArrayList<Schiffsteil> lst_schiffsteil = new ArrayList<Schiffsteil>();

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


public void Set_Schuss(int ss_x_schuss , int ss_y_schuss)
	{int z_getroffen = 0;
	is_schiffsteil_mehrmal_getroffen =false;
	is_schiffsteil_getroffen = false;
	for (Schiffsteil i_schiffsteil : lst_schiffsteil)
		{if (i_schiffsteil.isGetroffen())
			{z_getroffen +=1 ;
			if(i_schiffsteil.Is_schiffsteil_mehrmals_getroffen(ss_x_schuss, ss_y_schuss))
				{is_schiffsteil_mehrmal_getroffen =true;				
				}
			}
		else  
			{i_schiffsteil.Set_Schuss(ss_x_schuss, ss_y_schuss);
				if (i_schiffsteil.isGetroffen())
					{is_schiffsteil_getroffen = true;
					z_getroffen +=1 ;
					}		
			}
		}
	if(z_getroffen == laenge) 
		{is_versenkt=true;
		}
	}

public boolean getIs_schiffsteil_mehrmal_getroffen() {
	return is_schiffsteil_mehrmal_getroffen;
}

public boolean getIs_schiffsteil_getroffen() {
	return is_schiffsteil_getroffen;
}

public boolean isVersenkt() 
	{return is_versenkt;
	}

public ArrayList<Schiffsteil> getLst_schiffsteil() {
	return lst_schiffsteil;
}


//Getter und Setter
public int getLaenge() 
	{return laenge;
	}


public char getAusrichtung() 
	{return ausrichtung;
	}


public int getX_bug() 
	{return x_bug;
	}


public int getY_bug() 
	{return y_bug;
	}


public int getX_heck() 
	{return x_heck;
	}


public int getY_heck() 
	{return y_heck;
	}
	
}
