package dlg_begruessung_persoenlich_V3;
import java.util.Calendar;
public class Dlg_Begruessung_persoenlich_V3
  {
	public static void main(String[] args) 
	{
	// deklarieren
	String name;
	int 	z_anrede;
	int		akt_Monat,
			akt_Tag,
			quotient,
			rest,
			z_maxAnredeEingabe = 8;	  
	String    gebdatum, anrede;
	final long  dialogende;
	long akt_zeitpkt;
	short	z_Versuch_anredeEingabe = 1;
	int c_Monat,
		c_Tag,
		c_Jahr;
	boolean pr?f_Datum ,
			geb_Tag_pr?f;	
	/* personaldaten erfassen   */
	/** dialogende bestimmen */
	dialogende = System.currentTimeMillis()+120000;
	/**  Name erfassen */
	System.out.println("Bitte Name eingeben");
	name=  ConsolReader.readString();
	/** richtige Anrede erfassen */
	akt_zeitpkt =System.currentTimeMillis();
	if(dialogende < akt_zeitpkt)
		{System.out.println("Weiter Eingabe ist nicht m?glich");	
		}
	else
		{System.out.println("Arede (0 = Herr,1 = Frau, 2 = Dr , 3 = Durchlaucht)" );
		z_anrede = ConsolReader.readInt();
		akt_zeitpkt =System.currentTimeMillis();
		while ( (z_anrede < 0 || z_anrede > 3) & z_Versuch_anredeEingabe < z_maxAnredeEingabe & dialogende > akt_zeitpkt) 
			{System.out.println("unzul?ssige Anrede! nochmal!" );
			z_anrede = ConsolReader.readInt();
			z_Versuch_anredeEingabe +=1;
			akt_zeitpkt =System.currentTimeMillis();
			} 		
		/** richtige Datum erzeugen */
		if (z_Versuch_anredeEingabe >=8)
			{System.out.println("Sie Haben die maxsimale Versuchgrenze erreicht!");
			}
		else
			{do 
				{pr?f_Datum = true;
				System.out.println("Geburstdatum");
				gebdatum = ConsolReader.readString();	
				// Datum pr?fen
				c_Monat = ((gebdatum.charAt(3)-'0')*10)+(gebdatum.charAt(4)-'0');
				c_Tag = ((gebdatum.charAt(0)-'0')*10)+(gebdatum.charAt(1)-'0');
				c_Jahr = ((gebdatum.charAt(6)-'0')*1000)+((gebdatum.charAt(7)-'0')*100)
						+((gebdatum.charAt(8)-'0')*10)+(gebdatum.charAt(9)-'0');
				if ((1 > c_Monat || c_Monat > 12) || (1 > c_Tag || c_Tag > 31))
					{pr?f_Datum = false;
					}
				else
					{if (c_Tag < 29 )
						{}
					else
						{if (c_Monat == 2)
							{quotient = (int) (c_Jahr/4);
							rest = c_Jahr % 4;
							if(rest > 0)
								{if(c_Tag == 29 )
									{}
								else
									{pr?f_Datum = false;	
									}	
							}
							else
								{pr?f_Datum = false;			
								}
						}
						else
							{if((c_Monat % 2 == 0 & c_Monat <= 7) || (c_Monat % 2 != 0 & c_Monat > 7))
								{if (c_Tag <= 30 )
									{}
								else
									{pr?f_Datum = false;	
									}
								}
							}	
							}						
					}
				akt_zeitpkt = System.currentTimeMillis();
				}
			while (pr?f_Datum == false & dialogende > akt_zeitpkt);
			// komplette Begr??ung erzeugen
			if (dialogende < akt_zeitpkt)
				{System.out.println("Weiter Eingabe ist nicht m?glich");		
				}
			else
			{switch (z_anrede)
				{case 0:anrede = "Herr";
				break;
				case 1:anrede = "Frau";
				break;
				case 2:anrede = "Dr";
				break;
				case 3:anrede = "Durchlaucht";
				break;
				default:anrede = "";
				break;
				}//end switch
			System.out.println("Guten Tag "+anrede + " " + name);
			// Geburtstag erzeugen
			akt_Monat= Calendar.getInstance().get(Calendar.MONTH)+1;
			akt_Tag=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
			geb_Tag_pr?f = c_Tag==akt_Tag && c_Monat==akt_Monat;	
			if(geb_Tag_pr?f)
				{System.out.println("Sie haben heute Ihren Geburtstag");	
				}
			}		
		}
		}
	}//end main
}