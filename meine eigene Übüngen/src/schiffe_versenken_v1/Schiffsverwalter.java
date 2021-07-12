package schiffe_versenken_v1;

import java.util.ArrayList;

public class Schiffsverwalter {
	private static int z_schiffe = 0;
	private static int last_schussergebnis;
	private static ArrayList<Schiff> lst_schiff = new ArrayList<>();
	
	public static void schiffsverwalter() {
		
		for(int i=0; i<z_schiffe; i++)
		{	boolean is_vergeben = true;
			int w_x, w_y;
			
			Schiff akt_schiff = new Schiff(0,0);
			lst_schiff.add(akt_schiff);
			
			do{	w_x = (int)(Math.random() * 11);
				w_y = (int)(Math.random() * 11);
				
				for(Schiff w_schiff:lst_schiff)
				{	is_vergeben = (w_schiff.get_x_pos()==w_x) && (w_schiff.get_y_pos()==w_y);
				}
			}while(is_vergeben);
			
			akt_schiff.set_x_pos(w_x);
			akt_schiff.set_x_pos(w_y);
		}
		
		lst_schiff.add(new Schiff(1,1));
		lst_schiff.add(new Schiff(2,2));	
	}
	
	public static void schuss_auf_schiffe_setzen(int ss_x_schuss, int ss_y_schuss) {
		last_schussergebnis = 0;
		
		for(Schiff i_schiff:lst_schiff)			
		{	
			if(!i_schiff.is_getroffen())
			{	i_schiff.set_schuss(ss_x_schuss,ss_y_schuss);
				if(i_schiff.is_getroffen()) last_schussergebnis = 1;
			}
			else
			{	if(i_schiff.get_mehrmals_getroffen(ss_x_schuss,ss_y_schuss)) last_schussergebnis = 2;
			}
		}
		
	}
	
	public static int get_last_schussergebnis() {
		return last_schussergebnis;
	}
	
	
}
