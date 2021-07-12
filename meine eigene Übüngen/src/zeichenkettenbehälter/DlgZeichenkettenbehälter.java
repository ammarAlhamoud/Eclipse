package zeichenkettenbehälter;

import java.util.regex.*;

public class DlgZeichenkettenbehälter {

	public static void main(String[] args) 
	{trennCheck();
	
	}

private void patternCheck()
	{String wiederholte_tags = ""+"<CurrentRow><columnName>Artnr</columnName><columnValue>4711</columnValue>"
			+"<columnName>Menge</columnName><columnValue>0815</columnValue></CurrentRow>";
			Pattern pattern = Pattern.compile("<columnValue>.*</columnValue>");
			Matcher matcher = pattern.matcher(wiederholte_tags);
			while(matcher.find())
				{	System.out.println(matcher.group());			
				}
			pattern = Pattern.compile("<columnValue>.*?</columnValue>");
			matcher = pattern.matcher(wiederholte_tags);
			while(matcher.find())
				{	System.out.println(matcher.group());			
				}
			}

private void mailCheck()
	{String email = new String("Ammar1007@gmail.com");
	System.out.println(email);
	String norm_email = "(.*).(.*)@(.*).com";
	System.out.println(email.matches(norm_email));	
	}

private static void trennCheck()
	{String datensatz = "hans/mayer/stuttgart";
	String[] t_satz_elm = datensatz.split("/");
	/** System.out.println(datensatz);
	System.out.println("t[0]:" + t_satz_elm[0]+ " " + "t[1]:" + t_satz_elm[1]+ " " + "t[2]:" + t_satz_elm[2]);
	System.out.println("..........................................");*/
	String druckzeile = "abc*efg*nijk"	;
	String[] t_knoten;
	/** t_knoten = druckzeile.split("\\Q*\\E");
	System.out.println("t[0]:" + t_knoten[0]+ " " + "t[1]:" + t_knoten[1]+ " " + "t[2]:" + t_knoten[2]);
	t_knoten = druckzeile.split(Pattern.quote("*"));
	System.out.println("t[0]:" + t_knoten[0]+ " " + "t[1]:" + t_knoten[1]+ " " + "t[2]:" + t_knoten[2]);
	t_knoten = druckzeile.split("\\*");
	System.out.println("t[0]:" + t_knoten[0]+ " " + "t[1]:" + t_knoten[1]+ " " + "t[2]:" + t_knoten[2] + "  length: "+ t_knoten.length);
	t_knoten = druckzeile.split("\\Qe*\\E");
	System.out.println("t[0]:" + t_knoten[0] );
	t_knoten = druckzeile.split("\\e*");
	System.out.println("t[0]:" + t_knoten[0]+ " " + "t[1]:" + t_knoten[1]+ " " + "t[2]:" + t_knoten[2] + "t[3]:" + t_knoten[3]
			+ "t[4]:" + t_knoten[4]);
	System.out.println("t[0]:" + t_knoten[0] +  "  length: "+ t_knoten.length ); */
	String[] items ="A|B|C|D".split("|");
	System.out.println("Nummber of Items : " + items.length);
	System.out.println(items[0]+ "  " + items[1]+ "  " +  items[2]+ "  " + items[3]+ "  " + items[4]);
	System.out.println("..........................................");
	String pfad = "java.util.StringTokenizer";
	String sondermuster = Pattern.quote(".");
	System.out.println(sondermuster);
	t_knoten = pfad.split(sondermuster);
	System.out.println("t[0]:" + t_knoten[0]+ " " + "t[1]:" + t_knoten[1]+ " " + "t[2]:" + t_knoten[2] + "  length: "+ t_knoten.length);
	}



}
