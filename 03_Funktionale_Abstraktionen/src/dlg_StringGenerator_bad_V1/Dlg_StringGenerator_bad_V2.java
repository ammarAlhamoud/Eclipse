package dlg_StringGenerator_bad_V1;
public class Dlg_StringGenerator_bad_V2 
{private static int max_Wortlaenge;
private static String aktWort="";
	public static void main(String[] args) 
	{System.out.println("max_Wortlaenge");
	max_Wortlaenge = ConsolReader.readInt();
	create_Zufallswort();	
	System.out.println("Zufallswort : " + aktWort);
	}
	private static void create_Zufallswort()
	{int aktWortlaenge;
	String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int zufallspos;
	char aktBuchstabe;
	aktWortlaenge = (int)(Math.random()*10000) % max_Wortlaenge + 1;
	for (int z_Buchstabe = 0; z_Buchstabe < aktWortlaenge; z_Buchstabe++)
		{// einen zufälligen Buchtabe anhängen
		zufallspos = (int)(Math.random()*1000) % 26 ;
		aktBuchstabe= alphabet.charAt(zufallspos);
		aktWort += aktBuchstabe;
		}
	}

}
