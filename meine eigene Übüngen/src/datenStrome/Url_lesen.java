package datenStrome;

import java.awt.Desktop;
import java.io.*;
import java.net.*;

public class Url_lesen {

	public static void main(String[] args) 
	{URL url;
	URLConnection urlConection;
	String text= "";
	String zeile_Website = "";
	
	try
		{url = new URL("http://www.it-tem.de/leistungen/software-engineering.html");
		urlConection = url.openConnection();
		InputStreamReader isr = new InputStreamReader(urlConection.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Inhalt der Seite :");
		while((zeile_Website = br.readLine())!= null)
			{text += zeile_Website + "\n";	
			}
		System.out.println(text);
		
		}
	
	catch(Exception e)
		{
			
		}

	}

}
