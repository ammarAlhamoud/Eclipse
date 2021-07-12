package App_BankautomatPreChecker_V3;
public class App_BankautomatPreChecker_V3 {
	public static void main(String[] args)
	{
		String kontonr;
		String passwort;
		boolean isPrüfZiffer = true;
		int prüfZiffer;
		int z_Quersumme;
		final long  endezeitpkt;
		long		akt_zeitpkt;
		
		/* ende Zeit Punkt berechnen */
		endezeitpkt = System.currentTimeMillis() + 30000;	
		//passwort erzeugen
		do 
			{System.out.println("Bitte Passwort eingeben");		
			passwort = ConsolReader.readString();	
			akt_zeitpkt = System.currentTimeMillis();	
			} 
		while (passwort.length()<6 & endezeitpkt > akt_zeitpkt ) ; 
		if (endezeitpkt < akt_zeitpkt)
			{System.out.println("Es tut uns Leid, kein Zeit mehr für ein neues Versuch");	
			}
		//kontoNr erzeugen
		else
			{do
				{System.out.println("Bitte Konto Nummer  eingeben! (6 stellig)");				
				kontonr = ConsolReader.readString();	
				prüfZiffer = kontonr.charAt(5)-'0';
				z_Quersumme = (kontonr.charAt(0)-'0')+(kontonr.charAt(1)-'0')+(kontonr.charAt(2)-'0')+(kontonr.charAt(3)-'0')+(kontonr.charAt(4)-'0');	
				isPrüfZiffer = (z_Quersumme % 10) == prüfZiffer;
				akt_zeitpkt = System.currentTimeMillis();
				}
			while (!isPrüfZiffer & endezeitpkt > akt_zeitpkt) ;				
			if (endezeitpkt < akt_zeitpkt)
				{System.out.println("Es tut uns Leid, kein Zeit mehr für ein neues Versuch");	
				}
			else
				{System.out.println("Anmeldung erfolgreich, Danke!");				
				}	
			}	
	}//end main
}
