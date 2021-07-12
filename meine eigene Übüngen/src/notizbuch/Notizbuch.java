package notizbuch;

import java.util.ArrayList;

public class Notizbuch {
	private static int z_notiz=0;
	private static ArrayList<Notiz> lst_notiz = new ArrayList<>();
	
	public static void speicher_notizen() {
		Archivar meinArchivar =new Archivar();
		meinArchivar.write();
		meinArchivar.speichere_Object(lst_notiz);
	}
	
	public static void lese_notizen() {
		Archivar meinArchivar =new Archivar();
		meinArchivar.read();
		lst_notiz = meinArchivar.read_Object();
	}
	
	public static int create_notiz(String ss_text) {
		z_notiz++;
		lst_notiz.add(new Notiz(ss_text, z_notiz));
		return z_notiz;
	}
	
	public static int get_z_notiz() {
		return z_notiz;
	}
	
	public static String get_inhalt(int ss_notiznr) {
		String ss_inhalt = "Notiz nicht vorhanden";
		ss_inhalt = lst_notiz.get(get_notiz_pos(ss_notiznr)).get_inhalt();
		return ss_inhalt;
	}
	
	public static String get_alle_inhalte() {
		String ss_alle_inhalte = "";
		for(Notiz i_notiz:lst_notiz)
		{	ss_alle_inhalte += "Notiz "+i_notiz.get_notiznr()+
								": "+ i_notiz.get_inhalt()+"\n";
		}				
		return ss_alle_inhalte;
	}
	
	public static void erweitere_notiz(int ss_notiznr, int ss_einfuegestelle, String ss_text) {
		lst_notiz.get(get_notiz_pos(ss_notiznr)).erweitere_fliesstext(ss_einfuegestelle, ss_text);
	}
	
	public static void loesche_notiz(int ss_notiznr) {
		lst_notiz.remove(get_notiz_pos(ss_notiznr));
	}
	
	public static void redo(int ss_notiznr) {
		lst_notiz.get(get_notiz_pos(ss_notiznr)).redo();
	}
	
	private static int get_notiz_pos(int ss_notiznr) {
		int i_notiz_pos=0, ss_notiz_pos=-1;
		for(Notiz i_notiz:lst_notiz)
		{	if(i_notiz.get_notiznr()==ss_notiznr)
			{	ss_notiz_pos = i_notiz_pos; }	
			i_notiz_pos++;
		}		
		return ss_notiz_pos;
	}
	
	public static String get_alle_notiznr() {
		String ss_alle_notiznr = "";
		for(Notiz i_notiz:lst_notiz)
		{	ss_alle_notiznr += " "+i_notiz.get_notiznr();
		}				
		return ss_alle_notiznr;
	}
	
	public static String get_notizen_mit_suchtext(String ss_suchtext) {
		String notizen_mit_suchtext ="";
		for(Notiz i_notiz:lst_notiz)
		{	if(i_notiz.is_suchtext_enthalten(ss_suchtext))
			{	notizen_mit_suchtext += "Notiz "+i_notiz.get_notiznr()+": "+ i_notiz.get_inhalt()+"\n";			
			}
		}				
		if(notizen_mit_suchtext.equals(""))	notizen_mit_suchtext = "keine Notizen gefunden\n";	
		return notizen_mit_suchtext;
	}
	
	public static String get_notizen_mit_schlagwort(String ss_suchtext) {
		String notizen_mit_schlagwort ="";
		for(Notiz i_notiz:lst_notiz)
		{	if(i_notiz.is_schlagwort_enthalten(ss_suchtext))
			{	notizen_mit_schlagwort += "Notiz "+i_notiz.get_notiznr()+
										": "+ i_notiz.get_inhalt()+"\n";			
			}
		}				
		if(notizen_mit_schlagwort.equals(""))	notizen_mit_schlagwort = "keine Notizen gefunden\n";	
		return notizen_mit_schlagwort;
	}
	
	public static String get_alle_schlagworte() {
		String schlagworte ="";
		for(Notiz i_notiz:lst_notiz)
		{	schlagworte += "Notiz "+i_notiz.get_notiznr()+": "+ i_notiz.get_alle_schlagworte()+"\n";						
		}					
		return schlagworte;
	}
	
	public static long get_alter(int ss_notiznr) {
		long alter = lst_notiz.get(get_notiz_pos(ss_notiznr)).get_alter();
		return alter;
	}
}
