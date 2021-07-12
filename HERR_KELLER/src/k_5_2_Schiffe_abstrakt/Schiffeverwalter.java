package k_5_2_Schiffe_abstrakt;

public class Schiffeverwalter 
  {private Schiff t_Schiff[];
   private boolean isLetztesSchiffVersenkt = false;
   private int z_Schiff = 0;
   
   
   public Schiffeverwalter()
     {t_Schiff = new Schiff[1];
      try{t_Schiff[0] = new Uboot('v',3,0);}
      catch(Exception e){}
     }
   
   
   public Schiffeverwalter(int ss_anzahl)
     {t_Schiff = new Schiff[ss_anzahl];      
      for(int i_Schiff = 0; i_Schiff < ss_anzahl; i_Schiff++)
         {Schiff meinSchiff = null;
    	  boolean isSchiffErfolgreichPlatziert = false;
    	  do
    	  	{char ausrichtung;
    	  	 int x,y, laenge, typ;
    	  	 if(zufallsZiffer(0,1) == 1)
    	  	   {ausrichtung = 'v';}
    	  	 else
    	  	   {ausrichtung = 'h';}
    	  	 x = zufallsZiffer(0,9);
    	  	 y = zufallsZiffer(0,9);
    	  	 typ = Schiffeverwalter.zufallsZiffer(1,2);
    	  	 if(typ == 1)
    	  	   {laenge = Schiffeverwalter.zufallsZiffer(2,5);}
    	  	 else
    	  	   {laenge = 2;}
    	  	 try
    	  	 	{meinSchiff = kreiereSchiff(typ, ausrichtung, laenge, x, y);
    	  	 	 isSchiffErfolgreichPlatziert = true;
    	  	 	}
    	  	 catch(Exception e)
    	  	 	{isSchiffErfolgreichPlatziert = false;}
    	  	}
    	  while(!isSchiffErfolgreichPlatziert);
    	  t_Schiff[i_Schiff] = meinSchiff;
    	  z_Schiff++;
         }
     }
   
   public void registriereTreffer_bei_Schiff(int ss_x, int ss_y) throws Exception
     {boolean isNichtGetroffen = true;
	  Exception keinTreffer = null;
      for(int i_Schiff = 0; i_Schiff < t_Schiff.length; i_Schiff++)
         {try
         	{t_Schiff[i_Schiff].setTreffer(ss_x, ss_y);
         	 isNichtGetroffen = false; 
         	 isLetztesSchiffVersenkt = t_Schiff[i_Schiff].isVersenkt();
         	}
    	  catch(Exception e)
    	    {keinTreffer = e;}    	  
         }
      if(isNichtGetroffen)
        {throw keinTreffer;}	  
     }
   
   public boolean isLetztesSchiffVersenkt()
     {return isLetztesSchiffVersenkt;}
   
   public int get_Schiffsanzahl()
   	 {return t_Schiff.length;}
   
   public Schiff[] get_Schiffe()
 	 {return t_Schiff;}
   
   public static int zufallsZiffer(int ss_min, int ss_max)
     {int ss_Ziffer;
      ss_Ziffer = ((int) (Math.random() * 10000)) % (ss_max + 1 - ss_min);
      ss_Ziffer += ss_min;
      return ss_Ziffer;
     }
   
   private Schiff kreiereSchiff(int ss_typ, char ss_ausrichtung, int ss_laenge, int ss_startX, int ss_startY) throws Exception
     {Schiff ss_meinSchiff;
	  for(int i_Schiff = 0; i_Schiff < z_Schiff; i_Schiff++)
     
         {for(int i_Teil = 0; i_Teil < ss_laenge; i_Teil++)
             {switch(ss_ausrichtung)
        	      {case 'h': if(t_Schiff[i_Schiff].isPositionBelegt(ss_startX + i_Teil, ss_startY))
        	      			   {throw new IllegalArgumentException("Position belegt");}
        	    	  		 break;
        	       case 'v': if(t_Schiff[i_Schiff].isPositionBelegt(ss_startX, ss_startY + i_Teil))
        	       			   {throw new IllegalArgumentException("Position belegt");}
        	    	   		 break;
        	       default: throw new IllegalArgumentException("Falsche Ausrichtung");
        	      }
             }
         }
      try
      	{if(ss_typ == 1)
    	   {ss_meinSchiff = new Kreuzer(ss_ausrichtung, ss_laenge,ss_startX,ss_startY);}
      	 else
      	   {ss_meinSchiff = new Uboot(ss_ausrichtung,ss_startX,ss_startY);}
      	}
      catch(Exception e)
      	{throw e;}
      
      return ss_meinSchiff;
     }
     
   public boolean isSpielbeendet()
     {boolean ss_isSpielbeendet = true;
      for(int i_Schiff = 0; i_Schiff < t_Schiff.length; i_Schiff++)
         {if(!(t_Schiff[i_Schiff].isVersenkt()))
            {ss_isSpielbeendet = false;}
         }
      return ss_isSpielbeendet;
     }
  }