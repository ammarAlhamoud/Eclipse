package schiffe_versenkt_V2;

public class Schiffsteil 
{private int x_pos,
			 y_pos;
private boolean is_getroffen = false;

public Schiffsteil(int ss_x_pos, int ss_y_pos)
	{x_pos = ss_x_pos;
	y_pos = ss_y_pos;	
	}

public void Set_Schuss (int ss_x_schuss ,int ss_y_schuss)
	{if (ss_x_schuss == x_pos && ss_y_schuss == y_pos)
		{is_getroffen = true;
		}
	}

public boolean isGetroffen() 
	{return is_getroffen;	
	}

public boolean Is_schiffsteil_mehrmals_getroffen(int ss_x_schuss ,int ss_y_schuss)
	{boolean is_mehrmals_getroffen = false;
	if (ss_x_schuss == x_pos && ss_y_schuss == y_pos)
		{is_mehrmals_getroffen = true;
		}
	return is_mehrmals_getroffen;	
	}


// Getter und Setter
public int getX_pos() 
	{return x_pos;
	}

public int getY_pos() 
	{return y_pos;
	}

public void setX_pos(int x_pos) 
	{this.x_pos = x_pos;
	}

public void setY_pos(int y_pos) 
	{this.y_pos = y_pos;
	}

}
