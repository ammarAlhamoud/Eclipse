package schiffe_versenken_v1;

public class Schiff {
	private int x_pos, y_pos;
	private boolean is_versenkt=false;
	
	public Schiff(int ss_x, int ss_y) {
		this.x_pos=ss_x;
		this.y_pos=ss_y;
	}
	
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
		return is_versenkt;
	}
	
	public void set_schuss(int ss_x_Schuss, int ss_y_Schuss) {
		if(ss_x_Schuss==x_pos&&ss_y_Schuss==y_pos) is_versenkt=true;
	}

	public boolean get_mehrmals_getroffen(int ss_x_schuss, int ss_y_schuss) {
		boolean ss_getroffen=false;
		if(ss_x_schuss==x_pos&&ss_y_schuss==y_pos) ss_getroffen=true;
		return ss_getroffen;
	}
	
}
