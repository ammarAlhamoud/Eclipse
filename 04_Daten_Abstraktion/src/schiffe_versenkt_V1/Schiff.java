package schiffe_versenkt_V1;

public class Schiff 
{private  int x_pos,
			 y_pos;

private  boolean isVersenkt = false;

public Schiff(int x_pos, int y_pos) 
	{this.x_pos = x_pos;
	this.y_pos = y_pos;
	}

public  void set_Schuss(int ss_x_schuss , int ss_y_schuss)
	{if ((ss_x_schuss == x_pos) && (ss_y_schuss == y_pos))
		{isVersenkt = true ;
		}
	}

public  boolean isGetroffen(int ss_x_schuss , int ss_y_schuss)
	{boolean isGetroffen = false ;
	if (isVersenkt == true )
		{isGetroffen = true;	
		}
	return isGetroffen;	
	}

public  void setX_pos(int x_pos) 
	{this.x_pos = x_pos;
	}

public  void setY_pos(int y_pos) 
	{this.y_pos = y_pos;
	}

public int getX_pos() 
{
	return x_pos;
}

public int getY_pos() 
{
	return y_pos;
}




}
