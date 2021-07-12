package k_4_4_4_1_Notizbuch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notiz
   {private int id;
    private Fliesstext aktFliesstext;
	
	public void text_einfügen (int position, String text)
	   {StringBuffer bf_aktFliesstext = aktFliesstext.get_Text();
		StringBuffer w_aktFliesstext = new StringBuffer(bf_aktFliesstext.toString());
		w_aktFliesstext.insert(position, text);
		Fliesstext neuerFliesstext = new Fliesstext(w_aktFliesstext.toString());
		neuerFliesstext.setPrevious_Version(aktFliesstext);
		aktFliesstext = neuerFliesstext;
    	}
	
	public void text_reduzieren(String text)
	  {	StringBuffer bf_aktFliesstext = aktFliesstext.get_Text();
		Fliesstext neuerFliesstext = new Fliesstext(bf_aktFliesstext.toString().replace(text, ""));
		neuerFliesstext.setPrevious_Version(aktFliesstext);
		aktFliesstext = neuerFliesstext;
	  }

	public String[] get_wichtigenText() {
		String[] ss_wichtigerText;
		StringBuffer inhalt = aktFliesstext.get_Text();
		int c_wichtigeStellen = 0;
		int i = 0;
		Pattern musterWichtig = Pattern.compile("<u>.*?</u>");
		Matcher matcher = musterWichtig.matcher(inhalt);

		while (matcher.find())
		      {c_wichtigeStellen++;
		      }
		matcher = musterWichtig.matcher(inhalt);
		ss_wichtigerText = new String[c_wichtigeStellen];
		 while(matcher.find() && i < c_wichtigeStellen )
		      {ss_wichtigerText[i] = matcher.group();
			   i++;
			  }
		return ss_wichtigerText;
	}

	public String get_Text() 
	   {return aktFliesstext.get_Text().toString();
	   }
	public void redo_Action() 
	  {aktFliesstext = aktFliesstext.getPrevious_Version();
	  }
	public Notiz(String ss_Inhalt, int ss_ID)
	  {	aktFliesstext = new Fliesstext(ss_Inhalt);
		id = ss_ID;
	  }
	
	public void text_loeschen(){
		Fliesstext neuerFliesstext = new Fliesstext("");
		neuerFliesstext.setPrevious_Version(aktFliesstext);
		aktFliesstext = neuerFliesstext;
		
	}
	public int get_Id() {return id;}
}
