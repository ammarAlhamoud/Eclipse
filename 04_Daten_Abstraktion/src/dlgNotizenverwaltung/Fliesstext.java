package dlgNotizenverwaltung;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.*;

public class Fliesstext implements Serializable
{private StringBuffer text;
private boolean is_enthalten = false; 

public Fliesstext(String ss_text)
	{SimpleDateFormat date_der_Erstellung = 
								new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
	Date datum = new Date();
	String erstellungsdatum = date_der_Erstellung.format(datum);
	text = new StringBuffer(erstellungsdatum + ": " + ss_text);
	}

public String get_Inhalt()
	{String w_text;
	w_text = this.text.toString(); 
	return w_text;	
	}

public void erweitere_Fliesstext(int ss_einfuegeStelle, String ss_text)
	{text.delete(21, 41);
	text.insert(ss_einfuegeStelle ,ss_text);	
	}

public boolean is_enthalten(String ss_wichtigesTextStuck)
	{is_enthalten = false;
	Pattern pattern = Pattern.compile("<u>.*?</u>");
	Matcher matcher = pattern.matcher(text);
	while (matcher.find())
		{if (matcher.group().equals("<u>"+ss_wichtigesTextStuck+"</u>"))
			{is_enthalten = true;
			}	
		}	
	return is_enthalten;	
	}

}
