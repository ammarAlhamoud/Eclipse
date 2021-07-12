package k_5_2_Schiffe_abstrakt;
public class Uboot extends Schiff
  {private boolean isUntergetaucht = false;
   private int z_Tauchvorgang = 30;
   private int dauerBisZumAuftauchen = 1;
	
   public Uboot(char ss_ausrichtung, int start_x, int start_y)
  	 {super(ss_ausrichtung, 2, start_x, start_y);
  	 }
   
   public void setTreffer(int ss_x, int ss_y) throws Exception
   {boolean isNichtGetroffen = true;
    boolean ss_isVersenkt = true;
    boolean kannUntertauchen = true;
    for(int i_Teil = 0; i_Teil < t_Teil.length; i_Teil++)
       {// Treffer registrieren
  	  if(ss_x == t_Teil[i_Teil].getX() && ss_y == t_Teil[i_Teil].getY())
          {if(isUntergetaucht)
          	 {if(dauerBisZumAuftauchen == 0)
          	    {isUntergetaucht = false;
          	     kannUntertauchen = false;
          	    }
          	  else
          	    {dauerBisZumAuftauchen--;
          	    } 
          	 }
           else
           	 {isNichtGetroffen = false;
           	  t_Teil[i_Teil].setTreffer();
           	 }
          }
  	  // Treffer überprüfen, wenn alle Teile getroffen, dann versenkt
  	  if(t_Teil[i_Teil].isGetroffen() == false)
  	    {ss_isVersenkt = false;}
       }
    isVersenkt = ss_isVersenkt;
    
    if(isUntergetaucht)
      {z_Tauchvorgang--;
       if(Schiffeverwalter.zufallsZiffer(1,5) == 5)
         {isUntergetaucht = false;}
      }
    else
      {if(Schiffeverwalter.zufallsZiffer(0,1) == 1 && z_Tauchvorgang > 0 && kannUntertauchen)
         {isUntergetaucht = true;
          dauerBisZumAuftauchen = 1;
         }
      }
    
    if(isNichtGetroffen)
      {throw new IllegalArgumentException("Kein Treffer!");
      }     
   }
   
   public String getTyp()
	 {return "UBoot";} 
   
   public boolean get_isUntergetaucht()
     {return isUntergetaucht;}
   
   public int get_Tauchvorgang()
     {return z_Tauchvorgang;}
   
   public int get_dauerAuftauchen()
   	 {return dauerBisZumAuftauchen;}
  }
