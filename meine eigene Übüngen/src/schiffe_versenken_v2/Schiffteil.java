package schiffe_versenken_v2;

public class Schiffteil {
	private int x_pos, y_pos;
	private boolean is_getroffen=false;
	
	public Schiffteil(int ss_x, int ss_y) {
		x_pos=ss_x;
		y_pos=ss_y;
		Spielfeld.set_teil( x_pos, y_pos);
	}
	
	public void set_schuss(int ss_x_Schuss, int ss_y_Schuss) {
		if(ss_x_Schuss==x_pos&&ss_y_Schuss==y_pos) 
			is_getroffen=true;
	}
	
	public boolean is_mehrmals_getroffen(int ss_x_Schuss, int ss_y_Schuss) {
		boolean is_mehrmals_getroffen = false;
		if(ss_x_Schuss==x_pos&&ss_y_Schuss==y_pos) is_mehrmals_getroffen = true;
		return is_mehrmals_getroffen;
	}
	
	public boolean is_getroffen() {
		return is_getroffen;
	}
	
	/*
	public int get_x_pos() {
		return x_pos;
	}
	
	public void set_x_pos(int ss_x_pos) {
		x_pos = ss_x_pos;
	}
	
	public int get_y_pos() {
		return y_pos;
	}
	
	public void set_y_pos(int ss_y_pos) {
		y_pos = ss_y_pos;
	}
	
	public boolean is_getroffen() {
		return is_getroffen;
	}
	*/
}