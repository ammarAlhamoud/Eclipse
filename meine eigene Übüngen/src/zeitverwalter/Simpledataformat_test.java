package zeitverwalter;
import java.util.*;
import java.text.*;
public class Simpledataformat_test {

	public static void main(String[] args) {
		SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");
		Date mydate = new Date();
		System.out.println(myformat.format(mydate));
		/**try {String str = "15/03/1987 10:15:30.01";
		Date newdate = myformat.parse(str);
		System.out.println(newdate);
		}
		catch(Exception e)
		{System.out.println("Fehler");	
		}*/
		
		//GregorianCalendar
		/**SimpleDateFormat myformat2 = new SimpleDateFormat("dd MM yyyy");
		GregorianCalendar gdate = new GregorianCalendar();
		System.out.println(gdate.getTime());
		gdate.set(Calendar.MONTH, Calendar.AUGUST);
		System.out.println(gdate.getTime());
		System.out.println(gdate.get(Calendar.DATE));
		*/
		//Tagesdifferenz berechnen
		GregorianCalendar gcal = new GregorianCalendar();
		String time = gcal.getTime().toString();
		SimpleDateFormat myformat4 = new SimpleDateFormat();
		String newformat = myformat4.toPattern();
		System.out.println(newformat);


		
	}

}
