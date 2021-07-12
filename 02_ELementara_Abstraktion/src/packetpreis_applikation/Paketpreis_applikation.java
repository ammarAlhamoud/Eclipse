package packetpreis_applikation;
public class Paketpreis_applikation {

	public static void main(String[] args) 
	{//Deklarieren
	int maßen_sprache,
		z_pakete,
		länge,
		breit,
		höhe,
		gewicht,
		paketklasse;
	double 	preis,
			gesamt_preis;
	
	//Angaben erfasen
	System.out.println("Bitte geben Sie ein , welche Maßen Sie arbeiten möchten? (1: Englisch , 2:Deutsch)");
	System.out.println("(1 inch = 2,54 cm, 1 pound = 0,3732417216 kg)");
	maßen_sprache = ConsolReader.readInt();
	System.out.println("Wie viele Pakete?");
	z_pakete = ConsolReader.readInt();
	System.out.println("Länge der Pakets");
	länge = ConsolReader.readInt();
	System.out.println("Breite der Pakets");
	breit = ConsolReader.readInt();
	System.out.println("Höhe der Pakets");
	höhe = ConsolReader.readInt();
	System.out.println("Gewicht der Pakets");
	gewicht = ConsolReader.readInt();
	
	//preis berchenen
	paketklasse = länge + breit;
	if (gewicht <= 25 )
		{if (paketklasse <=50 )
			{preis = 3.90;
			gesamt_preis = z_pakete * preis;
			System.out.println("Transport preis für ein Paket ist :" + preis); 
			System.out.println("Gesamtsumme ist :" + gesamt_preis);
			}
		else
			{preis = 8.90;
			gesamt_preis = z_pakete * preis;
			System.out.println("Transport preis für ein Paket ist :" + preis); 
			System.out.println("Gesamtsumme ist :" + gesamt_preis);
			}
		}//end if
	else
		{
		preis = (länge * breit * höhe)*0.5;
		gesamt_preis = z_pakete * preis;
		System.out.println("Transport preis für ein Paket ist :"+ preis);
		System.out.println("Gesamtsumme ist :" + gesamt_preis);

		}//end if
	
				
	}//end main

}
