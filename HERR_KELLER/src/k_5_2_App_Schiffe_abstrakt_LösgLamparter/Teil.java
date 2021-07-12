package k_5_2_App_Schiffe_abstrakt_LösgLamparter;

public class Teil {
	int pos_x;
	int pos_y;
	public boolean isGetroffen=false;
	
	public Teil(int ss_pos_x, int ss_pos_y)
	{	pos_x=ss_pos_x;
		pos_y=ss_pos_y;
	}
	
	public boolean besetztKoordinate(int ss_pos_x, int ss_pos_y)
	{	return (pos_x ==ss_pos_x && pos_y == ss_pos_y);
	}
	
	public void set_Schuss()
	{	isGetroffen = true;
	}

	public boolean isGetroffen()
	{	return isGetroffen;
	}

}
