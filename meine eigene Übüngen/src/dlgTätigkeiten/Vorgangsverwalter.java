package dlgTätigkeiten;

public class Vorgangsverwalter 
	{private static int z_vorgang =3;
	private static Arbeitsvorgang[] t_arbeitsvorgang = new Arbeitsvorgang[z_vorgang];	
	public static void registiere_Arbeitsvorgang(Arbeitsvorgang ss_akt_Arbeitsvorgang, int i_vorgang)
		{t_arbeitsvorgang[i_vorgang] = ss_akt_Arbeitsvorgang;	
		}	
	public static void get_Protokoll() 
		{long[][] ss_t_protokoll;
		System.out.println("Art    Beginn   Dauer");
		for (int i = 0; i<z_vorgang; i++)
			{System.out.println(t_arbeitsvorgang[i].getArt() +"   "+t_arbeitsvorgang[i].getStartzeitpunkt()/1000l +"   "+t_arbeitsvorgang[i].getDauer());
			}
		}
	}
