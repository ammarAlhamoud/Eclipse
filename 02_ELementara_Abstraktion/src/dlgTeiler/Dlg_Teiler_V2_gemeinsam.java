package dlgTeiler;
import java.util.Scanner;

public class Dlg_Teiler_V2_gemeinsam 
	{public static Scanner s;
	public static void main(String[] args) 
	{Scanner s;
	 int a;
	 int b;	
	 boolean is_Teiler_von_a;
		 
	s = new Scanner (System.in);
		 
	//Eingabe	 
	System.out.println("Bitte Varible a eingeben");
	a = s.nextInt();
	System.out.println("Bitte Variable b eingeben");
	b = s.nextInt();	
	//Berechnen	
	if(b == 0)
		{is_Teiler_von_a = false;
		} 
	else
		{if (a % b == 0) 
		   {is_Teiler_von_a = true;
		   }
		   else 
		   {is_Teiler_von_a = false;  
		   }//end if
	}//end if
	//Ausgabe
		if  (is_Teiler_von_a)
			{System.out.println("b ist ein Teiler von a");
		   	}	
		else 
			{System.out.println("b ist kein Teiler von a");
		    }//end if
	}//end main
}
