package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public abstract class Schiff {
	
	protected boolean versenkt = false;
	
	
	public boolean is_versenkt() {
		return versenkt;
	}
	
	public void sinke()
	{	versenkt = true;
		System.out.println(getClass().getSimpleName()+" versenkt!");
	}

	public abstract void set_Schuss(int ss_pos_x, int ss_pos_y);
	
	public abstract boolean besetztKoordinate(int ss_pos_x, int ss_pos_y);

	public abstract boolean is_getroffen(int ss_pos_x, int ss_pos_y);

}
