package k_5_2_App_Schiffe_abstrakt_LösgLamparter;


import java.io.*;

public class ConsolReader
{
 public static int readInt()
  {int ss_readInt = 0;
   String erfassteDaten ;
   try{erfassteDaten = (new BufferedReader((new InputStreamReader(System.in)))).readLine();
       ss_readInt = Integer.parseInt(erfassteDaten);
       }
   catch (Exception e)
       {ss_readInt = ss_readInt/ss_readInt;  //erzeugt NotANumber
       }
   return ss_readInt;
  }
  public static char readChar()
  {char ss_readChar;
   String erfassteDaten ;
   try{erfassteDaten = (new BufferedReader((new InputStreamReader(System.in)))).readLine();
       ss_readChar =  erfassteDaten.charAt(0) ;
       }
   catch (Exception e)
       {ss_readChar = ' ';
       }
   return ss_readChar;
  }


  public static String readString()
  {String ss_readString ;

   try{ss_readString = (new BufferedReader((new InputStreamReader(System.in)))).readLine();
      }
   catch (Exception e)
       {ss_readString = null;
       }
   return ss_readString;
  }
  
  public static double readDouble()
  {double ss_readInt = 0;
   String erfassteDaten ;
   try{erfassteDaten = (new BufferedReader((new InputStreamReader(System.in)))).readLine();
       ss_readInt = Double.parseDouble(erfassteDaten);
       }
   catch (Exception e)
       {ss_readInt = ss_readInt/ss_readInt;  //erzeugt NotANumber
       }
   return ss_readInt;
  }


}
