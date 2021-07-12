package dlgNotizenverwaltung;

import java.io.Serializable;
import java.util.*;
import java.util.regex.*;

public class Notiz implements Serializable 
{private int notizNr;
private boolean is_enthalten=false;
private String[] t_wichtige_textstuck;
private ArrayList<Fliesstext> lst_Fliesstext = new ArrayList<Fliesstext>();
private double absolute_AufgabenZeit;

public Notiz(String ss_text, int ss_Notiznr)
	{Fliesstext w_fliesstext;
	this.notizNr = ss_Notiznr;
	w_fliesstext = new Fliesstext(ss_text);
	lst_Fliesstext.add(w_fliesstext);
	}

public String get_Inhalt()
	{String notiz_inhalt="";
	for(Fliesstext i_fliesstext : lst_Fliesstext)
		{notiz_inhalt = i_fliesstext. get_Inhalt();	
		}
	return notiz_inhalt;
	}
public void erweitere_Fliesstext(int einfuegestell, String ss_text)
	{int i_letzte_Fliesstext = lst_Fliesstext.size()-1;
	String inhalt_letzte_fliesstext = 
			lst_Fliesstext.get(i_letzte_Fliesstext).get_Inhalt();
	Fliesstext w_fliesstext = new Fliesstext(inhalt_letzte_fliesstext);
	lst_Fliesstext.add(w_fliesstext);
	w_fliesstext.erweitere_Fliesstext(einfuegestell, ss_text);
	}

public void redo()
	{Fliesstext w_fliesstext;
	int i_letzte_Fliesstext = lst_Fliesstext.size()-1;
	w_fliesstext = lst_Fliesstext.get(i_letzte_Fliesstext);
	lst_Fliesstext.remove(w_fliesstext);
	}

public boolean is_enthalten(String ss_wichtigesTextStuck) 
	{is_enthalten = false;
	int i_letzte_Fliesstext = lst_Fliesstext.size()-1;
	Fliesstext w_fliesstext = lst_Fliesstext.get(i_letzte_Fliesstext);
	if (w_fliesstext.is_enthalten(ss_wichtigesTextStuck))
			{is_enthalten = true;
			}
			
	return is_enthalten;
	}

@SuppressWarnings("deprecation")
public int[] get_Notiz_Alter()
	{int[] notiz_Alter = new int[3];
	int tag, stunde , minute;
	Date akt_Datum = new Date();
	int akt_tag = akt_Datum.getDate(),
		akt_stunde = akt_Datum.getHours(),
		akt_minute = akt_Datum.getMinutes();
	int i_letzte_Fliesstext = lst_Fliesstext.size()-1;
	Fliesstext w_fliesstext = lst_Fliesstext.get(i_letzte_Fliesstext);
	String[] erst_Zeit = w_fliesstext.get_Inhalt().split("-");
	tag =akt_tag - Integer.parseInt(erst_Zeit[0]);
	stunde = akt_stunde - Integer.parseInt(erst_Zeit[3]);
	if (stunde< 0)
		{tag--;
		stunde += 24;	
		}	
	minute = akt_minute - Integer.parseInt(erst_Zeit[4]);
	if (minute < 0)
		{stunde--;
		minute +=60;
		}
	notiz_Alter[0] = tag;
	notiz_Alter[1] = stunde;
	notiz_Alter[2] = minute;
	return notiz_Alter;	
	}

public GregorianCalendar get_Notiz_Erstellungsdatum()
	{int i_letzte_Fliesstext = lst_Fliesstext.size()-1;
	Fliesstext w_fliesstext = lst_Fliesstext.get(i_letzte_Fliesstext); 
	String[] erst_datum = w_fliesstext.get_Inhalt().split("-");
	GregorianCalendar erstellungs_datum = new GregorianCalendar(
			Integer.parseInt(erst_datum[2]),
			Integer.parseInt(erst_datum[1]),
			Integer.parseInt(erst_datum[0]));
	return erstellungs_datum;	
	}

public double get_unerledigteAufgaben_Zeitaufwand()
	{absolute_AufgabenZeit=0;
	int i_letzte_Fliesstext = lst_Fliesstext.size()-1;
	String fliesstext_inhalt = 
			lst_Fliesstext.get(i_letzte_Fliesstext).get_Inhalt(); 
	Pattern pattern = Pattern.compile("<t>[0-9]+\\.?[0-9]*</t>");
	Matcher matcher = pattern.matcher(fliesstext_inhalt);
	while (matcher.find())
		{Pattern pattern_für_Zahl = Pattern.compile("([0-9]+\\.?[0-9]*)");
		Matcher matcher_für_Zahl = pattern_für_Zahl.matcher(matcher.group());
		if (matcher_für_Zahl.find())
			{absolute_AufgabenZeit +=
						Double.parseDouble(matcher_für_Zahl.group());	
			}
		}	
	return absolute_AufgabenZeit;	
	}

//Getter und Setter
public int getNotizNr() 
	{return notizNr;
	}

public String[] getT_wichtige_textstuck() 
	{return t_wichtige_textstuck;
	}

public double getAbsolute_AufgabenZeit() 
	{return absolute_AufgabenZeit;
	}

}
