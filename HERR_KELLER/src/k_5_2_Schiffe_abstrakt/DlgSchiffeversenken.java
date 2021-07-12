package k_5_2_Schiffe_abstrakt;




public class DlgSchiffeversenken 
  {
	public static void main(String[] args) 
	  {Schiffeverwalter meinVerwalter;
	   int anzahl;
	   int eingabe_x, eingabe_y;
	  
	   System.out.println("Schiffe Versenken!");
	   System.out.println("Wieviele Schiffe?");
	   anzahl = ConsolReader.readInt();
	   meinVerwalter = new Schiffeverwalter(anzahl);
	   
	   do
	   	{System.out.println("Beschiessen (Erst X, dann Y)!");
		 eingabe_x = ConsolReader.readInt();
		 eingabe_y = ConsolReader.readInt();
		 try
		   	{meinVerwalter.registriereTreffer_bei_Schiff(eingabe_x, eingabe_y);
		   	 if(meinVerwalter.isLetztesSchiffVersenkt())
		   	   {System.out.println("Schiff versenkt!");}
		   	}
		 catch(Exception e)
		   	{System.out.println(e.getMessage());}
	   	}
	   while(eingabe_x != 99 && !(meinVerwalter.isSpielbeendet()));
	   System.out.println("Alle Schiffe versenkt!");
	  }

  }
