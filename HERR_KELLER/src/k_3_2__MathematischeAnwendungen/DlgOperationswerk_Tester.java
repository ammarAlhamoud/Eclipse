package k_3_2__MathematischeAnwendungen;

//import k_3_2_Biometrie.DlgBiometrieAnwendung;
import ConsolReader.ConsolReader;


public class DlgOperationswerk_Tester 
  {public static void main(String[] args) 
	{//SCHNELLTESTER
	 //	System.out.println(Operationswerk.get_Folgeglied(4,4));
	 //	System.out.println(Operationswerk.get_Fakultaet(5));
	 //	System.out.println(Operationswerk.get_Kapital(1000,5,12));
	 //	System.out.println(Operationswerk.get_max(5,7);
	 //	System.out.println(Operationswerk.get_Flaeche(0.5, -1, 2, 4)); 
	 //	System.out.println(Operationswerk.get_Potenz(5,3));
      
	  System.out.println("15 ist Pz" + Operationswerk.isPrimzahl(15));
	  System.out.println("7 ist Pz" + Operationswerk.isPrimzahl(7));
	  System.out.println("2 is tPZ" + Operationswerk.isPrimzahl(2));
	  
	 char eingabe; 
	 do
	   {Auswahl(args);
	    System.out.println("W?nschen Sie eine erneute mathematische Anwendung? (j / n)");
	    eingabe = ConsolReader.readChar();
	   }
	 while(eingabe == 'j');
	 System.out.println("Bis bald!");
	}

   private static void Auswahl(String[] args)
     {char auswahl;
	   {// Ausgabe
	  	System.out.println("Willkommen bei mathematischen Anwendungen! Treffen Sie eine Wahl!");
	  	System.out.println();
	  	System.out.println(" (1) Fakult?t berechnen");
	  	System.out.println(" (2) Fl?che unter einer linearen Funktion berechnen");
	  	System.out.println(" (3) Zinsens-Zins berechnen");
	  	System.out.println(" (4) Maximum von zwei Zahlen ausgeben");
	  	System.out.println(" (5) Potenz einer Zahl berechnen");
	  	System.out.println(" (6) Zahlenraten");
	  	System.out.println(" (7) Gewichtspr?fer");
	  	System.out.println(" (8) Quadratzahl pr?fen");	
	   }
	  auswahl = ConsolReader.readChar(); 
	  switch(auswahl)
		   {case '1': Fakultaet_berechnen(); break;
		   	case '2': Flaeche_berechnen(); break;
		   	case '3': Zinseszins_berechnen(); break;
		   	case '4': Maximum_ermitteln(); break;
		   	case '5': Potenz_berechnen(); break;	
		   	case '6': DlgGedachteZahl.main(args); break;
		  // 	case '7': DlgBiometrieAnwendung.main(args); break;
		   	case '8': Quadratzahl_pruefen(); break;
		   } 
     }

   private static void Fakultaet_berechnen()
     {int eingabe, fakultaet;
	  System.out.println("Bitte Zahl zum Berechnen der Fakult?t eingeben!");
      eingabe = ConsolReader.readInt();
      fakultaet = Operationswerk.get_Fakultaet_rekursiv(eingabe);
	  System.out.println("Die Fakult?t von " + eingabe + " ist " + fakultaet);
     }
   
   private static void Flaeche_berechnen()
     {double m,b,x1,x2, flaeche;
	  System.out.println("Bitte Werte eingeben:");
	  System.out.println("Anstieg (m) der Funktion");
	 // m = ConsolReader.readDouble();
	  System.out.println("Wo schneidet die Funktion die y-Achse (b)");
	//  b = ConsolReader.readDouble();
	  System.out.println("x1 - von wo soll die Fl?che berechnet werden");
	 // x1 = ConsolReader.readDouble();
	  System.out.println("x2 - bis wo soll die Fl?che berechnet werden");
	 // x2 = ConsolReader.readDouble();
	  //flaeche = Operationswerk.get_Flaeche(m, b, x1, x2);
	  //System.out.println("N?herungswert der Fl?che: " + flaeche);   
     }
   
   private static void Zinseszins_berechnen()
     {double kapital, zins, endkapital;
      int laufzeit;
	  System.out.println("Startkapital eingeben");
	  kapital = ConsolReader.readInt();
	  System.out.println("Wieviel Prozent Zinsen gibt es?");
	  zins = ConsolReader.readInt();
	  System.out.println("Wie lang ist die Laufzeit?");
	  laufzeit = ConsolReader.readInt();
	  endkapital = Operationswerk.get_Kapital(kapital,zins,laufzeit);
	  System.out.println("Ihr Endkapital: " + (float) endkapital);   
     }
  
   private static void Maximum_ermitteln()
     {int arg1,arg2,maximum;
	  System.out.println("Erster Wert");
	  arg1 = ConsolReader.readInt();
	  System.out.println("Zweiter Wert");
	  arg2 = ConsolReader.readInt();
	  maximum = Operationswerk.get_max(arg1, arg2);
	  System.out.println("Das Maximum ist: " + maximum);   
     }
  
   private static void Potenz_berechnen()
     {int basis, exponent, ergebnis;
	  System.out.println("Basis eingeben");
      basis = ConsolReader.readInt();
      System.out.println("Exponent eingeben");
      exponent = ConsolReader.readInt();
      ergebnis = Operationswerk.get_Potenz_rekursiv(basis,exponent);
      System.out.println("Ergebnis: " + ergebnis);
     }
  
   private static void Quadratzahl_pruefen()
     {int zahl;
	  System.out.println("Bitte geben Sie eine Zahl ein!");
      zahl = ConsolReader.readInt();
      if(Operationswerk.isQuadratzahl(zahl))
		{System.out.println(zahl + " ist eine Quadratzahl!");}
	  else
		{System.out.println(zahl + " ist keine Quadratzahl!");}
     }
  }