package schiffe_versenken;

public class Schiffteil {
	private int x_pos, y_pos;
	private boolean is_getroffen=false;
	private boolean is_mehrmals_getroffen=false;
	
	public Schiffteil(int ss_x, int ss_y) {
		x_pos=ss_x;
		y_pos=ss_y;		
		Spielfeld.set_teil( x_pos, y_pos);
	}
	
	public void set_schuss(int ss_x_Schuss, int ss_y_Schuss) {
		is_mehrmals_getroffen=false;
		if(ss_x_Schuss==x_pos && ss_y_Schuss==y_pos)
		{	if(is_getroffen) is_mehrmals_getroffen = true;
		 	is_getroffen = true;
		}
	}
	
	public boolean liegt_auf(int ss_x_point, int ss_y_point, char ss_ausrichtung, int ss_laenge) {
		boolean liegt_auf = false;
		
		if(ss_ausrichtung=='H')
		{ 	if(	ss_x_point <= x_pos && 
				x_pos <= ss_x_point+ss_laenge-1 &&
				ss_y_point == y_pos)
			{	liegt_auf = true; }		
		}		
		if(ss_ausrichtung=='V')
		{	if(	ss_y_point <= y_pos && 
				y_pos <= ss_y_point+ss_laenge-1 &&
				ss_x_point == x_pos)
			{	liegt_auf = true; }		
		}	
		if(ss_ausrichtung=='Q')
		{	if(	ss_x_point <= x_pos && 
				x_pos <= ss_x_point+ss_laenge-1 &&
				ss_y_point <= y_pos && 
				y_pos <= ss_y_point+ss_laenge-1)
			{	liegt_auf = true; }		
		}
		
		return liegt_auf;
	}
	
	public boolean is_mehrmals_getroffen() {
		return is_mehrmals_getroffen;
	}
	
	public boolean is_getroffen() {
		return is_getroffen;
	}
}