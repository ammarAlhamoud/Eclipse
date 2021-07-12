package k_3_4_Ratespiel;

import ConsolReader.ConsolReader;


public class DlgQuizModerator 
  {/** @param args */
   public static void main(String[] args) 
     {String antwort;
      int fragenr, z_Frage=1;
      int z_Punkte=0;
      
      System.out.println("Willkommen beim Quiz! Jetzt geht's Los!");
      System.out.println("--");
      
      do
      	{fragenr = (int) (Math.random() * 100000);
      	 Trainer zugeteilterTrainer = Regie.getTrainer();
    	 
      	 System.out.println("[" + zugeteilterTrainer.get_Name() +
      			 			"] " + "Frage" + z_Frage + ": " + 
      			            zugeteilterTrainer.get_Frage(fragenr));
      	 z_Frage++;
      	 antwort = ConsolReader.readString();
      	 System.out.println(zugeteilterTrainer.is_richtige_Antwort_auf_Frage(fragenr, antwort));
      	 if(zugeteilterTrainer.is_richtige_Antwort_auf_Frage(fragenr, antwort))
      	 	{z_Punkte++;}
      	}
      while(!antwort.matches("quit"));
     }
  }