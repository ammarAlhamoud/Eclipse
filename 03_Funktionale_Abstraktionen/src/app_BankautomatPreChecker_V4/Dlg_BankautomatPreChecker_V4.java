package app_BankautomatPreChecker_V4;
public class Dlg_BankautomatPreChecker_V4 
	{public static void main(String[] args)
	{passwort_erfassen();
	kontonr_erfassen();
	if(!Bankautomat_Timer.isZeit_vorhanden())
		{System.out.println("Zeitüberschreitung");	
		}
	else
		{System.out.println("Anmeldung erfölgreich");	
		}		
	}//end main
private static void passwort_erfassen()
	{String passwort;
	System.out.println("Bitte Passwort eingeben");
	passwort = ConsolReader.readString();
	while (passwort.length() != 6  && Bankautomat_Timer.isZeit_vorhanden())
		{System.out.println("Bitte Passwort nochmals eingeben !");
		passwort = ConsolReader.readString();
		}
	}// end Passwort erfassen()
private static void kontonr_erfassen()
	{String kontonr;
	boolean isKontonr_plausibel;
	if(Bankautomat_Timer.isZeit_vorhanden())
		{System.out.println("Bitte Kontonr eingeben (6 stellig) !");
		kontonr =ConsolReader.readString();
		do 
			{isKontonr_plausibel = is_Kontonr_plausibel(kontonr);
			if (!isKontonr_plausibel)
				{System.out.println("Kontonr falsch - nochmal !");
				kontonr =ConsolReader.readString();		
				}
			}
		while (!isKontonr_plausibel && Bankautomat_Timer.isZeit_vorhanden());
		}// end if
	}// end Kontonr erfassen()	
private static boolean is_Kontonr_plausibel (String ss_kontonr)
	{boolean ss_isKontonr_plausibel = false ;
	int prüfziffer,
		quersumme;
	quersumme = (int)(ss_kontonr.charAt(0)-'0')+(int)(ss_kontonr.charAt(1)-'0')+(int)(ss_kontonr.charAt(2)-'0')+
			(int)(ss_kontonr.charAt(3)-'0')+(int)(ss_kontonr.charAt(4)-'0');
	prüfziffer = ss_kontonr.charAt(5)-'0';	
	if (quersumme % 10 == prüfziffer)
		{ss_isKontonr_plausibel = true ;
		}
	return ss_isKontonr_plausibel;	
	}// end ss_isKontonr_plausibel
}
