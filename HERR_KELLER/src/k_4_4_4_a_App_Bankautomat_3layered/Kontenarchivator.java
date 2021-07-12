package k_4_4_4_a_App_Bankautomat_3layered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Kontenarchivator 
  { private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;  
	   
	private static int lfdKontonr;
    
	public Kontenarchivator()
	 {try
	   {bufferedReader = new BufferedReader(new FileReader("\\konten.txt"));
	   }
	  catch(Exception e)
	    {throw new IllegalArgumentException();
	    }
	 }
	
	public Konto[] get_archivierte_Konten()
		{Konto[] ss_t_eingelesenes_Konto = null;
		int z_Konto = 0;
		try
		   {z_Konto = Integer.parseInt(bufferedReader.readLine());
	        lfdKontonr = Integer.parseInt(bufferedReader.readLine());
	    
	        ss_t_eingelesenes_Konto = new Konto[z_Konto + 10];                           
	    
	       for(int i = 0; i < z_Konto; i++)
	         {int kontonr;
	          double kontostand;
	          String datensatz = bufferedReader.readLine();
	          int trennzeichen = datensatz.indexOf(":");
	          kontonr = Integer.parseInt(datensatz.substring(0, trennzeichen));
	          kontostand = Double.parseDouble(datensatz.substring(trennzeichen+1));
	
	          ss_t_eingelesenes_Konto[i] = new Konto(kontonr, kontostand);
     	      kontonr++;
	          lfdKontonr = kontonr;
	         }
	        lfdKontonr++;
		   }
		  catch(Exception e)
		    {throw new IllegalArgumentException();
		    }
		  return ss_t_eingelesenes_Konto;
		}
	
	public int get_lfdKontonr() {return lfdKontonr; }

	public void save_Konten(int ss_z_Konto, Konto[] ss_t_zuSpeicherndesKonto, int ss_lfdKontonr)
	 {try 
	 	{		 
		 String datensatz = "";
		 bufferedWriter = new BufferedWriter(new FileWriter("\\konten.txt"));
		 bufferedWriter.write(Integer.toString(ss_z_Konto));
		 bufferedWriter.newLine();
		 bufferedWriter.write(Integer.toString(ss_lfdKontonr));
		 bufferedWriter.newLine();
		 for(int i = 0; i < ss_z_Konto; i++)
		    {if(ss_t_zuSpeicherndesKonto[i] != null)
			 	{datensatz = "";
			 	 datensatz += ss_t_zuSpeicherndesKonto[i].get_Nr();
			 	 datensatz += ":";
			 	 datensatz += ss_t_zuSpeicherndesKonto[i].get_Stand();
			 
			 	 bufferedWriter.write(datensatz);
			 	 bufferedWriter.newLine();
			 	}
		    }
		 bufferedWriter.close();
	 	}
	  catch(Exception e)
	  	{}
	 }
}
