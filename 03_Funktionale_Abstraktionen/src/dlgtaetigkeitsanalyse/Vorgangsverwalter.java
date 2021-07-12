package dlgtaetigkeitsanalyse;

public class Vorgangsverwalter 
	{private static Arbeitsvorgang first , last;
	private static int i_Vorgang;
	public static void kreiere_Arbeitsvorgang()
		{Arbeitsvorgang w_Arbeitsvorgang = new Arbeitsvorgang();
		last.set_next(w_Arbeitsvorgang);
		last = w_Arbeitsvorgang ;
		}
	private void registiere_in_akt_Arbeitsvorgang(int ss_art, long ss_startzeitdauer)
		{Arbeitsvorgang[] t_Arbeitsvorgang ;
			
		}
	private void add(Arbeitsvorgang ss_vorgang)
		{if(first == null)
			{first = ss_vorgang;
			last = first;				
			}
		else
			{last.set_next(ss_vorgang);
			last = ss_vorgang;	
			}			
		}

	}
