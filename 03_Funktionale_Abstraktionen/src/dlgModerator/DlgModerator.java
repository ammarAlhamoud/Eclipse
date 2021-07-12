package dlgModerator;

public class DlgModerator 
{private static Regie w_Regie = new Regie();
public static void main(String[] args) 
	{w_Regie.SpielerListe_erzeuge();
	w_Regie.FragenRunde_starte();
	for (int i = w_Regie.z_spieler-1 ; i>=0; i--)
		{System.out.print(w_Regie.w_spielerListe.getSpieler(i).getName()+ "  ");
		for (int j = 0 ; j<2 ;j++)
			{System.out.print(w_Regie.getProtokoll()[i][j] + "  ");	
			}
		System.out.println();
		}	
	}	
}
