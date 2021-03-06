package k_3_2__MathematischeAnwendungen;
import ConsolReader.ConsolReader;


public class Operationswerk 
  {public static int get_max(int ss_arg1, int ss_arg2)
	 {int ss_max = ss_arg1;
	  if (ss_arg2 > ss_arg1)
		 {ss_max = ss_arg2;}
	  return ss_max;
	 }
  
  public static boolean isPrimzahl(int ss_arg)
    {boolean ss_isPrimzahl;
     if (ss_arg == 2)
    	{ss_isPrimzahl = true;
    	}
     else
        {int z_Teiler = 2;
         int rest;
    	 do {ss_isPrimzahl = true;
    		 rest = ss_arg % z_Teiler;
    	     if (rest == 0)
    	        {ss_isPrimzahl = false;
    	        }
    	     else
    	       {if (z_Teiler < ss_arg-1)
    	           {z_Teiler++;
    	           }
    	        //end if
    	       }
    	      }
    	  while (rest !=0 && z_Teiler < ss_arg-1);
          }
     return ss_isPrimzahl;
     
   	 }//end  isPrimzahl
     
    	 
     
    
  
  public static double get_max(double ss_arg1, double ss_arg2)
	 {double ss_max = ss_arg1;
	  if (ss_arg2 > ss_arg1)
		 {ss_max = ss_arg2;}
	  return ss_max;
	 }
   
   public static double get_Flaeche(double ss_m, double ss_b, 
   		                            double ss_x1, double ss_x2)
     {double ss_Flaeche;
      double a = 0, c = 0, flaeche_Rechteck; //Eigenschaften des Rechtecks
      double x_z, y_z;                       //Koordinaten der Zufallspunkte
      double neue_Trapezflaeche = 0, alte_Trapezflaeche;
      int z_Versuche, z_Zufallspunkte, z_Treffer; //Z?hler
      
        
        {//Eigenschaften_des_Rechtecks_bestimmen
         
         c = ss_x2 - ss_x1;
		 a = ss_m * ss_x2 + ss_b;
		 
         // a ist der Funktionswert.
		 // Alternativen:
         /*a zuf?llig w?hlen 
	       while (a < ss_m * ss_x2 + ss_b)
	       {a = Math.random() * 100;}
	     */
         /*a festlegen
		  *a = 4;
		 */
		       
		 flaeche_Rechteck = a * c;
        }
      
        do {alte_Trapezflaeche = neue_Trapezflaeche;
            z_Treffer = 0;
            z_Zufallspunkte = 0;
        	  {//neue Trapezfl?che bestimmen
        	   for (z_Versuche=1; z_Versuche <= 10000; z_Versuche++)
        	       {
        	   	    {//Punkt innerhalb des Rechtecks bestimmen
        	   	     do {x_z = Math.random() * ss_x2 + 1;}
        	   	     while(x_z < ss_x1 || x_z > ss_x2);
        	   	     
        	   	     do {y_z = Math.random() * a;}
        	   	     while(y_z < 0 || y_z > a);
        	   	    }
        	   	    
        	   	    {//Treffer registrieren
        	   	     if(ss_m * x_z + ss_b >= y_z)
        	   	       {z_Treffer++;}
        	   	     //end if
        	   	     z_Zufallspunkte++;
        	   	    }
        	   	    
        	       }
        	   //end for
        	   
        	   {//Fl?chenverh?ltnis bestimmen   
        	   	neue_Trapezflaeche = 
        	   		(double) z_Treffer * flaeche_Rechteck / z_Zufallspunkte;
        	   }
        	  }
           }
        while(Math.abs(neue_Trapezflaeche - alte_Trapezflaeche) > 0.00001);
       

      ss_Flaeche = neue_Trapezflaeche;
   	  return ss_Flaeche;
     }
     
   public static int get_Folgeglied(int ss_Folgeanfangswert, int ss_Gliednr)
     {int ss_Folgeglied;
	  int NeuesGlied = ss_Folgeanfangswert-1;
	  int z_Gliednr = 0;
	
	  //	Solange aktuelles Glied kleiner als vorgegebenes
	  while(z_Gliednr < ss_Gliednr)
	  	    // Ein Teilblock ist die L?nge des Anfangswertes
	  	    // Das aktuelle Glied wird solange erh?ht, bis Block abgearbeitet
	       {for(int z_laenge = ss_Folgeanfangswert; 
	            z_laenge > 0 && z_Gliednr < ss_Gliednr; 
	            z_laenge--)
	           {NeuesGlied++;
	            z_Gliednr++;
	           }
	       // Sprung zum n?chsten Block, falls Aktuelles noch nicht Vorgabe
	        if(z_Gliednr < ss_Gliednr)
	    	  {NeuesGlied = NeuesGlied + ss_Folgeanfangswert;}
	       }
	  ss_Folgeglied = NeuesGlied;
      return ss_Folgeglied; 
     }
  
   public static int get_Fakultaet_rekursiv(int ss_arg)
     {int ss_Fakultaet;
      if(ss_arg == 0)
        {ss_Fakultaet = 1;}
      else
        {ss_Fakultaet = ss_arg * get_Fakultaet_rekursiv(ss_arg - 1);}
      return ss_Fakultaet;
     }
  
   public static double get_Kapital(double ss_Kapital, double ss_Zinssatz, int ss_Laufzeit)
     {if(ss_Laufzeit == 0)
        { }
      else
        {ss_Kapital = (1 + ss_Zinssatz/100) * get_Kapital(ss_Kapital, ss_Zinssatz, ss_Laufzeit-1);}
   	  return ss_Kapital;
     }
   
   public static int get_Potenz_rekursiv(int ss_basis, int ss_exponent)
     {int ss_Potenz;
     
      switch(ss_exponent)
      		{case 0: ss_Potenz = 1; break;
      		 case 1: ss_Potenz = ss_basis; break;
      		 default: ss_Potenz = ss_basis * get_Potenz_rekursiv(ss_basis, ss_exponent - 1);
      		 		  break;
      		}
     
   	  return ss_Potenz;
     }
   
   public static boolean isQuadratzahl(int ss_arg)
     {boolean ss_isQuadratzahl = false;
	  int z_Teiler = 1;
	
	  do
	    {if (z_Teiler * z_Teiler == ss_arg)
	  	    {ss_isQuadratzahl = true;}
	     z_Teiler++;
	    }
	  while(z_Teiler * z_Teiler <= ss_arg && !ss_isQuadratzahl);
	
      return ss_isQuadratzahl;
     }
   
   /**
    * Benutzt 'Math.random', um einen Integerwert zwischen zwei Zahlen zu ermitteln.
    * @param ss_arg1 (Mindestwert)
    * @param ss_arg2 (H?chstwert)
    * @return Integer
    */
   public static int get_RandomInteger(int ss_arg1, int ss_arg2)
   	{int randomInteger, Zahl;
   	
   	 do
   	 	{Zahl = (int) (Math.random() * 100000);
   		 Zahl = Zahl % ss_arg2;
   		 if(Zahl < ss_arg1)
   		 	{Zahl += ss_arg1;}
   	 	}
   	 while(Zahl < ss_arg1 || Zahl > ss_arg2);  		 
	 randomInteger = Zahl;
   	 return randomInteger;  
   	}
   
   public static boolean isBefreundet(int ss_arg1, int ss_arg2)
     {boolean ss_isBefreundet = false;
      int summe_arg1 = get_Teilersumme(ss_arg1);
      int summe_arg2 = get_Teilersumme(ss_arg2);
      
      if(ss_arg1 == summe_arg2 && ss_arg2 == summe_arg1)
      	{ss_isBefreundet = true;}
     
	  return ss_isBefreundet; 
     }
   
   /** 
    * Ermittelt die Summe der ganzzahligen Teiler des Parameters (mit Ausnahme des Paramters selbst).
    * @param ss_arg
    * @return Integer
    */
   public static int get_Teilersumme(int ss_arg)
   	 {int Teilersumme = 0;
   	  for(int z_Teiler = 1;z_Teiler < ss_arg; z_Teiler++)
   	  	 {if(ss_arg % z_Teiler == 0)
   	  	 	{Teilersumme += z_Teiler;}
   	  	 }
	  return Teilersumme; 
     }

final static float PI = 3.1415927f;

public static double get_Bogenmass(double ss_Grad)
  {return ((2*PI)/360)*ss_Grad;
   }

public static int get_Fakultaet_iterativ(int ss_argument)
{int ss_Fakultaet = 1;
 if (ss_argument > 1)
    {for(int z_Multipl = 1; z_Multipl <= ss_argument;z_Multipl++)
        {/*  Multiplikationsschritt durchf?hren   */
          ss_Fakultaet = ss_Fakultaet*z_Multipl;
        }
     //end for
    }
    else{;}
 // end if
 return ss_Fakultaet; 
}

public static double get_Potenz_iterativ(double ss_Basis, int ss_Exponent)
  {double ss_Potenz = 1;   //falls  ss_Exponent Null ist
   int z_Multipl;
   if (ss_Exponent >= 1)
      {for(z_Multipl = 2, ss_Potenz = ss_Basis;
               z_Multipl <= ss_Exponent;   z_Multipl++)
          {ss_Potenz = ss_Potenz*ss_Basis;
          }
       //end for
      }
      else{;}
   // end if
   return ss_Potenz;
   }

public double get_Sinus(double ss_Grad)
  {double ss_Sinus;
   double x = get_Bogenmass(ss_Grad);
   double akt_Glied = x/1;
          ss_Sinus = akt_Glied;
   int Vorzeichen = -1;                 //zweites Glied wird nachher subtrahiert

     for(int z_Glied = 3; akt_Glied >= 1E-18;  z_Glied+=2)
         {/* einen Ann?herungsschritt an sinus durchf?hren */
           double p = get_Potenz_iterativ(x,z_Glied); double f = get_Fakultaet_iterativ(z_Glied);
           akt_Glied = get_Potenz_iterativ(x,z_Glied) / get_Fakultaet_iterativ(z_Glied);
           ss_Sinus = ss_Sinus + Vorzeichen*akt_Glied;

           Vorzeichen *= -1;      //Vorzeichen des n?chstens Glieds
          }
       //end for
    return ss_Sinus;
   }
  }