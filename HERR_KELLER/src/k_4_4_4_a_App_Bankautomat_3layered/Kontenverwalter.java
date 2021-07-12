package k_4_4_4_a_App_Bankautomat_3layered;
import java.io.*;


public class Kontenverwalter
  {private Konto[] t_Konto;
   private int z_Konto = 0;
   private int lfdKontonr;
   private int z_geloeschteKonten;
   
   private Kontenarchivator kontenarchivator = null;
   
   
   public Kontenverwalter()
   	 {
	  try
   	   {kontenarchivator = new Kontenarchivator();
   	    t_Konto =    kontenarchivator.get_archivierte_Konten();
   	    lfdKontonr = kontenarchivator.get_lfdKontonr();
       }
   	  catch(Exception e)
   	    {throw new IllegalArgumentException();}
     }
   
   
   
   
   public void Konten_speichern()
   {try 
   	{kontenarchivator.save_Konten(z_Konto, t_Konto, lfdKontonr);   
   	}
    catch(Exception e)
    	{throw new IllegalArgumentException();}
   }
   
 
   
   public int create_neuesKonto()
     {int ss_kontonr;
      t_Konto[z_Konto] = new Konto(lfdKontonr, 0);
      ss_kontonr = t_Konto[z_Konto].get_Nr();
	  z_Konto++; 
	  lfdKontonr++;
	  return ss_kontonr;
     }
   
   public void konto_loeschen(int ss_Kontonr)
     {boolean isKontoVorhanden = false;
	  for(int i = 0; i < z_Konto + z_geloeschteKonten; i++)
  	     {if(t_Konto[i] != null)
  	        {if(ss_Kontonr == t_Konto[i].get_Nr())
  	        	{t_Konto[i] = null;
  	        	 isKontoVorhanden = true;
  	        	 z_Konto--;
  	        	 z_geloeschteKonten++;
  	        	}
  	        }
  	     }
	 
		  
	  if(!isKontoVorhanden)
	  	{throw new IllegalArgumentException("Konto nicht vorhanden");}
    }
   
   public void verbuchen(int ss_Kontonr, double ss_Betrag)
     {boolean isKontoVorhanden = false;
	  for(int i = 0; i < z_Konto + z_geloeschteKonten; i++)
     	 {if(t_Konto[i] != null)
     	 	{
     		 if(ss_Kontonr == t_Konto[i].get_Nr())
     		 	{t_Konto[i].verbuchen(ss_Betrag);
     		 	 isKontoVorhanden = true;
     		 	}
     	 	}
     	 }
	  if(!isKontoVorhanden)
	  	{throw new IllegalArgumentException("Konto nicht vorhanden");}
     }
   
   public void set_Bestand(int ss_Kontonr, double ss_Betrag)
   {boolean isKontoVorhanden = false;
	  for(int i = 0; i < z_Konto + z_geloeschteKonten; i++)
   	 	 {if(t_Konto[i] != null)
   	 	 	{
   	 		 if(ss_Kontonr == t_Konto[i].get_Nr())
   	 	 		{t_Konto[i].set_Stand(ss_Betrag);
   	 	 		 isKontoVorhanden = true;
   	 	 		}
   	 	 	}
   	 	 }
	  if(!isKontoVorhanden)
	  	{throw new IllegalArgumentException("Konto nicht vorhanden");}
   }
   
   public double get_Kontostand(int ss_kontonr)
   	 {double ss_Kontostand = 0;
   	  boolean isKontoVorhanden = false;
	  for(int i = 0; i < z_Konto + z_geloeschteKonten; i++)
	  	 {if(t_Konto[i] != null)
	  	 	{
	  		 if(ss_kontonr == t_Konto[i].get_Nr())
	  		 	{ss_Kontostand = t_Konto[i].get_Stand();
	  		 	 isKontoVorhanden = true;
	  		 	}
	  	 	}
	  	 }
	  if(!isKontoVorhanden)
	  	{throw new IllegalArgumentException("Konto nicht vorhanden");}
   	  return ss_Kontostand;
   	 }
   
     
   public int get_Kontenzahl()
     {return z_Konto;}
   
   public int get_lfdKontonr()
     {return lfdKontonr;}
  }