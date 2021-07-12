package dlgTannenbaumzeichnung;

import Summe_ungeraderZahlen_erzeugen.ConsolReader;

public class DlgTannenbaumzeichnung 
{
	public static void main(String[] args)
	{//Deklarieren
	int baum_breite_max,
		baum_hoehe,
		baummitte = 0,
		z_astreihenbreite ,
		linkenKronenabstand,
		z_blank,
		z_stern,
		z_astreihe = 0,
		stamm_hoehe,
		linkerStammabstand,
		z_Stammscheibe;
	String druckzeile = "";
	
	//Baummaße erfassen
	baum_breite_max = ConsolReader.readInt();
	baum_hoehe = ConsolReader.readInt();
	
	//Tannenbaum zeichnen
	baummitte =(baum_breite_max/2)+1;
	z_astreihenbreite = 1;
	linkenKronenabstand = baummitte -1 ;
	while (z_astreihenbreite <= baum_breite_max)
		{druckzeile ="";
		for(z_blank = 1 ;z_blank<=linkenKronenabstand; z_blank++)
			{druckzeile = druckzeile + " ";
			}
		for (z_stern = 1 ; z_stern <= z_astreihenbreite ; z_stern++)
			{druckzeile = druckzeile + "*";		
			}
		System.out.println( druckzeile );
		z_astreihenbreite += 2;
		linkenKronenabstand -= 1;			
		}
	
	// Stamm zeichenen
	z_astreihe = (baum_breite_max/2)+1;
	stamm_hoehe = baum_hoehe - z_astreihe;
	linkerStammabstand = baummitte - 2 ;
	druckzeile = "";
	for (z_blank = 1; z_blank<=linkerStammabstand; z_blank++)
		{druckzeile = druckzeile + " ";
		}
	druckzeile =druckzeile +  "***";
	for (z_Stammscheibe = 1; z_Stammscheibe<=stamm_hoehe; z_Stammscheibe++)
	{System.out.println( druckzeile );
	}
	}

}
