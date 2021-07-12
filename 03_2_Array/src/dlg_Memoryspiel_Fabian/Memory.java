package dlg_Memoryspiel_Fabian;
  
import java.util.Scanner;
  
public class Memory {
    private static int z_paar;
    private static char[][] t;
    private static char[][] t_verdeckt;
    private static int anz_zeile, anz_spalte;
    private static int s1_geraten, z1_geraten, s2_geraten, z2_geraten;
    private static int z_richtiggeraten=0, z_falschgeraten=0;   
    private static char symbolanfang = 'A';
    private static char entferntes_symbol = ' ';
    private static char verdecktes_symbol = 'X';
    
    public static void main(String[] args) {        
        memoryfeld_vorbereiten();
         t_verdeckt_mitkoord_ausgeben();
         //t_ausgeben();
              
        while(z_richtiggeraten<z_paar){  
            umzudrehende_karten_erfassen();
            geratene_karten_in_t_verdeckt_einfuegen();
             t_verdeckt_mitkoord_ausgeben();
            kartenpaar_pruefen();
             //t_verdeckt_ausgeben();
             //t_ausgeben();
        }
        ende_erreicht();
    }
     
    public static void memoryfeld_vorbereiten() {
        z_paar_erfassen(); 
        memory_feldgroesse_erzeugen();
        t_verdeckt_fuellen();
        t_mit_symbol_fuellen();
        t_symbole_mischen();
    }
     
     
    public static void z_paar_erfassen() {
         Scanner s;
         s = new Scanner (System.in);
          
         System.out.println("Mit wie vielen Paaren soll gespielt werden?");
         z_paar = s.nextInt();
         System.out.println("");
    }
     
     
    public static void memory_feldgroesse_erzeugen() {
        int z_karten = z_paar * 2;
        int z_spalte=0;
        int umfang =0, umfangvorher=9999;
          
        for(int z_zeile=2; z_zeile<=z_karten; z_zeile=z_zeile+1)
        {
            if( (z_karten%z_zeile) == 0 )
            {
                z_spalte=z_karten/z_zeile;
                  
                umfang=z_spalte+z_zeile;
                  
                if(umfangvorher>umfang)
                {
                    anz_spalte = z_spalte;
                    anz_zeile = z_zeile;
                }
                //System.out.println("z_zeile:"+z_zeile+" z_spalte:"+z_spalte+" umfang:"+umfang+" umfangvorher:"+umfangvorher);
            }
            umfangvorher = umfang;
              
            //System.out.println("anz_zeile:"+anz_zeile+" anz_spalte"+anz_spalte);
        }
      
        t = new char[anz_zeile][anz_spalte];        
        t_verdeckt = new char[anz_zeile][anz_spalte];       
    }   
      
    public static void t_ausgeben() {
        for(int z=0; z<t.length; z++)
        {   for(int s=0; s<t[z].length; s++)
            {   System.out.print( t[z][s] + " ");           
            }       
            System.out.println("");
        }
        System.out.println("");
    }
      
    public static void t_verdeckt_ausgeben() {
        for(int z=0; z<t.length; z++)
        {   for(int s=0; s<t[z].length; s++)
            {   System.out.print( t_verdeckt[z][s] + " ");          
            }       
            System.out.println("");
        }
        System.out.println("");
    }
      
    public static void t_verdeckt_mitkoord_ausgeben() {       
        System.out.print(" ");
        for(int i=1; i<=anz_spalte;i++)
        {   System.out.print(" " + i);      
        }
        System.out.println("");
        for(int z=0; z<t.length; z++)
        {   System.out.print(z+1 + " ");
            for(int s=0; s<t[z].length; s++)
            {   System.out.print( t_verdeckt[z][s] + " ");          
            }   
            System.out.println("");
        }
        System.out.println("");
    }
      
    public static void t_verdeckt_fuellen() {
        for(int z=0; z<t.length; z++)
        {   for(int s=0; s<t[z].length; s++)
            {   t_verdeckt[z][s] = verdecktes_symbol;
            }       
        }
    }
      
    public static void t_mit_symbol_fuellen() {
        int z_gesetzte_symbole = 0;
        char symbol =  symbolanfang;
          
        for(int z=0; z<t.length; z++)
        {   for(int s=0; s<t[z].length; s++)
            {   z_gesetzte_symbole++;
                t[z][s]= symbol;
                if(z_gesetzte_symbole%2==0) 
                {   symbol ++;
                }               
            }       
        }
    }
      
    public static void t_symbole_mischen() {
        int z_tausch, s_tausch;
        char buffer;
          
        for(int z=0; z<t.length; z++)
        {   for(int s=0; s<t[z].length; s++)
            {   z_tausch = (int) (Math.random()*anz_zeile);
                s_tausch = (int) (Math.random()*anz_spalte);
                  
                buffer = t[z_tausch][s_tausch];
                t[z_tausch][s_tausch] = t[z][s];
                t[z][s] = buffer;               
            }       
        }
    }
      
    public static void umzudrehende_karten_erfassen() {
        Scanner s;
        s = new Scanner (System.in);
          
        boolean is_selbe=false; 
        boolean is_aufgedeckt=false;
        boolean is_wertebereichverlassen=false;
          
        do {    
            System.out.println("Zeile der ersten Karte:");
            z1_geraten = s.nextInt() - 1;
            System.out.println("Spalte der ersten Karte:");
            s1_geraten = s.nextInt() - 1;
            System.out.println("Zeile der zweiten Karte:");
            z2_geraten = s.nextInt() - 1;
            System.out.println("Spalte der zweiten Karte:");
            s2_geraten = s.nextInt() - 1;
              
            is_selbe = (s1_geraten == s2_geraten) && (z1_geraten == z2_geraten);
            is_wertebereichverlassen = (s1_geraten > anz_spalte)||(s2_geraten > anz_spalte)||(z1_geraten > anz_zeile)||(z2_geraten > anz_zeile);
             
            if(!is_wertebereichverlassen) {
            	is_aufgedeckt = (t_verdeckt[z1_geraten][s1_geraten]==entferntes_symbol) || (t_verdeckt[z2_geraten][s2_geraten]==entferntes_symbol);
            }   
            
            if(is_selbe) {
                System.out.println("Schon mal versucht zwei UNTERSCHIEDLICHE Karten umzudrehen?"); 
            }
            if(is_aufgedeckt) {
                System.out.println("Hast du schon erfolgreich umgedreht.... warum nochmal?");
            }
            if(is_wertebereichverlassen) {
                System.out.println("Das Feld ist nicht unendlich gro�.... du hast diese Feldgr��e gewollt!");
            }         
        }while(is_selbe || is_aufgedeckt || is_wertebereichverlassen);
    }
      
    public static void geratene_karten_in_t_verdeckt_einfuegen() {
        t_verdeckt[z1_geraten][s1_geraten] = t[z1_geraten][s1_geraten];
        t_verdeckt[z2_geraten][s2_geraten] = t[z2_geraten][s2_geraten];
    }
      
    public static void kartenpaar_pruefen() {
        if(t[z1_geraten][s1_geraten]==t[z2_geraten][s2_geraten])
        {   System.out.println("  Guter Mann, richtig geraten! \n");
            t_verdeckt[z1_geraten][s1_geraten] = entferntes_symbol;
            t_verdeckt[z2_geraten][s2_geraten] = entferntes_symbol;
            t[z1_geraten][s1_geraten] = entferntes_symbol;
            t[z2_geraten][s2_geraten] = entferntes_symbol;
            z_richtiggeraten++;
        }
        else
        {   System.out.println("  Falsch! Trainier mehr! \n");
            t_verdeckt[z1_geraten][s1_geraten] = verdecktes_symbol;
            t_verdeckt[z2_geraten][s2_geraten] = verdecktes_symbol;
            z_falschgeraten++;
        }
        if(z_richtiggeraten<z_paar) {
        	System.out.println("N�chstes Kartenpaar aufdecken: \n");
        }
    }
      
    public static void ende_erreicht() {
        System.out.println("Happy Birthday, du hast " + z_richtiggeraten + " mal richtig geraten und " + 
                            z_falschgeraten + " mal haben dich deine Jedi Sinne verlassen");
    }
}