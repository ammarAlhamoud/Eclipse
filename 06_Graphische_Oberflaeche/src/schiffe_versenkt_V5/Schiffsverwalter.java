package schiffe_versenkt_V5;

import java.util.ArrayList;
public class Schiffsverwalter 
{private int schiff_laenge,
			 uboot_länge,
			 kreuzer_laenge,
			 z_schiffe;
		//	 x_max_FeldLength = 9,
		//	 y_max_Feldlength = 9;
public static int z_schusse=0;
public static int last_schuss_ergebnis = 0,
				  z_Schiffe_versenkt = 0;
public static ArrayList<Schiff> lst_schiffe = new ArrayList<Schiff>();
private boolean isKollisionfrei = true,
				is_schiffslage_imFeld = true,
				isSpiel_ende = false;

public Schiffsverwalter (int ss_z_schiffe , int ss_x_max_FeldLength, int ss_y_max_FeldLength)
	{int schiff_x_pos,
		 schiff_y_pos,
		 schiffsart;
	char schiff_ausrichtung = 0;
	z_schiffe = ss_z_schiffe;
	for (int i=0 ; i<z_schiffe; i++)
		{do 
			{schiff_laenge = (int)(Math.random()*10 )%5 + 1;
			schiff_x_pos = (int)(Math.random()* ss_x_max_FeldLength);
			schiff_y_pos = (int)(Math.random()* ss_y_max_FeldLength);
			switch((int)(Math.random()*10) % 2)
				{case 0: schiff_ausrichtung = 'H';break;
				case 1: schiff_ausrichtung = 'V';break;
				}
			isKollisionfrei = isKollisionsfrei(schiff_x_pos, schiff_y_pos, schiff_laenge,schiff_ausrichtung);
			is_schiffslage_imFeld =	is_Schiffslage_im_feld(schiff_x_pos, schiff_y_pos, schiff_laenge,schiff_ausrichtung,
					ss_x_max_FeldLength, ss_y_max_FeldLength);
			}
		while (!isKollisionfrei && is_schiffslage_imFeld);
		schiffsart = (int)((Math.random()*10)+1)%2;
		uboot_länge = 2;
		kreuzer_laenge = schiff_laenge;
		Schiff neuesSchiff;
		switch(schiffsart)
			{case 0: neuesSchiff = new Uboot(schiff_x_pos, schiff_y_pos, uboot_länge ,schiff_ausrichtung);	
					 lst_schiffe.add(neuesSchiff);
			break;
			case 1: neuesSchiff = new Kreuzer(schiff_x_pos, schiff_y_pos,kreuzer_laenge,schiff_ausrichtung);
					lst_schiffe.add(neuesSchiff);
					break;
			
			}
		
		
		}
	}

private  boolean isKollisionsfrei(int ss_neueschiff_x_pos,int ss_neuesschiff_y_pos,
		int ss_neuesschiff_laenge,char ss_neuesschiff_ausrichtung)
	{boolean isKollisionsfrei = true;
	int x_neuesschiff_heck,
		 y_neuesschiff_heck;
	for(Schiff i_schiff : lst_schiffe)
		{switch (ss_neuesschiff_ausrichtung )
			{ case 'H':
				x_neuesschiff_heck = ss_neueschiff_x_pos +  ss_neuesschiff_laenge -1;
				y_neuesschiff_heck = ss_neuesschiff_y_pos;
				if (i_schiff.getX_bug()>=ss_neueschiff_x_pos
						&& i_schiff.getX_bug()<=x_neuesschiff_heck)
					{if (ss_neuesschiff_y_pos == i_schiff.getY_bug())
						{isKollisionsfrei = false;
						}
					else if (i_schiff.getY_bug() <= ss_neuesschiff_y_pos &&
							i_schiff.getY_heck() >= ss_neuesschiff_y_pos )
						{isKollisionsfrei = false;	
						}	
					}
				break;
			
			case 'V' :
				x_neuesschiff_heck = ss_neueschiff_x_pos   ;
				y_neuesschiff_heck = ss_neuesschiff_y_pos + ss_neuesschiff_laenge -1;
				if (i_schiff.getY_bug()>=ss_neuesschiff_y_pos 
						&& i_schiff.getY_bug()<=y_neuesschiff_heck  )
					{if (ss_neueschiff_x_pos == i_schiff.getX_bug())
						{isKollisionsfrei = false;
						}
					else if (i_schiff.getX_bug() <= ss_neueschiff_x_pos &&
							i_schiff.getX_heck() >= ss_neueschiff_x_pos )
						{isKollisionsfrei = false;	
						}	
					}
				break;
				}		
			}	
	return isKollisionsfrei;
	}	

private boolean is_Schiffslage_im_feld(int ss_x_pos, int ss_y_pos, int ss_laenge, char ss_ausrichtung,
		int ss_x_max_FeldLength, int ss_y_max_FeldLength)
	{boolean is_Schiffslage_imFeld = true;
	
	switch (ss_ausrichtung)
		{case 'H' : 
			if ((ss_x_pos+ss_laenge-1) > ss_x_max_FeldLength )
				{is_Schiffslage_imFeld = false;
				}
			break;
		case 'V' : 
			if ((ss_y_pos+ss_laenge-1) > ss_y_max_FeldLength )
				{is_Schiffslage_imFeld = false;
				break;
				}
		}
	return is_Schiffslage_imFeld;	
	}

public void schuss_auf_Schiffe_setzen(int x_schuss, int y_schuss)
	{last_schuss_ergebnis = 0;
	z_Schiffe_versenkt = 0;
	z_schusse +=1;
	for(Schiff i_schiff: lst_schiffe)
		{if(i_schiff.isVersenkt())
			{i_schiff.set_Schuss(x_schuss,y_schuss);
			z_Schiffe_versenkt +=1;
			if(i_schiff.is_schiffsteil_mehrmal_getroffen())
				{last_schuss_ergebnis = 4;		
				}
			}
		else
			{i_schiff.set_Schuss(x_schuss, y_schuss);
			if(i_schiff.is_schiffsteil_getroffen())
				{last_schuss_ergebnis = 1;	
				}
			if(i_schiff.isVersenkt())
				{last_schuss_ergebnis = 3;
				z_Schiffe_versenkt +=1;
				}
			if(i_schiff.is_schiffsteil_mehrmal_getroffen())
				{last_schuss_ergebnis = 2;		
				}		
			}
			
		}
	}
public boolean isSpielende()
	{if (z_Schiffe_versenkt == z_schiffe)
		{isSpiel_ende = true;
		}
	return isSpiel_ende;
	}
	



public void lst_schiff_toString()
	{boolean is_exist = false;
	String druckzeile ="";
	for (int i=0;i<12;i++)
		{System.out.print("\t"+i);		
		}
	System.out.println();
	for(int i=0;i<12;i++)
		{druckzeile += i+ "\t";
		for(int j=0;j<12;j++)
			{is_exist = false;
			for(Schiff i_schiff: lst_schiffe)
				{for(Schiffsteil i_schiffsteil:i_schiff.lst_schiffsteil)
					{if(i_schiffsteil.getX_pos() == i
							& i_schiffsteil.getY_pos() == j)
						{druckzeile += "X"+"\t";
						is_exist = true;
						}		
					}				
				}
			if(!is_exist)
			druckzeile +="."+"\t";
			}	
		druckzeile += "\n";
		
		}
	System.out.print(druckzeile);	
	for(Schiff i_schiff: lst_schiffe)
		{System.out.println("Länge: " + i_schiff.getLaenge() + " "
				+ "Ausrichtung: " + i_schiff.getAusrichtung() + " "
				+ "Schiffsart: " + i_schiff.schiffsart());
		for (int i=0; i<i_schiff.getLaenge();i++)
			{System.out.println("X: " + i_schiff.getLst_schiffsteil().get(i).getX_pos()+ " "
					+ "Y: " + i_schiff.getLst_schiffsteil().get(i).getY_pos());
			}
			
		}
		
	}
}
