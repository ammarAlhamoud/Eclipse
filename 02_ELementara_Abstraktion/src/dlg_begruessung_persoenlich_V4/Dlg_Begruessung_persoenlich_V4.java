package dlg_begruessung_persoenlich_V4;
import java.util.Calendar;
import schadensversicherung.ConsolReader;
public class Dlg_Begruessung_persoenlich_V4
  {public static long startzeitpunkt ;
private static String name;
private static byte anrede = 0 ;
private static boolean isProgrammabbruch = false ;
private static int gebTag = 0, gebMonat = 0 , gebJahr = 0;
private static boolean isHeuteGeburtstag = false;
private static String tagesgruss = "Guten Tag, ";
public static void main(String[] args)
	{Erfassungsdialog_durchfuehren();
	Grussarten_festlegen();
	get_Systemreaktion_anzeigen(tagesgruss);
	}//end main
public static void Erfassungsdialog_durchfuehren()
	{short z_max_AnredeEingabe = 8 ;
	int z_unzulaessigeEingaben = 0;
	boolean isGebMonat_plausibel = false;
	boolean isGebTag_plausibel = false ;
	boolean isAnrede_falsch;
	startzeitpunkt = System.currentTimeMillis();
	System.out.println(" ******* Testanzeige : startzeitpunkt: " + (int)(startzeitpunkt/1000)%1000);
	System.out.println("Name ?");
	name = ConsolReader.readString();
	// Anrede festlegen
	isAnrede_falsch = true ;
	while (isAnrede_falsch)
		{System.out.println("Anrede: 0 = Herr, 1= Frau, 2 = Dr, 3 = Durschlaucht ?");
		anrede = (byte)(ConsolReader.readInt());
		isAnrede_falsch = anrede < 0 || anrede > 3 ;
		}
	//Erfassung Geburtstag
	isGebTag_plausibel = false;
	isProgrammabbruch = false ;
	while (!isGebTag_plausibel && z_unzulaessigeEingaben < 8 )
		//Geburtstagsdatum erfassen
	{System.out.println("GebTag?");
	gebTag = ConsolReader.readInt();
	System.out.println("GebMonat?");
	gebMonat = ConsolReader.readInt();
	System.out.println("GebJahr?");
	gebJahr = ConsolReader.readInt();
	
	//prüfung Geburtstag
	switch (gebMonat)
		{case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (gebTag <=31)
				{isGebTag_plausibel = true;
				};
		break;
		case 4: case 6: case 9: case 11: 
			if (gebTag <=30)
				{isGebTag_plausibel = true;
				};
		break;
		case 2: 
			if (gebTag <=28)
				{isGebTag_plausibel = true;
				};
		break;
		}
	if (!isGebTag_plausibel)
		{System.out.println("Monatsangabe falsch !");
		z_unzulaessigeEingaben++;	
		}
	//end prüfung Geburtstag
	}//end Geburtstagsdatum erfassen
	if(z_unzulaessigeEingaben == 8)
		{isProgrammabbruch = true ;
		}
	else
		{};
	// end Erfassung Geburtstag	
	}// end Erfassungsdailog_durchfuehren
public static void Grussarten_festlegen()
{int akt_Monat , akt_Tag , akt_Jahr;
if(!isProgrammabbruch) 
  {//Notwendigkeit von Geburtstaggruss prüfen
  akt_Monat = Calendar.getInstance().get(Calendar.MONTH)+1;
  akt_Tag =  Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
  isHeuteGeburtstag = (gebTag == akt_Tag && gebMonat == akt_Monat);
  //end Notwendigkeit von Geburtstaggruss prüfen
  
  //taggruss erzeugen
  switch (anrede)
	  {case 0 : tagesgruss += "Herr " + name + "!";
	  break;
	  case 1 : tagesgruss += "Frau " + name + "!";
	  break;
	  case 2 : tagesgruss += "Dr " + name + "!";
	  break;
	  case 3 : tagesgruss += "Durchlaucht " + name + "!";
	  break;
	  }  
  // end Taggruss erzeugen
  }
else
  {
  };  
}// end Grussarten festlegen
public static  String get_Systemreaktion_anzeigen(String ss_tagesgruss)
{long endezeitpunkt;
boolean isDialogdauer_ueberschritten = false;
String ausgabe ;
if (isProgrammabbruch ) 
	  {ausgabe = "Dialogende!";  
	  }
else
	  {if(isHeuteGeburtstag)
		  {ausgabe = "Alles Gute zum Geburtstag !";			  
		  }
	  else   
		  {ausgabe = ss_tagesgruss;	  
		  }
	  }
System.out.println(ausgabe);
	  //prüfung der Dialogdauer
	  endezeitpunkt = System.currentTimeMillis();
	  System.out.println("******Testanzeige : endzeitpunkt: " + (int)(endezeitpunkt / 1000)%1000);
	  isDialogdauer_ueberschritten =(endezeitpunkt - startzeitpunkt > 12 * 1000);
	  // end prüfung der Dialogdauer
	  if (isDialogdauer_ueberschritten)
		  {System.out.println("Vilen Dank für Ihre Geduld");
		  } ;
	  return ausgabe ;
//end Systemreaktion_anzeigen
}		

  }

