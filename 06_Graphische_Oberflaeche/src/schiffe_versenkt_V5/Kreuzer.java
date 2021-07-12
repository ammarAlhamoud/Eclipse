package schiffe_versenkt_V5;

public class Kreuzer extends Schiff
{
	private boolean is_untertaucht = false;
	public Kreuzer(int ss_x_bug, int ss_y_bug, int ss_laenge, char ss_ausrichtung) {
		super(ss_x_bug, ss_y_bug, ss_laenge, ss_ausrichtung);
	}

	public void set_Schuss(int ss_x_schuss , int ss_y_schuss)
	{int z_getroffen = 0;
	is_schiffsteil_mehrmal_getroffen = false;
	is_schiffsteil_getroffen = false;
	for (Schiffsteil i_schiffsteil : lst_schiffsteil)
		{if(i_schiffsteil.isGetroffen())
			{
			z_getroffen +=1;
			if(i_schiffsteil.Is_schiffsteil_mehrmals_getroffen(ss_x_schuss, ss_y_schuss))
				{is_schiffsteil_mehrmal_getroffen = true;
				}
			}
			else
				{i_schiffsteil.Set_Schuss(ss_x_schuss, ss_y_schuss);
				if(i_schiffsteil.isGetroffen())
					{is_schiffsteil_getroffen = true;
					z_getroffen +=1;
					}
				}			
		}
	if(z_getroffen == laenge)
		{is_versenkt = true;	
		}		
		
	}
	
	public String schiffsart()
	{return "Kreuzer";
	}
	public boolean is_untertaucht() {
		return is_untertaucht;
	}

}
