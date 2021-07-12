package testling_mitTestfaellen;
import consol_steuerung.ConsolReader;

public class Dlg_TestSample 
	{

		public static void main(String[] args)
			{System.out.println("Bitte Name eingegeben:");
			  String name = ConsolReader.readString();
			  System.out.println("Hallo " + name + "!!");
			  
			  System.out.println("Bitte Alter eingegeben:");
			  int alter   =  ConsolReader.readInt();
			  System.out.println(alter + " Jahre? Hallo Alter!");
			  
			  System.out.println("Wollen Sie weiter machen? (J/N)");
			  boolean isWeitermachen  =  (ConsolReader.readChar() == 'J');
			  System.out.println("...d.h. " + isWeitermachen);
			}

	}
