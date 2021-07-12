package dlgModerator;

public  class MatheTrainer implements Trainer
	{public String get_Frage(int ss_fragenr)
		{String ss_Frage="";
		int operatornr = (ss_fragenr / 100 ) % 10,
			operand1  = (ss_fragenr / 1000) % 100,
			operand2 = ss_fragenr % 100;
		switch (operatornr % 4)
			{case 0 : ss_Frage = "Wie viel is " + operand1 + " * " +
		operand2 + " ?";
			break;
			case 1 : ss_Frage = "Wie viel is " + operand1 + " + " +
			operand2 + " ?";
			break;
			case 2: ss_Frage = "Wie viel is " + operand1 + " - " +
			operand2 + " ?";
			break;
			case 3:ss_Frage = "Wie viel is " + operand2 + " - " + 
			operand1 + " ?";
			break;
			}
		return ss_Frage;	
		}
	
	public boolean is_richtigeAntwort_auf_Frage(int ss_fragenr,
			String ss_antwort)
		{boolean is_richtige_Antwort = false ;
		int richtigeAntwort = 0;
		int operatornr = (ss_fragenr / 100 ) % 10;
		int operand1 = (ss_fragenr / 1000) % 100 ;
		int operand2 = (ss_fragenr % 100 );
		switch (operatornr % 4)
			{case 0 : richtigeAntwort = operand1 * operand2 ;
			break;
			case 1 : richtigeAntwort = operand1 + operand2 ;
			break;
			case 2 : richtigeAntwort = operand1 - operand2 ;
			break;
			case 3: richtigeAntwort = operand2 - operand1 ;
			break;
			}
		String str_richtigeAntwort = ""+richtigeAntwort;
		if(str_richtigeAntwort.equals(ss_antwort))
			{is_richtige_Antwort = true ;	
			}
		return is_richtige_Antwort;
		}	
	}
