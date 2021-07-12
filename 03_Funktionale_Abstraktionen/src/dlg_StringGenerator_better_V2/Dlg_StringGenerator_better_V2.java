package dlg_StringGenerator_better_V2;
public class Dlg_StringGenerator_better_V2 
{private static int max_Wortlaenge;
private static int aktWortlaenge;
private static String aktWort="";
private static String alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private static int z_Buchstabe;
private static int zufallspos;
private static char aktBuchstabe;
	public static void main(String[] args) 
	{System.out.println("max_Wortlaenge");
	max_Wortlaenge = ConsolReader.readInt();
	aktWortlaenge = (int)(Math.random()*10000) % max_Wortlaenge + 1;
	for (z_Buchstabe = 0; z_Buchstabe < aktWortlaenge; z_Buchstabe++)
		{// einen zufälligen Buchtabe anhängen
		zufallspos = (int)(Math.random()*1000) % 26 ;
		aktBuchstabe= alphabet.charAt(zufallspos);
		aktWort += aktBuchstabe;
		}
	// end for zufälligen Buchstaben anhängen
	System.out.println(aktWort);
	}

}
