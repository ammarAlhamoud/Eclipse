package k_3_2__Funktion;

import ConsolReader.ConsolReader;

public class DlgPaketauftrag_V_3_2_struct
{	private static class SS_Paket
     	{int  laenge,  breite,  hoehe,
	          paketGewicht,    z_PaketeGleicherArt;
     	 double laengenEinheit =1,gewichtseinheit=1;
		}
    

    private  static SS_Paket ss_Paket = new SS_Paket();  
    
	public static void main(String[] args) 
	{final float INCH = 2.54f;
	 final double POUND = 0.3732417216;	 
	 final float LIEFERRABATT = 0.1f;
	 
	
	 int  massKennNr; // 1 = deutsch, 2 = englisch
	 int z_PaketeGleicherArt; 
	 	 
	 double transportpreis_proPaket = 0;
	 double z_Lieferpreis = 0;
	 int z_PaketproLieferung = 0;
	 
	 
     
	  
	 try{System.out.println("MassKennNr eingeben: "+
	 		          " 2 = engl., 1 = sonst");
	      massKennNr = ConsolReader.readInt();
	     if ( massKennNr == 2)
	        {ss_Paket.gewichtseinheit = POUND;
	         ss_Paket.laengenEinheit   = INCH;
	        }
	     do{System.out.println("Bitte Anzahl an gleichartigen Paketen eingeben oder 0 (ErfssgEnde) ");
	        z_PaketeGleicherArt = ConsolReader.readInt();
	       
	       if( z_PaketeGleicherArt > 0)
	           {System.out.println("Bitte Paketgewicht entsprechend der MassKennNr eingeben " +
	        		              "Masseineiheit sind Pound bzw.kg - als Ganzzahlen");
	              ss_Paket.paketGewicht = ConsolReader.readInt();
	            
	             System.out.println("Bitte alle 3 Paketlängen entsprechend der MassKennNr eingeben +" +
	             "Masseineiheit sind INCH bzw.cm - als Ganzzahlen");
	             System.out.println("Länge ?");
	             ss_Paket.laenge = ConsolReader.readInt();
	             System.out.println("Breite ?");
	             ss_Paket.breite = ConsolReader.readInt();
	             System.out.println("Höhe ?");
	             ss_Paket.hoehe = ConsolReader.readInt();
	             
	             transportpreis_proPaket = get_Transportpreis_proPaket( ss_Paket);
	             
	             if (transportpreis_proPaket==0)
	                {System.out.println("Paketgroesse nicht transportabel");
	                }
	            	 
	               
	             else
	               {System.out.println("berechneter TransportPreis für Paket: " +  
	             		transportpreis_proPaket);	             
	         
	                z_Lieferpreis += transportpreis_proPaket* z_PaketeGleicherArt;
	                z_PaketproLieferung +=  z_PaketeGleicherArt; 
	               }
	           }//end if
	         }//end do-Rumpf
       while ( z_PaketeGleicherArt>0);
     
	     if (z_PaketproLieferung > 3)
	        {z_Lieferpreis = z_Lieferpreis*(1-LIEFERRABATT);
	        };
	     System.out.println("Anzahl an Pakete: " + z_PaketproLieferung); 
	     System.out.println("Gesamtlieferpreis: " + (int)(z_Lieferpreis*100)/100.0);
	 	 
	 	 }//end try  	
	catch (Exception e)
	    {System.out.println("Auftragserfassung abgebrochen");
	    }
	}//end main



   private static double get_Transportpreis_proPaket(SS_Paket ss_Paket)
		{final int GEWICHTSGRENZE_SCHWERPAKET = 25; 
		 final double PREIS_FUER_PAKETKLASSE_S = 3.90;
		 final double PREIS_FUER_PAKETKLASSE_L = 8.90;
	    
		 
		 double laengsteSeite = 0, kuerzesteSeite = 0;
		 double ss_lieferpreis_proPaket = 0;
			
		 if ( (int)(ss_Paket.paketGewicht /ss_Paket.gewichtseinheit)  > GEWICHTSGRENZE_SCHWERPAKET )
		
		   {ss_lieferpreis_proPaket = ss_Paket.laenge * ss_Paket.breite * ss_Paket.hoehe * 0.5;
		   }
		else{if (ss_Paket.laenge >= ss_Paket.breite && ss_Paket.laenge >= ss_Paket.hoehe)
		        {laengsteSeite = ss_Paket.laenge;
		        }
		     else if (ss_Paket.breite >= ss_Paket.laenge  && ss_Paket.breite >= ss_Paket.hoehe)
		             {laengsteSeite = ss_Paket.breite;
		             }
		     else {laengsteSeite = ss_Paket.hoehe;
		          }
		      }
		 
		if (ss_Paket.laenge <= ss_Paket.breite && ss_Paket.laenge <= ss_Paket.hoehe)
		    {kuerzesteSeite = ss_Paket.laenge;
		    }
		else if (ss_Paket.breite <= ss_Paket.laenge  && ss_Paket.breite <= ss_Paket.hoehe)
		     {kuerzesteSeite = ss_Paket.breite;
		     }
		else {kuerzesteSeite = ss_Paket.hoehe;
		     }
		
		if (kuerzesteSeite + laengsteSeite <= 50*ss_Paket.laengenEinheit )
		   {ss_lieferpreis_proPaket = PREIS_FUER_PAKETKLASSE_S ;}
		else if (kuerzesteSeite + laengsteSeite <= 120*ss_Paket.laengenEinheit)
		         {ss_lieferpreis_proPaket = PREIS_FUER_PAKETKLASSE_L ;}
		else {    
		      ss_lieferpreis_proPaket = 0;
		      };
		 //end if     
		 return ss_lieferpreis_proPaket;
		
		}//end  Lieferpreis pro Paket bestimmen
}













