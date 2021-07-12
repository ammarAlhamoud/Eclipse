package schiffe_versenkt_V1;

public class Dlg_Schiffe_versenkt 
{
static Schiffsverwalter  w_Schiffsverwalter = new Schiffsverwalter();

	
	public static void main(String[] args) 
		{int x_schuss,
		y_schuss;
		w_Schiffsverwalter.Schiffsverwalter();
		for (int i=0 ; i<100 ; i++)
			{System.out.println("X Schuss?");
			x_schuss = ConsolReader.readInt();
			System.out.println("Y Schuss?");
			y_schuss = ConsolReader.readInt();
			w_Schiffsverwalter.Schuss_auf_Schiffe_setzen(x_schuss , y_schuss);	
			if (w_Schiffsverwalter.get_last_schussergebnis()==1)
				{System.out.println("Treffer! versenkt");
				}
			else
				{System.out.println("Wasser");		
				}
			}
		}
}
