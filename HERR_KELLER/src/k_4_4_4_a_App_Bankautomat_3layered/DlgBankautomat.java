package k_4_4_4_a_App_Bankautomat_3layered;

public class DlgBankautomat
{public static void main(String[] args)
  {		
   Kontenverwalter kontenverwalter = new Kontenverwalter();
   int aktNr;
   double aktStand;
   char auswahl;
   System.out.println("Willkommen beim Geldautomaten.");
   
   do
   	{System.out.println("Was möchten Sie tun?");
   	 System.out.println("  (1) Konto anlegen");
   	 System.out.println("  (2) Kontostand anzeigen");
   	 System.out.println("  (3) Geld verbuchen");
   	 System.out.println("  (4) Konto löschen");
	 System.out.println("  (5) Beenden (& Speichern)");
	 auswahl = ConsolReader.readChar();
	 
	 switch(auswahl)
	 	{case '1': aktNr = kontenverwalter.create_neuesKonto();
	 			   System.out.println("Konto wurde angelegt!");
	 			   System.out.println("Kontonummer des neuen Kontos: " + aktNr);
	 			   break;
	 	 case '2': System.out.println("Kontonummer eingeben");
	 	 		   aktNr = ConsolReader.readInt();
	 	 		   try
	 	 		   	{aktStand = kontenverwalter.get_Kontostand(aktNr);
	 	 		     System.out.println("Konto: " + aktNr + " |Kontostand: " + aktStand);
	 	 		   	}
	 	 		   catch(Exception e)
	 	 		    {System.out.println(e.getMessage());}
	 	 		   break;
	 	 case '3': System.out.println("Kontonummer eingeben");
		   		   aktNr = ConsolReader.readInt();
		   		   System.out.println("Betrag zum verbuchen (auch negative möglich)");
		   		   aktStand = ConsolReader.readDouble();
		   		   try
		   		   	{kontenverwalter.verbuchen(aktNr,aktStand);
		   		     System.out.println(aktStand + " verbucht auf Konto " + aktNr);
		   		   	}
		   		   catch(Exception e)
		   		   	{System.out.println(e.getMessage());}
		   		   break;
	 	 case '4': System.out.println("Kontonummer eingeben");
		   		   aktNr = ConsolReader.readInt();
		   		   try
		   		   	{kontenverwalter.konto_loeschen(aktNr);
		   		   	 System.out.println("Konto " + aktNr + " gelöscht!");
		   		   	}
		   		   catch(Exception e)
		   		   	{System.out.println(e.getMessage());}
		   		   break;
		 default:
	 	}
   	}
   while(auswahl != '5' );
     	 {kontenverwalter.Konten_speichern();
    	  System.out.println("Programmende !");
    	  }
  }
}
