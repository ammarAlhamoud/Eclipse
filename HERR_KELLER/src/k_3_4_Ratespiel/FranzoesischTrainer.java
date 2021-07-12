
package k_3_4_Ratespiel;

public class FranzoesischTrainer implements Trainer
  {private int anzahlFragen = 4;
  
   public String get_Name()
     {return "Französisch";}
  
   public String get_Frage(int ss_fragenr)
     {String ss_Frage = "";
     
      String frage1 = "'Welt' auf französisch?";
      String frage2 = "'vingt-et-un' - Welche Zahl ist das?";
      String frage3 = "Was heisst 'rot' auf französisch?";
      String frage4 = "Was bedeutet 'aujourd'hui'?";
      
      switch(ss_fragenr % anzahlFragen)
      		{case 0: ss_Frage = frage1;
      				 break;
      		 case 1: ss_Frage = frage2;
      		 		 break;
      		 case 2: ss_Frage = frage3;
      		 		 break;
      		 case 3: ss_Frage = frage4;
      		 		 break;
      		}
      
      return ss_Frage;
     }
   public boolean is_richtige_Antwort_auf_Frage(int ss_fragenr, String ss_antwort)
     {boolean is_richtige_Antwort = false;
	  
      String antwort1 = "monde";
      String antwort2 = "21";
      String antwort3 = "rouge";
      String antwort4 = "heute";
      
      switch(ss_fragenr % anzahlFragen)
      		{case 0: if(ss_antwort.matches(antwort1))
      				   {is_richtige_Antwort = true;}
      				 break;
      		 case 1: if(ss_antwort.matches(antwort2))
			   		   {is_richtige_Antwort = true;}
      		 		 break;
      		 case 2: if(ss_antwort.matches(antwort3))
	   		   		 {is_richtige_Antwort = true;}
      		 		 break;
	 		 
      		 case 3: if(ss_antwort.matches(antwort4))
	   		   		 {is_richtige_Antwort = true;}
      		 		 break;
      		}
      
      return is_richtige_Antwort;
     }
	

  }
