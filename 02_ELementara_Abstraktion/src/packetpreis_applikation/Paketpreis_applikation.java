package packetpreis_applikation;
public class Paketpreis_applikation {

	public static void main(String[] args) 
	{//Deklarieren
	int ma�en_sprache,
		z_pakete,
		l�nge,
		breit,
		h�he,
		gewicht,
		paketklasse;
	double 	preis,
			gesamt_preis;
	
	//Angaben erfasen
	System.out.println("Bitte geben Sie ein , welche Ma�en Sie arbeiten m�chten? (1: Englisch , 2:Deutsch)");
	System.out.println("(1 inch = 2,54 cm, 1 pound = 0,3732417216 kg)");
	ma�en_sprache = ConsolReader.readInt();
	System.out.println("Wie viele Pakete?");
	z_pakete = ConsolReader.readInt();
	System.out.println("L�nge der Pakets");
	l�nge = ConsolReader.readInt();
	System.out.println("Breite der Pakets");
	breit = ConsolReader.readInt();
	System.out.println("H�he der Pakets");
	h�he = ConsolReader.readInt();
	System.out.println("Gewicht der Pakets");
	gewicht = ConsolReader.readInt();
	
	//preis berchenen
	paketklasse = l�nge + breit;
	if (gewicht <= 25 )
		{if (paketklasse <=50 )
			{preis = 3.90;
			gesamt_preis = z_pakete * preis;
			System.out.println("Transport preis f�r ein Paket ist :" + preis); 
			System.out.println("Gesamtsumme ist :" + gesamt_preis);
			}
		else
			{preis = 8.90;
			gesamt_preis = z_pakete * preis;
			System.out.println("Transport preis f�r ein Paket ist :" + preis); 
			System.out.println("Gesamtsumme ist :" + gesamt_preis);
			}
		}//end if
	else
		{
		preis = (l�nge * breit * h�he)*0.5;
		gesamt_preis = z_pakete * preis;
		System.out.println("Transport preis f�r ein Paket ist :"+ preis);
		System.out.println("Gesamtsumme ist :" + gesamt_preis);

		}//end if
	
				
	}//end main

}
