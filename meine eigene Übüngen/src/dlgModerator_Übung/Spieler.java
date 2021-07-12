package dlgModerator_Übung;

public class Spieler 
{private String name;
Spieler next;

public Spieler(String ss_name , Spieler ss_next) 
	{this.name = ss_name;
	this.next = ss_next;	
	}

public String getName()
	{return name;	
	}
}
