package notizbuch;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.text.*;
import java.io.*;

public class Fliesstext implements Serializable {
	private StringBuffer text;
	
	public Fliesstext(String ss_text) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date datum = new Date();
		text = new StringBuffer(dateformat.format(datum)+ " " +ss_text);
	}
	
	public String get_inhalt() {
		String ss_text = text.substring(20,text.length());
		return ss_text;
	}
	
	public void erweitere_fliesstext(int ss_einfuegestelle,String ss_text) {
		text.insert(ss_einfuegestelle+20, ss_text);
	}
	
	public boolean is_suchtext_enthalten(String ss_suchtext) {
		boolean is_suchtext_enthalten = false;
		Matcher matcher = Pattern.compile(".*?"+ss_suchtext+".*?").matcher(text);
		while(matcher.find()) is_suchtext_enthalten = true;		
		return is_suchtext_enthalten;
	}
	
	public boolean is_schlagwort_enthalten(String ss_suchtext) {
		boolean is_suchtext_enthalten = false;
		Matcher matcher = Pattern.compile(".*?<u>"+ss_suchtext+"</u>.*?").matcher(text);
		while(matcher.find()) is_suchtext_enthalten = true;		
		return is_suchtext_enthalten;
	}
	
	public String get_alle_schlagworte() {
		String schlagworte="";
		Matcher matcher = Pattern.compile("<u>.*?</u>").matcher(text);
		while(matcher.find()) schlagworte += " "+matcher.group();	
		return schlagworte;
	}
	
	public long get_alter() {
		long alter_s;
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datum = text.substring(0,19);
		Date ddatum = null;
		try
		{	ddatum = dateformat.parse(datum);
		}
		catch(Exception e)
		{ System.out.println("Datumsfehler");
		}	
		alter_s = (System.currentTimeMillis()-ddatum.getTime())/1000;
		return alter_s;
	}
}
