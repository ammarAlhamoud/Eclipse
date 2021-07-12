package test_FIRST_AND_LAST;

public class Spielerverwalter 
{private Spieler first,
				 next ,
				 last;

public void  kreiere_Spieler(String ss_name)
	{Spieler w_spieler = new Spieler(ss_name);
	if (first == null)
		{first = w_spieler;
		last = w_spieler;
		last.setNext(w_spieler);
		}
	else
		{last.setNext(w_spieler);
		last = w_spieler;		
		}	
	next = first;
	}

public Spieler get_Spieler() 
	{Spieler next_spieler =  next;	
	if (next == null)
		{next = first;
		next_spieler =  next;
		}
	else {
	next = next_spieler.getNext();
	}
		
	
	return next_spieler;	
	}
}
