package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public class Kreuzer extends Schiff{
	
	private Teil[] t_Teil;
	private int z_getroffene_Teile = 0;

	public Kreuzer(int ss_pos_x, int ss_pos_y,
				   int ss_laenge, boolean is_senkrecht)
	{ t_Teil=new Teil[ss_laenge];
		
		if (is_senkrecht)
			for (int i_Teil=0; i_Teil<t_Teil.length; i_Teil++)
			  t_Teil[i_Teil]=new Teil(ss_pos_x,ss_pos_y+i_Teil);			
		else // WAAGRECHT
		  for (int i_Teil=0; i_Teil<t_Teil.length; i_Teil++)
			  t_Teil[i_Teil]=new Teil(ss_pos_x+i_Teil,ss_pos_y);
	}
	
	public static Teil[] wuerde_besetzen(int ss_pos_x, int ss_pos_y,
										int ss_laenge, boolean is_senkrecht)
	{return new Kreuzer(ss_pos_x, ss_pos_y, ss_laenge, is_senkrecht).t_Teil;	
	}
	
	public boolean besetztKoordinate(int ss_pos_x, int ss_pos_y)
	{	for (int i_Teil=0; i_Teil<t_Teil.length; i_Teil++)
			if (t_Teil[i_Teil].besetztKoordinate(ss_pos_x, ss_pos_y))
				return true;
		return false;
	}

	public void set_Schuss(int ss_pos_x, int ss_pos_y)
	{ 	for (int i_Teil=0; i_Teil<t_Teil.length; i_Teil++)
			if (t_Teil[i_Teil].besetztKoordinate(ss_pos_x, ss_pos_y))
				t_Teil[i_Teil].set_Schuss();
				z_getroffene_Teile +=1;
	
		if (z_getroffene_Teile==t_Teil.length) sinke();
	}

	public boolean is_getroffen(int ss_pos_x, int ss_pos_y) {
		for (int i_Teil=0; i_Teil<t_Teil.length; i_Teil++)
		{ if (t_Teil[i_Teil].besetztKoordinate(ss_pos_x, ss_pos_y))
				return t_Teil[i_Teil].isGetroffen();
		}
		return false;
	}

}
