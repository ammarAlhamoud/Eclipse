package schiffe_versenkt_V5;

public class Uboot extends Schiff 
	{private boolean is_untertaucht = false;
	private int z_Tauch = 0;
	private int z_Tauch_aenderung = 0;
	public Uboot(int ss_x_bug, int ss_y_bug, int ss_laenge, char ss_ausrichtung) {
		super(ss_x_bug, ss_y_bug, ss_laenge, ss_ausrichtung);
		zufaellig_untertauche();
		if (is_untertaucht) {z_Tauch = 1;}
	}
	
	public void set_Schuss(int ss_x_schuss , int ss_y_schuss)
		{int z_getroffen = 0;	
		is_schiffsteil_mehrmal_getroffen = false;
		is_schiffsteil_getroffen = false;
		if(!is_untertaucht)
		{for (Schiffsteil i_schiffsteil : lst_schiffsteil)
			{if(i_schiffsteil.isGetroffen())
				{
				z_getroffen +=1;
				if(i_schiffsteil.Is_schiffsteil_mehrmals_getroffen(ss_x_schuss, ss_y_schuss))
					{is_schiffsteil_mehrmal_getroffen = true;
					verwalte_Tauchzustand();
					}
				}
				else
					{i_schiffsteil.Set_Schuss(ss_x_schuss, ss_y_schuss);
					if(i_schiffsteil.isGetroffen())
						{is_schiffsteil_getroffen = true;
						z_getroffen +=1;
						verwalte_Tauchzustand();
						}
					}			
			}
		if(z_getroffen == laenge)
			{is_versenkt = true;	
			}		
		}	
		else
			{verwalte_Tauchzustand();	
			}
			
		}
	

	private void zufaellig_untertauche()
		{int uboot_zustand = (int)(Math.random()*2);
		switch(uboot_zustand)
			{case 0: is_untertaucht = false; break;
			case 1: {is_untertaucht = true;
					z_Tauch_aenderung=Schiffsverwalter.z_schusse;break;}
			}	
		}
	
	private void verwalte_Tauchzustand()
		{zufaellig_untertauche();
		int tauchDifferenz_erlaubt = Schiffsverwalter.z_schusse - z_Tauch_aenderung;
		if(tauchDifferenz_erlaubt>2)
			{if(is_untertaucht) {z_Tauch += 1;}
			if (z_Tauch>30)
				{is_untertaucht = false;
				}	
			}
		}
	
	public String schiffsart()
		{return "Uboot";
		}

	public boolean is_untertaucht() {
		return is_untertaucht;
	}
	
	
	
}
