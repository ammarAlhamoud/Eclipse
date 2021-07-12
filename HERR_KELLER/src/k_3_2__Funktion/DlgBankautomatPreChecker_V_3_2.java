package k_3_2__Funktion;

import ConsolReader.ConsolReader;

public class DlgBankautomatPreChecker_V_3_2
	{private static String passwort,
	                       kontonr;
	
	private static long endezeitpkt;
	
	private static boolean isKontonr_plausibel = false;
	private static boolean isZeit_vorhanden = true;
	
	public static void main(String args[])
	  {   
	   passwort = get_Passwort();
	   kontonr = get_Kontonr();   
   
	   /* Ergebnis des Anmeldevorgangs anzeigen */
	   if (!isZeit_vorhanden)
	          {System.out.println("Zeitüberschreitung!") ;
	       }
	    else
	       {System.out.println("Anmeldung erfolgreich!") ;      	
	       }
   } //end main
	

	private static String get_Passwort()
	{ String ss_passwort;
	  System.out.println("Bitte Passwort eingeben !");
	  ss_passwort = ConsolReader.readString();
	  endezeitpkt = System.currentTimeMillis() + 30000;
	  while (ss_passwort.length() < 6 && isZeit_vorhanden)  
	        {System.out.println("Bitte Passwort nochmals  eingeben !");
	         ss_passwort = ConsolReader.readString();
	         if (endezeitpkt < System.currentTimeMillis())
	            {isZeit_vorhanden = false;
	            }
	        }
	  return ss_passwort;
	}
	
	
	public static String get_Kontonr()
	   {String ss_kontonr = "";
		int pruefziffer,
	       quersumme;
	   
	   if (isZeit_vorhanden)
	      {System.out.println("Bitte Kontonr eingeben (6 stellig einschliesslich Prüfziffer) !");
	       ss_kontonr = ConsolReader.readString();
	        do {quersumme = (int)ss_kontonr.charAt(0)-48 +
	   	                  (int)ss_kontonr.charAt(1)-48 +
	   		              (int)ss_kontonr.charAt(2)-48 + 
						      (int)ss_kontonr.charAt(3)-48 +
						      (int)ss_kontonr.charAt(4)-48;
	            pruefziffer = ss_kontonr.charAt(5)-48;
	            if (quersumme % 10 == pruefziffer)
	               {isKontonr_plausibel = true;
	               }
	             else
	               {System.out.println("Kontonr falsch! Nochmals");
	                ss_kontonr = ConsolReader.readString();
	                if (endezeitpkt < System.currentTimeMillis())
	                   {isZeit_vorhanden = false;
	                   };
	                //end if   
	                }
	            //end if
	            }
	          while (!isKontonr_plausibel && isZeit_vorhanden);  
	      }
	   //end if
	   return ss_kontonr;
	   }//end get_Kontonr

}

