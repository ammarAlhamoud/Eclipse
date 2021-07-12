package dlgModerator;

public  class GeoTrainer implements Trainer
	{private static int z_Fragen = 2;
	public String get_Frage(int ss_fragenr)
		{String ss_Frage="";
		String frage1 = "Ist Rhein länger als der Necker?"+" wenn ja ,"
				+ " dan 1 eingeben, sonst 0)?";
		String frage2 = "Ist die Zugspitze der höchste Berg Eurobas?"+
				" wenn ja , dan 1 eingeben, sonst 0)?";
		switch (ss_fragenr % z_Fragen)
			{case 0 : ss_Frage = frage1;
			break;
			case 1 : ss_Frage =frage2;
			break;
			}
		return ss_Frage;	
		}
	
	public boolean is_richtigeAntwort_auf_Frage(int ss_fragenr,
			String ss_antwort)
		{boolean is_richtige_Antwort = false ;
		String KorrekteAntwort1 = "0";
		String KorrekteAntwort2 = "0";
		switch (ss_fragenr % z_Fragen)
			{case 0 : if (ss_antwort.equals(KorrekteAntwort1))
						{is_richtige_Antwort = true;
						}
			break;
			case 1 : if (ss_antwort.equals(KorrekteAntwort2))
						{is_richtige_Antwort = true;
						}
			break;
			}
		return is_richtige_Antwort;
		}
	
	}
