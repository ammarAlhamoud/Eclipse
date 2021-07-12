package k_3_2__Funktion;

import ConsolReader.ConsolReader;

public class DlgPaketauftrag_V_3_2A
{	public static void main(String[] args) 
	{final float INCH = 2.54f;
	 final double POUND = 0.3732417216;	 
	 final float LIEFERRABATT = 0.1f;
	 
	
	 int c_PaketeGleicherArt;
	 
	 int c_massKennNr; // 1 = deutsch, 2 = englisch
	 double laengenEinheit = 1;
	 double gewichtseinheit = 1;
	
	 double c_paketGewicht;
	 double c_laenge, c_breite, c_hoehe;
	 
	 double transportpreis_proPaket = 0;
	 double z_Lieferpreis = 0;
	 int z_PaketproLieferung = 0;
	 
	 
	 try{System.out.println("MassKennNr eingeben: "+
	 		          " 2 = engl., 1 = sonst");
	     c_massKennNr = ConsolReader.readInt();
	     if (c_massKennNr == 2)
	        {gewichtseinheit = POUND;
	         laengenEinheit   = INCH;
	        }
	     do{System.out.println("Bitte Anzahl an gleichartigen Paketen eingeben oder 0 (ErfssgEnde) ");
	       c_PaketeGleicherArt = ConsolReader.readInt();
	       
	       if(c_PaketeGleicherArt > 0)
	           {System.out.println("Bitte Paketgewicht entsprechend der MassKennNr eingeben " +
	        		              "Masseineiheit sind Pound bzw.kg - als Ganzzahlen");
	             c_paketGewicht = ConsolReader.readInt();
	            
	             System.out.println("Bitte alle 3 Paketlängen entsprechend der MassKennNr eingeben +" +
	             "Masseineiheit sind INCH bzw.cm - als Ganzzahlen");
	             System.out.println("Länge ?");
	             c_laenge = ConsolReader.readInt();
	             System.out.println("Breite ?");
	             c_breite = ConsolReader.readInt();
	             System.out.println("Höhe ?");
	             c_hoehe = ConsolReader.readInt();
	             
	             transportpreis_proPaket = get_Transportpreis_proPaket(c_laenge, c_breite, c_hoehe,
	            		 c_paketGewicht,gewichtseinheit, laengenEinheit   );
	             
	             if (transportpreis_proPaket==0)
	                {System.out.println("Paketgroesse nicht transportabel");
	                }
	            	 
	               
	             else
	               {System.out.println("berechneter TransportPreis für Paket: " +  
	             		transportpreis_proPaket);	             
	         
	                z_Lieferpreis += transportpreis_proPaket*c_PaketeGleicherArt;
	                z_PaketproLieferung += c_PaketeGleicherArt; 
	               }
	           }//end if
	         }//end do-Rumpf
       while (c_PaketeGleicherArt>0);
     
	     if (z_PaketproLieferung > 3)
	        {z_Lieferpreis = z_Lieferpreis*(1-LIEFERRABATT);
	        };
	     System.out.println("Anzahl an Pakete: " + z_PaketproLieferung); 
	     System.out.println("Gesamtlieferpreis: " + z_Lieferpreis);
	 	 
	 	 }//end try  	
	catch (Exception e)
	    {System.out.println("Auftragserfassung abgebrochen");
	    }
	}//end main



   private static double get_Transportpreis_proPaket(double ss_laenge, double ss_breite, double ss_hoehe,
		   double ss_paketGewicht, double ss_gewichtseinheit, double ss_laengenEinheit)
		{final int GEWICHTSGRENZE_SCHWERPAKET = 25; 
		 final double PREIS_FUER_PAKETKLASSE_S = 3.90;
		 final double PREIS_FUER_PAKETKLASSE_L = 8.90;
	    
		 
		 double laengsteSeite = 0, kuerzesteSeite = 0;
		 double ss_lieferpreis_proPaket = 0;
			
		 if ( (int)(ss_paketGewicht /ss_gewichtseinheit)  > GEWICHTSGRENZE_SCHWERPAKET )
		
		   {ss_lieferpreis_proPaket = ss_laenge * ss_breite * ss_hoehe * 0.5;
		   }
		else{if (ss_laenge >= ss_breite && ss_laenge >= ss_hoehe)
		        {laengsteSeite = ss_laenge;
		        }
		     else if (ss_breite >= ss_laenge  && ss_breite >= ss_hoehe)
		             {laengsteSeite = ss_breite;
		             }
		     else {laengsteSeite = ss_hoehe;
		          }
		      }
		 
		if (ss_laenge <= ss_breite && ss_laenge <= ss_hoehe)
		    {kuerzesteSeite = ss_laenge;
		    }
		else if (ss_breite <= ss_laenge  && ss_breite <= ss_hoehe)
		     {kuerzesteSeite = ss_breite;
		     }
		else {kuerzesteSeite = ss_hoehe;
		     }
		
		if (kuerzesteSeite + laengsteSeite <= 50*ss_laengenEinheit )
		   {ss_lieferpreis_proPaket = PREIS_FUER_PAKETKLASSE_S ;}
		else if (kuerzesteSeite + laengsteSeite <= 120*ss_laengenEinheit)
		         {ss_lieferpreis_proPaket = PREIS_FUER_PAKETKLASSE_L ;}
		else {    
		      ss_lieferpreis_proPaket = 0;
		      };
		 //end if     
		 return ss_lieferpreis_proPaket;
		
		}//end  Lieferpreis pro Paket bestimmen
}













