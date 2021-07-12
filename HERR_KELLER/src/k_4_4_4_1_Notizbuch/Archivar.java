package k_4_4_4_1_Notizbuch;

import java.io.*;
import java.util.ArrayList;

public class Archivar {
	public void speichere_Saetze(String[] ss_t_Satz) 
	 {FileWriter fWriter =null;
	 BufferedWriter bufWriter =null;
		
	try{
		fWriter = new FileWriter("Notizbuch.txt");
		bufWriter = new BufferedWriter(fWriter);
		for (int i = 0; i < ss_t_Satz.length; i++ )
		    {bufWriter.write(ss_t_Satz[i]);
		    bufWriter.newLine();
		    }
		bufWriter.close();
		}
	catch(Exception e)
	    {
		System.out.println("Schreibfehlermeldung nur für testphase");
		}
	}
	
	
	public ArrayList<String> lade_Saetze(){
		ArrayList<String> ss_al_Satz = null;
		try{
			String gelesenerSatz;
			FileReader fReader = new FileReader("Notizbuch.txt"); 
			BufferedReader bReader= new BufferedReader(fReader);
			
			ss_al_Satz = new ArrayList<String>();
			
			gelesenerSatz = bReader.readLine();
			for (int i = 0; gelesenerSatz != null; i++)
			    {ss_al_Satz.add(gelesenerSatz); 
			     gelesenerSatz = bReader.readLine();
			    } 
			
			bReader.close();
			
		}	catch(Exception e){
			      System.out.println("Lesefehlermeldung nur für testphase");
		          }
		return ss_al_Satz;
	}
}
