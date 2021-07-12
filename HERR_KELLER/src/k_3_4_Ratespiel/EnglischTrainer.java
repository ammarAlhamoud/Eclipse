
package k_3_4_Ratespiel;

public class EnglischTrainer implements Trainer
  {private int anzahlFragen = 2;
   public String get_Name()
     {return "Englisch";}
  
   public String get_Frage(int ss_fragenr)
     {String ss_Frage = "";
	   
      String frage1 = "English word for 'lernen'?";
      String frage2 = "11 ausgeschrieben";
      
      switch(ss_fragenr % anzahlFragen)
      		{case 0: ss_Frage = frage1;
      				 break;
      		 case 1: ss_Frage = frage2;
      		 		 break;
      		}
      
      return ss_Frage;
     }
   public boolean is_richtige_Antwort_auf_Frage(int ss_fragenr, String ss_antwort)
     {boolean is_richtige_Antwort = false;
	  
      String antwort1 = "learn";
      String antwort2 = "eleven";
      
      switch(ss_fragenr % anzahlFragen)
      		{case 0: if(ss_antwort.matches(antwort1))
      				   {is_richtige_Antwort = true;}
      				 break;
      		 case 1: if(ss_antwort.matches(antwort2))
			   		   {is_richtige_Antwort = true;}
      		 		 break;
      		}
     
      return is_richtige_Antwort;
     }
	

  }
