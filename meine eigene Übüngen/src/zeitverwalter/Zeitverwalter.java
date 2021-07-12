package zeitverwalter;

import java.text.*;
import java.util.*;

public class Zeitverwalter {

public static void main(String[] args) 
	{//was_wird_angezeigt();
	//SimpledateFormat_testen();
	Gregorian_calendar();
	}

public static void was_wird_angezeigt()
	{Date myDate = new Date();
	System.out.println("Datum : " + myDate);
	StringBuffer datumstring = new StringBuffer();
	datumstring.append(myDate.toString());
	System.out.println("append :" + datumstring);
	datumstring.setLength(5);
	System.out.println("insert: " + datumstring.append(" neuerWert"));
	}

public static void SimpledateFormat_testen()
	{SimpleDateFormat dateFormat_all = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	SimpleDateFormat dateFormat_day = new SimpleDateFormat("dd-MM-yyyy");
	Date datum = new Date();
	System.out.println("formatiertes Datum: " + dateFormat_day.format(datum));
	dateFormat_all.setTimeZone(TimeZone.getTimeZone("GMT-2:00"));
	System.out.println("umgerechnetes Datum in Sydney:" + dateFormat_all.format(datum));
	}
public static void Gregorian_calendar()
	{SimpleDateFormat dateFormat_day = new SimpleDateFormat("dd-MM-yyyy");
	GregorianCalendar akt_date = new GregorianCalendar();
	System.out.println("akt_date: " + dateFormat_day.format(akt_date.getTime()));
	GregorianCalendar akt_date3 = new GregorianCalendar();
	akt_date3.set(Calendar.MONTH, Calendar.MARCH);	
	System.out.println("akt_Datum_neuer_Monat " + dateFormat_day.format(akt_date3.getTime()));
	System.out.println("akt_Datum_Wochentagsnr: " + akt_date3.get(Calendar.DATE));
	GregorianCalendar future_date = new GregorianCalendar(2016,Calendar.MARCH,1);
	System.out.println("future_date : " + dateFormat_day.format(future_date.getTime()));
	future_date.add(Calendar.DATE, -8);
	System.out.println("zurückgerechnetes Datum von future_date um 8 Tage: "+ dateFormat_day.format(future_date.getTime()));
	
	}	

}
