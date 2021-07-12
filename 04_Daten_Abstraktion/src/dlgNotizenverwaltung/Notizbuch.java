package dlgNotizenverwaltung;
import java.util.*;



public class Notizbuch 
{private int lfd_NotizNr = 0;
public int z_Notizen_mitWichtigeText;
private ArrayList<Notiz> lst_Notiz = new ArrayList<Notiz>();
private boolean is_enthalten_wichtige_text;
public int z_Notizen_mit_unerledigtenAufgaben=0;

public int erstelle_Notiz(String ss_text)
	{Notiz w_Notiz;
	for (Notiz i_notiz: lst_Notiz)
		{lfd_NotizNr = i_notiz.getNotizNr();		
		}
	lfd_NotizNr +=1;
	w_Notiz = new Notiz(ss_text, lfd_NotizNr);
	lst_Notiz.add(w_Notiz);
	return lfd_NotizNr;	
	}

public String get_Notiz_Inhalt(int ss_NotizNr)
	{String w_NotizInhalt = null;
	for (Notiz i_Notiz : lst_Notiz)
		{if (ss_NotizNr == i_Notiz.getNotizNr())
			{w_NotizInhalt = i_Notiz.get_Inhalt();		
			}	
		}
	return w_NotizInhalt;	
	}

public void loesche_Notiz (int ss_NotizNr)
	{if (ss_NotizNr == lst_Notiz.get(lst_Notiz.size()-1).getNotizNr())
		{Notiz i_Notiz = lst_Notiz.get(lst_Notiz.size()-1);
		lst_Notiz.remove(i_Notiz);
		}
	else
		{for (Notiz i_Notiz : lst_Notiz)
			{if (ss_NotizNr == i_Notiz.getNotizNr())
				{lst_Notiz.remove(i_Notiz);
				}		
			}
			
		}	
	}

public void erweitere_Notiz(int ss_NotizNr,int ss_einfuegeStelle,
												String ss_text)
	{for (Notiz i_Notiz : lst_Notiz)
		{if (ss_NotizNr == i_Notiz.getNotizNr())
			{i_Notiz.erweitere_Fliesstext(ss_einfuegeStelle, ss_text);
			}
		}
	}
		
public boolean is_NotizNr_existiert(int ss_NotizNr)
	{boolean is_NotizNr_existiert = false;
	for (Notiz i_Notiz : lst_Notiz)
		{if (ss_NotizNr == i_Notiz.getNotizNr())
			{is_NotizNr_existiert = true;
			}
		}
	return is_NotizNr_existiert;	
	}

public void redo(int ss_Notiznr)
	{for (Notiz i_Notiz : lst_Notiz)
		{if (ss_Notiznr == i_Notiz.getNotizNr())
			{i_Notiz.redo();
			}	
		}
	}

private boolean is_Notizen_mitWichtige_Text(String ss_wichtigesTextStuck)
	{z_Notizen_mitWichtigeText = 0;
	for (Notiz i_Notiz : lst_Notiz)
		{if (i_Notiz.is_enthalten(ss_wichtigesTextStuck))
			{z_Notizen_mitWichtigeText++;
			is_enthalten_wichtige_text = true;
			}
		}
	return is_enthalten_wichtige_text;
	}

public String[][] get_Notizen_mitWichtige_Text(String ss_wichtigesTextStuck)
	{int i=0;
	is_enthalten_wichtige_text = false;
	String[][] wichitige_textStuecke = null;
	if (is_Notizen_mitWichtige_Text(ss_wichtigesTextStuck))
		{wichitige_textStuecke = new String[z_Notizen_mitWichtigeText][2];
		for (Notiz i_Notiz : lst_Notiz)
			{if (i_Notiz.is_enthalten(ss_wichtigesTextStuck))
				{wichitige_textStuecke[i][0] = ""+i_Notiz.getNotizNr();
				wichitige_textStuecke[i][1] = i_Notiz.get_Inhalt();
				i++;
				}	
			}	
		}
	return wichitige_textStuecke;
	}

public int[] get_Notiz_Alter(int ss_Notiznr)
	{int[] notiz_Alter = new int[3];
	for (Notiz i_Notiz : lst_Notiz)
		{if (ss_Notiznr == i_Notiz.getNotizNr())
			{notiz_Alter = i_Notiz.get_Notiz_Alter();
			}	
		}
	return 	notiz_Alter;
	}

public ArrayList<Notiz> get_Notizen_innerhalb_Datumsintervalls
								(String ss_startDatum,String ss_endDatum)
	{ArrayList<Notiz> lst_Notizen_innerhalb_Datumsintervalls 
													= new ArrayList<Notiz>();
	String[] t_startDatum = ss_startDatum.split("-");
	GregorianCalendar startdatum = new GregorianCalendar
			(Integer.parseInt(t_startDatum[0])
					,Integer.parseInt(t_startDatum[1])
					,Integer.parseInt(t_startDatum[2]));
	String[] t_endDatum = ss_endDatum.split("-");
	GregorianCalendar enddatum =
			new GregorianCalendar(Integer.parseInt(t_endDatum[0])
			,Integer.parseInt(t_endDatum[1])
			,Integer.parseInt(t_endDatum[2]));
	for (Notiz i_Notiz : lst_Notiz)
		{GregorianCalendar Notiz_Datum =
							i_Notiz.get_Notiz_Erstellungsdatum();
		if (Notiz_Datum.after(startdatum) && Notiz_Datum.before(enddatum))
			{lst_Notizen_innerhalb_Datumsintervalls.add(i_Notiz);	
			}
		}
	return lst_Notizen_innerhalb_Datumsintervalls;
	}

public ArrayList<Notiz> get_Notizen_nach_Datum(String ss_datum)
	{ArrayList<Notiz> lst_notizen_nach_Datum = new ArrayList<Notiz>();
	String[] t_datum = ss_datum.split("-");
	GregorianCalendar datum = 
			new GregorianCalendar(Integer.parseInt(t_datum[0])
			,Integer.parseInt(t_datum[1]),
			Integer.parseInt(t_datum[2]));
	for (Notiz i_Notiz : lst_Notiz)
		{GregorianCalendar Notiz_Datum 
								= i_Notiz.get_Notiz_Erstellungsdatum();
		if (Notiz_Datum.after(datum))
			{lst_notizen_nach_Datum.add(i_Notiz);	
			}
		}
	return lst_notizen_nach_Datum;
	}

public ArrayList<Notiz> get_Notizen_vor_Datum(String ss_datum)
	{ArrayList<Notiz> lst_notizen_nach_Datum = new ArrayList<Notiz>();
	String[] t_datum = ss_datum.split("-");
	GregorianCalendar datum = 
				new GregorianCalendar(Integer.parseInt(t_datum[0])
			,Integer.parseInt(t_datum[1]),
			Integer.parseInt(t_datum[2]));
	for (Notiz i_Notiz : lst_Notiz)
		{GregorianCalendar Notiz_Datum =
							i_Notiz.get_Notiz_Erstellungsdatum();
		if (Notiz_Datum.before(datum))
			{lst_notizen_nach_Datum.add(i_Notiz);	
			}
		}
	return lst_notizen_nach_Datum;
	}

public String[][] get_Notizen_mit_unerledigteAufgaben()
	{double gesamte_unerledigteAufgaben_Zeitaufwand
	= get_gesamte_unerledigteAufgaben_Zeitaufwand();
	String[][] Notizen_mit_unerledigteAufgaben = 
			new String[z_Notizen_mit_unerledigtenAufgaben][4];
	int i=0;
	for (Notiz i_Notiz : lst_Notiz)
		{i_Notiz.get_unerledigteAufgaben_Zeitaufwand();
		if (i_Notiz.getAbsolute_AufgabenZeit()!=0)
			{Notizen_mit_unerledigteAufgaben[i][0] = ""+i_Notiz.getNotizNr();
			Notizen_mit_unerledigteAufgaben[i][1] = i_Notiz.get_Inhalt();
			Notizen_mit_unerledigteAufgaben[i][2] 
									= "" + i_Notiz.getAbsolute_AufgabenZeit();
			Notizen_mit_unerledigteAufgaben[i][3] = ""+ 
					(int)((i_Notiz.getAbsolute_AufgabenZeit()*100)
									/gesamte_unerledigteAufgaben_Zeitaufwand);
			i++;
			}
		}
	return Notizen_mit_unerledigteAufgaben;
	}

private double get_gesamte_unerledigteAufgaben_Zeitaufwand()
	{z_Notizen_mit_unerledigtenAufgaben=0;
	double gesammteZeit_unerledigteAufgaben=0;
		for (Notiz i_Notiz : lst_Notiz)
		{if (i_Notiz.get_unerledigteAufgaben_Zeitaufwand()!=0)
			{gesammteZeit_unerledigteAufgaben += 
								i_Notiz.get_unerledigteAufgaben_Zeitaufwand();
			z_Notizen_mit_unerledigtenAufgaben++;	
			}	
		}
	return gesammteZeit_unerledigteAufgaben;	
	}
public void speicher_notizen() 
	{Archivar meinArchivar = new Archivar();
	meinArchivar.write();
	meinArchivar.speichere_Object(lst_Notiz);
	}

public  void lese_notizen() 
	{Archivar meinArchivar =new Archivar();
	meinArchivar.read();
	lst_Notiz = meinArchivar.read_Object();
	}
}
