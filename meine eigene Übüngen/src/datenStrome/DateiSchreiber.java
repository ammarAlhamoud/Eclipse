package datenStrome;

import java.io.*;

public class DateiSchreiber {
public static void main(String[] args) throws IOException
	{//Dateiwriter();
	System.out.println("............................");
	//Dateileser();
	 
	        FileReader in = null;
	        FileWriter out = null;
	 
	        try {
	            in = new FileReader("D:\\input.txt");
	            out = new FileWriter("D:\\output.txt");
	            int c;
	 
	            while ((c = in.read()) != -1) {
	                out.write(c);
	            }
	        }
	        catch(IOException e) {
	            System.out.println("There is IOException!");
	        }
	        finally {
	            if (in != null) {
	                in.close();
	            }
	            if (out != null) {
	                out.close();
	            }
	        }
	 
	    }


private static void Dateiwriter()
	{String zeile;
	try 
		{FileWriter datei = new FileWriter("namen.txt");
		BufferedWriter dat_writer = new BufferedWriter(datei);
		InputStreamReader tast_in = new InputStreamReader(System.in);
		BufferedReader tast_puffer = new BufferedReader(tast_in);
		System.out.println("Bitte Namen eingeben");
		zeile = tast_puffer.readLine();
		while(zeile.compareTo("EXIT")!=0)
			{dat_writer.write(zeile);
			dat_writer.newLine();
			System.out.println("Bitte Namen eingeben");
			zeile = tast_puffer.readLine();
			};
			dat_writer.close();
		}
	catch (Exception e)
		{e.printStackTrace();
		}	
	}

private static void Dateileser()
	{String name;
	try
		{FileReader reader_namen = new FileReader("namen.txt");
		BufferedReader bufreader_namen = new BufferedReader(reader_namen);
		name = bufreader_namen.readLine();
		while (name != null)
			{System.out.println("Hallo " + name);
			name = bufreader_namen.readLine();
			}
		bufreader_namen.close();
		}
	catch(FileNotFoundException e)
		{System.out.println("namen nicht gefunden");
		}
	catch(Exception e)
		{System.out.println("Fehler: " + e.getMessage());	
		}
	
		
	}

}
