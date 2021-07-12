package dlg_StringGenerator_good_V3;
public class Dlg_StringGenrator_good {
	public static void main(String[] args) 
	{int max_Wortlaenge;
	System.out.println("max_Wortlaenge?");
	max_Wortlaenge = ConsolReader.readInt();
	System.out.println("ZUfalswort: " + get_Zufallswort(max_Wortlaenge));
	}
private static String get_Zufallswort(int ss_max_Wortlaenge)
	{String ss_Zufallswort="";
	int aktWortlaenge;
	int zufallspos;
	char aktBuchstabe;
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	aktWortlaenge = (int)(Math.random()*10000) % ss_max_Wortlaenge + 1;
	for (int z_Buchstabe = 0; z_Buchstabe <aktWortlaenge; z_Buchstabe++)
		{// eine zufallige Buchstabe anhängen
		zufallspos = (int)(Math.random()*1000)%26;
		aktBuchstabe = alphabet.charAt(zufallspos);
		ss_Zufallswort += aktBuchstabe;		
		}
	return ss_Zufallswort;	
	}

}
