package schadensversicherung;

import dlgTeiler.ConsolReader;

public class Schadensversicherung {

	public static void main(String[] args) 
	{
		//Deklarieren 
		int	Schadensumme;
		double	Prozent_Schadensumme,
				Selbstbeteiligung,
				Versicherungsanteil;
		final int 	M_stselbstbeteiligung=100,
					M_selbstanteil=100;
		//Schadensumme erfassen
		System.out.println("Bitte Schadensumme eingeben");
		Schadensumme = ConsolReader.readInt();
		//Schadnsumme berechnen
		if (Schadensumme<=M_selbstanteil)
			{
				Selbstbeteiligung = Schadensumme;
				System.out.println("Selbstbeteiligung beträgt : "+Selbstbeteiligung);
			}
		else
			{
				Prozent_Schadensumme = Schadensumme*0.2;
				if(Prozent_Schadensumme<=M_selbstanteil)
					{
					Selbstbeteiligung = M_selbstanteil;
					}
				else
					{
						Selbstbeteiligung = Prozent_Schadensumme;
					}//ende if
						Versicherungsanteil = Schadensumme - Selbstbeteiligung;
						// Ergebnisse anzeigen
						System.out.println("Selbstbeteiligung beträgt : "+Selbstbeteiligung);
						System.out.println("Versicherungsanteil beträgt : "+Versicherungsanteil);
			}//ende if
	}
}
