package schiffe_versenken;

public class UBoot extends Schiff {
	
	private boolean is_untergetaucht = false;
	private int akt_untergetaucht = 0;
	private int ges_untergetaucht = 0;
		
	public UBoot(int ss_x, int ss_y, char ss_aurichtung, int ss_laenge) {
		super(ss_x, ss_y, ss_aurichtung, ss_laenge);
	}
	
	public void set_schuss(int ss_x_Schuss, int ss_y_Schuss) {
		int z_getroffen=0;
		is_getroffen=false;
		is_mehrmals_getroffen=false;
		if(!is_untergetaucht)
		{	for(Schiffteil i_schiffteil:lst_schiffteil)	
			{	
				if(i_schiffteil.is_getroffen())
				{	z_getroffen++;	
					i_schiffteil.set_schuss(ss_x_Schuss, ss_y_Schuss);
					if(i_schiffteil.is_mehrmals_getroffen())
					{	is_mehrmals_getroffen=true;}
				}
				else
				{	i_schiffteil.set_schuss(ss_x_Schuss, ss_y_Schuss);
					if(i_schiffteil.is_getroffen()) 
					{	is_getroffen=true;
						z_getroffen++;
					}
				}
			}
		}
		
		if(z_getroffen==laenge) is_versenkt=true;
		if(!is_versenkt) tauchzustand_verwalten();
	}
	
	private void tauchzustand_verwalten() {
		//is_untergetaucht = !is_untergetaucht;
		int zustand = (int)(Math.random() * 2);
		if(zustand==0 & akt_untergetaucht<2 & ges_untergetaucht<30)
		{ 	is_untergetaucht = true;
			akt_untergetaucht++;
			ges_untergetaucht++;
		}
		else
		{	is_untergetaucht = false;
			akt_untergetaucht=0;
		}
	}
	
}
