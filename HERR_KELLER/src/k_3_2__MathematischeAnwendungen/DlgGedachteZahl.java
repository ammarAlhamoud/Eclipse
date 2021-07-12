package k_3_2__MathematischeAnwendungen;

import ConsolReader.ConsolReader;


public class DlgGedachteZahl 
  {public static void main(String[] args) 
	 {int GedachteZahl = 0;
      int Anfangswert;
      
      System.out.println("Denken Sie sich eine Zahl aus und drücken Sie Enter!");
      ConsolReader.readChar();
        
     /* BLÖCKE NACH REIHENFOLGE AUSGEBEN
        for(int Anfangswert=1; Anfangswert <= 32; Anfangswert *= 2)
         {Blockausgabe(Anfangswert);
          if(get_Antwort() == 'j')
            {GedachteZahl += Anfangswert;}
         }
     */
      
       Anfangswert = 4;
       Blockausgabe(Anfangswert);
       if(get_Antwort() == 'j')
         {GedachteZahl += Anfangswert;}
       
       Anfangswert = 16;
       Blockausgabe(Anfangswert);
       if(get_Antwort() == 'j')
       	 {GedachteZahl += Anfangswert;}
       
       Anfangswert = 2;
       Blockausgabe(Anfangswert);
       if(get_Antwort() == 'j')
       	 {GedachteZahl += Anfangswert;}
       
       Anfangswert = 8;
       Blockausgabe(Anfangswert);
       if(get_Antwort() == 'j')
       	 {GedachteZahl += Anfangswert;}
       
       Anfangswert = 1;
       Blockausgabe(Anfangswert);
       if(get_Antwort() == 'j')
       	 {GedachteZahl += Anfangswert;}
       
       Anfangswert = 32;
       Blockausgabe(Anfangswert);
       if(get_Antwort() == 'j')
       	 {GedachteZahl += Anfangswert;}
      
       System.out.println("Ihre gedachte Zahl: "+GedachteZahl);
     }
  
   private static void Blockausgabe(int ss_Anfangswert)
     {String Zeile="";
      for(int z_ZeilenElemente = 1;z_ZeilenElemente < 33; z_ZeilenElemente++)
         {if(Operationswerk.get_Folgeglied(ss_Anfangswert,z_ZeilenElemente) < 10)
         	{Zeile += " ";}
      	  Zeile += Operationswerk.get_Folgeglied(ss_Anfangswert,z_ZeilenElemente);
          Zeile += " ";
        
          if(z_ZeilenElemente % 7 == 0)
            {System.out.println(Zeile);Zeile = "";}
         }
      System.out.println(Zeile);

     }

   private static char get_Antwort()
     {char Antwort, Eingabe;
      System.out.println("War ihre gedachte Zahl in diesem Block enthalten? (j / n)");
      Eingabe = ConsolReader.readChar();
      Antwort = Eingabe;
      return Antwort ; 
     }
  }


