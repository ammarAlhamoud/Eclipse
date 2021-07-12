package dlgTätigkeiten;

public class DlgTätigkeits {

	public static void main(String[] args) 
	{int tätigkeitsart,
		 i_vorgang = 0;
	long startzeitpunkt,
		 endzeitpunkt;
	int akt_tätigkeitsart,
		next_tätigkeitsart=1;
		System.out.println("Tätigkeitsart?");
	akt_tätigkeitsart = ConsolReader.readInt();
	startzeitpunkt = System.currentTimeMillis();
	while (next_tätigkeitsart != 0)
		{System.out.println("Tätigkeitsart?");
		next_tätigkeitsart = ConsolReader.readInt();
		endzeitpunkt = System.currentTimeMillis();
		Arbeitsvorgang akt_Arbeitsvorgang = new Arbeitsvorgang(akt_tätigkeitsart,startzeitpunkt,endzeitpunkt);
		Vorgangsverwalter.registiere_Arbeitsvorgang(akt_Arbeitsvorgang, i_vorgang);
		System.out.println("Art: " + akt_Arbeitsvorgang.getArt() + "   Dauer:  "+ akt_Arbeitsvorgang.getDauer());
		akt_tätigkeitsart = next_tätigkeitsart;
		startzeitpunkt = endzeitpunkt;	
		i_vorgang ++;
		}
	Vorgangsverwalter.get_Protokoll();

	}

}
