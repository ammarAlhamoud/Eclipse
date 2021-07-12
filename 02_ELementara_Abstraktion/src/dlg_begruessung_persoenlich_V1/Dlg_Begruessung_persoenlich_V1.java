package dlg_begruessung_persoenlich_V1;
import java.io.*;
import java.util.Calendar;
public class Dlg_Begruessung_persoenlich_V1
  {
	public static void main(String[] args) 
	{
	String name;
	int 	z_anrede;
	int		akt_Monat,
			akt_Tag,
			geb_Tag,
			geb_Monat,
			z_maxAnredeEingabe;
			
	
			  
	String    gebdatum, anrede;
	final long  dialogbeginn,
				dialogende,
				dialogdauer;
	
	final short	firstmonth,
				lastmonth,
				firstday,
				lastday;
	int c_Monat;
	int c_Tag;
	boolean prüf_Datum,
			geb_Tag_prüf;
	
	/* Dialogbeginn erfassen */
	dialogbeginn = System.currentTimeMillis();
	System.out.println("Dialogbeginn : "+dialogbeginn);
	System.out.println("............................");
	
	/* personaldaten erfassen   */
	System.out.println("Bitte Name eingeben");
	name=  ConsolReader.readString();
	// Anrede Dialog steuern
	System.out.println("Arede (0 = Herr,1 = Frau, 2 = Dr , 3 = Durchlaucht)" );
	z_anrede = ConsolReader.readInt();
	do
		{System.out.println("unzulässige Anrede! nochmal!" );
		z_anrede = ConsolReader.readInt();
		} 
	while (z_anrede < 0 || z_anrede > 3);
	System.out.println("Geburstdatum");
	gebdatum = ConsolReader.readString();
	
	/* Prüfergebnis von Personaldaten erzeugen */
	firstmonth = 01;
	lastmonth = 12;
	firstday = 01;
	lastday = 31;
	c_Monat = ((gebdatum.charAt(3)-'0')*10)+(gebdatum.charAt(4)-'0');
	c_Tag = ((gebdatum.charAt(0)-'0')*10)+(gebdatum.charAt(1)-'0');
	prüf_Datum = (firstday<=c_Tag & c_Tag<=lastday )&(firstmonth<=c_Monat & c_Monat<=lastmonth);
	System.out.print("Das Datum ist : ");
	System.out.println(prüf_Datum);
	akt_Monat= Calendar.getInstance().get(Calendar.MONTH)+1;
	akt_Tag=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	geb_Tag_prüf = c_Tag==akt_Tag && c_Monat==akt_Monat;
	
	/*Erweiterung des Grüßens*/
	switch (z_anrede)
	{
	case 0:anrede = "Herr";
	break;
	case 1:anrede = "Frau";
	break;
	case 2:anrede = "Dr";
	break;
	case 3:anrede = "Durchlaucht";
	break;
	default:anrede = "";
	break;
	}//end switch

	/* personal Begreussung  */
	System.out.print("Guten Tag "+anrede + " ");
	System.out.println(name);
	System.out.println("Ihr Geburtsdatum ist am "+gebdatum);
	if(geb_Tag_prüf)
	{
	System.out.println("Sie haben heute Ihren Geburtstag");	
	}
else
	{
	System.out.println("Ihr Geburtstag ist noch nicht gekommen");
	}//end if
	
	/* dialogende erzeugen */
	dialogende = System.currentTimeMillis();
	System.out.println("............................");
	System.out.println("Dialogende : "+dialogende);
	System.out.println("............................");
	dialogdauer = (dialogende - dialogbeginn)/1000;
	if (dialogdauer<120)
		{
		System.out.println(dialogdauer+" Dialogdauer ist zumutbar ");
		}
	else
		{
		System.out.println(dialogdauer+" Dialogdauer ist unzumutbar");
		}//end if
	}//end main
}