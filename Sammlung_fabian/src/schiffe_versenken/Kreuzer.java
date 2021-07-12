package schiffe_versenken;

public class Kreuzer extends Schiff{
	
	public Kreuzer(int ss_x, int ss_y, char ss_aurichtung, int ss_laenge) {
		super(ss_x, ss_y, ss_aurichtung, ss_laenge);
	}
	
	public void set_schuss(int ss_x_Schuss, int ss_y_Schuss) {
		int z_getroffen=0;
		is_getroffen=false;
		is_mehrmals_getroffen=false;

		for(Schiffteil i_schiffteil:lst_schiffteil)	
		{	
			if(i_schiffteil.is_getroffen())
			{	z_getroffen++;	
				i_schiffteil.set_schuss(ss_x_Schuss, ss_y_Schuss);
				if(i_schiffteil.is_mehrmals_getroffen())
				{	is_mehrmals_getroffen=true;
				}
			}
			else
			{	i_schiffteil.set_schuss(ss_x_Schuss, ss_y_Schuss);
				if(i_schiffteil.is_getroffen()) 
				{	is_getroffen=true;
					z_getroffen++;
				}
			}
		}
		if(z_getroffen==laenge)	is_versenkt=true;	
	}
	
}
