
package k_3_4_Ratespiel;

//import k_3_privat.io.TypeCaster;


public class MatheTrainer implements Trainer
  {public String get_Name()
     {return "Mathe";}
	
   public String get_Frage(int ss_fragenr)
     {String ss_Frage = "";
	  int operatornr = (ss_fragenr / 100) % 10;
	  int operand1 = (ss_fragenr / 1000) % 100;
	  int operand2 = ss_fragenr % 100;
      
      switch(operatornr % 4)
      		{case 0: ss_Frage = "Wieviel ist " + operand1 +
                                " * " + operand2 + " ?";
      				 break;
      		 case 1: ss_Frage = "Wieviel ist " + operand1 +
      		 					" + " + operand2 + " ?";
      		 		 break;
      		 case 2: ss_Frage = "Wieviel ist " + operand1 +
								" - " + operand2 + " ?";
      		 		 break;
      		 case 3: ss_Frage = "Wieviel ist " + operand2 +
								" - " + operand1 + " ?";
      				 break;
      		}
      
      return ss_Frage;
     }
   public boolean is_richtige_Antwort_auf_Frage(int ss_fragenr, String ss_antwort)
     {boolean is_richtige_Antwort = false;
	  int richtigeAntwort = 0;
	  int operatornr = (ss_fragenr / 100) % 10;
	  int operand1 = (ss_fragenr / 1000) % 100;
	  int operand2 = ss_fragenr % 100;
	  
	  switch(operatornr % 4)
	  		{case 0: richtigeAntwort = operand1 * operand2;
	  				 break;
	  		 case 1: richtigeAntwort = operand1 + operand2;
				 	 break;
			 case 2: richtigeAntwort = operand1 - operand2;
			 		 break;
			 case 3: richtigeAntwort = operand2 - operand1;
			 		 break;
	  		}
	  
	//  if(richtigeAntwort == TypeCaster.get_Integer(ss_antwort))
	  	{is_richtige_Antwort = true;}
      
	  return is_richtige_Antwort;
     }
  }
