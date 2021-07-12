package schiffe_versenkt_V1;

import java.util.ArrayList;
public class Schiffsverwalter 
{private static int last_schussergebnis = 0;
ArrayList<Schiff> lst_Schiff  =  new ArrayList<Schiff>();

//Schiffe setzen	
public void Schiffsverwalter()
	{int x_Schiff,
		 y_Schiff;
	for (int i=0;i<8;i++)
		{x_Schiff = (int)(Math.random()*11);
		y_Schiff = (int)(Math.random()*11);
		Schiff neuesSchiff = new Schiff(x_Schiff, y_Schiff);
		lst_Schiff.add(neuesSchiff);
		System.out.println("x:" + neuesSchiff.getX_pos());
		System.out.println("y:" + neuesSchiff.getY_pos());
		}	
	}
public void lst_schiffe_print()
	{
	for (Schiff i_schiff: lst_Schiff)
		{
			
		}
		
	}

public   void Schuss_auf_Schiffe_setzen(int ss_x_schuss , int ss_y_schuss)
	{
	for (int i_schiff= 0; i_schiff < 8 ; i_schiff++)
		{lst_Schiff.get(i_schiff).set_Schuss( ss_x_schuss ,  ss_y_schuss);
		if (lst_Schiff.get(i_schiff).isGetroffen(ss_x_schuss ,  ss_y_schuss))
			{last_schussergebnis = 1;			
			}			
		}		
	}
public  int  get_last_schussergebnis()
	{return last_schussergebnis ;		
	}

}
