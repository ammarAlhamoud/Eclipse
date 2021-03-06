package dlgModerator;

public class Regie 
{public  SpielerVerwalter w_spielerListe = new SpielerVerwalter();
public  int z_spieler ,
			z_spielRunde = 2;

public static Trainer getTrainer()
		{Trainer ss_bereitgestellterTrainer;
		if ((int)(Math.random()*10)%2 == 0)
			{ss_bereitgestellterTrainer = new MatheTrainer();
			}
		else
			{ss_bereitgestellterTrainer = new GeoTrainer();			
			}
		return ss_bereitgestellterTrainer ;
		}
//Liste von Spieler erzeugen
public void SpielerListe_erzeuge()
	{String spieler_name;
	do
		{System.out.println("Bitte geben Sie ein Name ein");
		spieler_name = ConsolReader.readString();	
		while(spieler_name == null);
		if (spieler_name.equals("0") == false )
			{w_spielerListe.addSpieler(spieler_name);	
			z_spieler ++;
			}
		}
	while (spieler_name.equals("0") == false);	
	}

// Das Quizspiel mit 2 Runden (z_spielRunde = 2) starten
public void FragenRunde_starte()
	{int fragenr;
	String antwort;
	long startZeitPkt,
		 endZeitPkt;
	int akt_dauer;
	for (int i_spieler =z_spieler*z_spielRunde ; i_spieler > 0 
			; i_spieler--)
		{int z_akt_richtigeAntworten = 
		w_spielerListe.getSpieler(i_spieler-1).getZ_richtigeAntworten();
		akt_dauer = w_spielerListe.getSpieler(i_spieler).getDauer();
		fragenr = (int)(Math.random()*100000);
		System.out.println("Frage an : " + 
		w_spielerListe.getSpieler(i_spieler-1).getName());
		Trainer zugeteilterTrainer = Regie.getTrainer();
		System.out.println(zugeteilterTrainer.get_Frage(fragenr));
		startZeitPkt = System.currentTimeMillis();
		antwort = ConsolReader.readString();
		endZeitPkt = System.currentTimeMillis();
		System.out.println(zugeteilterTrainer.
				is_richtigeAntwort_auf_Frage(fragenr, antwort));
		w_spielerListe.getSpieler(i_spieler-1).setDauer(startZeitPkt, endZeitPkt);
		if (zugeteilterTrainer.is_richtigeAntwort_auf_Frage
				(fragenr, antwort))
			{w_spielerListe.getSpieler(i_spieler-1).setZ_richtigeAntworten
			(z_akt_richtigeAntworten);
			}
		}		
	}

//Schema von (z_richtigeAntworten, dauer) in t_protokoll Array registieren  
public int[][] getProtokoll()
	{int[][] t_protokoll = new int[z_spieler][2];
	for (int i_spieler =z_spieler-1 ; i_spieler >= 0 ; i_spieler--)
		{int j = 1;
		t_protokoll[i_spieler][j] = w_spielerListe.getSpieler(i_spieler).getDauer();
		t_protokoll[i_spieler][j-1] = w_spielerListe.getSpieler(i_spieler)
				.getZ_richtigeAntworten();		
		}
	return t_protokoll;		
	}
}
