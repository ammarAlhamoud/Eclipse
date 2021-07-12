package k_5_2_Schiffe_abstrakt;




public class Kreuzer extends Schiff
  {public Kreuzer(char ss_ausrichtung, int ss_laenge,int ss_startX, int ss_startY)
     {super(ss_ausrichtung, ss_laenge, ss_startX, ss_startY);
	 }
  
   public String getTyp()
	 {return "Kreuzer";}
  }