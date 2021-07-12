package notizbuch;

import java.util.ArrayList;
import java.io.*;

public class Notiz implements Serializable {
	private int notiznr;	
	private  ArrayList<Fliesstext> lst_fliesstext = new ArrayList<>();
	
	public Notiz(String ss_text, int ss_notiznr) {
		notiznr = ss_notiznr;
		lst_fliesstext.add(new Fliesstext(ss_text));
		
	}
	
	public String get_inhalt() {
		loesche_alte_texte();
		String ss_inhalt = lst_fliesstext.get(lst_fliesstext.size()-1).get_inhalt();
		return ss_inhalt;
	}
	
	public void redo() {
		if(lst_fliesstext.size()>1)
		{	lst_fliesstext.remove(lst_fliesstext.get(lst_fliesstext.size()-1));
		}
	}
	
	public int get_notiznr() {
		return notiznr;
	}
	
	public void erweitere_fliesstext(int ss_einfuegestelle, String ss_text) {
		lst_fliesstext.add(new Fliesstext(lst_fliesstext.get(lst_fliesstext.size()-1).get_inhalt()));
		lst_fliesstext.get(lst_fliesstext.size()-1).erweitere_fliesstext(ss_einfuegestelle,ss_text);	
	}
	
	public boolean is_suchtext_enthalten(String ss_suchtext) {
		boolean is_suchtext_enthalten = lst_fliesstext.get(lst_fliesstext.size()-1).is_suchtext_enthalten(ss_suchtext);	
		return is_suchtext_enthalten;
	}
	
	public boolean is_schlagwort_enthalten(String ss_suchtext) {
		boolean is_suchtext_enthalten = lst_fliesstext.get(lst_fliesstext.size()-1).is_schlagwort_enthalten(ss_suchtext);	
		return is_suchtext_enthalten;
	}
	
	public String get_alle_schlagworte() {
		String ss_schlagworte = lst_fliesstext.get(lst_fliesstext.size()-1).get_alle_schlagworte();
		return ss_schlagworte;
	}
	
	public void loesche_alte_texte() {
		for(Fliesstext i_text:lst_fliesstext)
		{	if(i_text.get_alter()>3600) //alter in sekunden
			{	if(!(lst_fliesstext.indexOf(i_text)==lst_fliesstext.size()-1))
				{	lst_fliesstext.remove(i_text);	
				}
			}
		}
	}
	
	public long get_alter() {
		long alter = lst_fliesstext.get(lst_fliesstext.size()-1).get_alter();
		return alter;
	}
}
