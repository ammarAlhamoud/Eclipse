package k_5_2_Schiffe_abstrakt;
public abstract class Schiff 
  {protected Teil t_Teil[];
   protected boolean isVersenkt = false;
  
   public Schiff(char ss_ausrichtung, int ss_laenge, int ss_startX, int ss_startY) 
     {t_Teil = new Teil[ss_laenge];
      
      if(ss_ausrichtung != 'h' && ss_ausrichtung != 'v')
      	{throw new IllegalArgumentException("Falsche Ausrichtung");}
      if(ss_ausrichtung == 'h' && ss_startX + ss_laenge > 9)
        {throw new IllegalArgumentException("Unmögliche Position");}
      if(ss_ausrichtung == 'v' && ss_startY + ss_laenge > 9)
      	{throw new IllegalArgumentException("Unmögliche Position");}
     
      for(int i_Teil = 0; i_Teil < ss_laenge; i_Teil++)
         {switch(ss_ausrichtung)
            {case 'h': t_Teil[i_Teil] = new Teil(ss_startX + i_Teil, ss_startY);
                       break;
             case 'v': t_Teil[i_Teil] = new Teil(ss_startX, ss_startY + i_Teil);
             		   break;
             default: throw new IllegalArgumentException("Falsche Ausrichtung");
            }
         } 
     }
   
   public boolean isVersenkt()
   	 {return isVersenkt;}
   
   public int getLaenge()
     {return t_Teil.length;}
   
   public void setTreffer(int ss_x, int ss_y) throws Exception
     {boolean isNichtGetroffen = true;
      boolean ss_isVersenkt = true;
      for(int i_Teil = 0; i_Teil < t_Teil.length; i_Teil++)
         {// Treffer registrieren
    	  if(ss_x == t_Teil[i_Teil].getX() && ss_y == t_Teil[i_Teil].getY())
            {isNichtGetroffen = false;
        	 t_Teil[i_Teil].setTreffer();
            }
    	  // Treffer überprüfen, wenn alle Teile getroffen, dann versenkt
    	  if(t_Teil[i_Teil].isGetroffen() == false)
    	    {ss_isVersenkt = false;}
         }
      isVersenkt = ss_isVersenkt;
      if(isNichtGetroffen)
        {throw new IllegalArgumentException("Kein Treffer!");}     
     }
   
   public boolean isPositionBelegt(int ss_x, int ss_y)
     {boolean ss_isPositionBelegt = false;
      for(int i_Teil = 0; i_Teil < t_Teil.length; i_Teil++)
      	 {if(t_Teil[i_Teil].getX() == ss_x && t_Teil[i_Teil].getY() == ss_y)
      	 	{ss_isPositionBelegt = true;}
     	 }
      return ss_isPositionBelegt;
     }
   
   public Teil[] getTeile()
   	 {return t_Teil;}
   
   public String getTyp()
 	 {return "";}
   
   public boolean get_isVersenkt()
     {return isVersenkt;}
  }