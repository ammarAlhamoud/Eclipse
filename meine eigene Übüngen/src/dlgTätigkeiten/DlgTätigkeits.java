package dlgT�tigkeiten;

public class DlgT�tigkeits {

	public static void main(String[] args) 
	{int t�tigkeitsart,
		 i_vorgang = 0;
	long startzeitpunkt,
		 endzeitpunkt;
	int akt_t�tigkeitsart,
		next_t�tigkeitsart=1;
		System.out.println("T�tigkeitsart?");
	akt_t�tigkeitsart = ConsolReader.readInt();
	startzeitpunkt = System.currentTimeMillis();
	while (next_t�tigkeitsart != 0)
		{System.out.println("T�tigkeitsart?");
		next_t�tigkeitsart = ConsolReader.readInt();
		endzeitpunkt = System.currentTimeMillis();
		Arbeitsvorgang akt_Arbeitsvorgang = new Arbeitsvorgang(akt_t�tigkeitsart,startzeitpunkt,endzeitpunkt);
		Vorgangsverwalter.registiere_Arbeitsvorgang(akt_Arbeitsvorgang, i_vorgang);
		System.out.println("Art: " + akt_Arbeitsvorgang.getArt() + "   Dauer:  "+ akt_Arbeitsvorgang.getDauer());
		akt_t�tigkeitsart = next_t�tigkeitsart;
		startzeitpunkt = endzeitpunkt;	
		i_vorgang ++;
		}
	Vorgangsverwalter.get_Protokoll();

	}

}
