package scanner_train;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
public class Scanner_test {

	public static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String name;
		int alt;
		double note;
		char geschlecht;
		try {
		System.out.print("Geben Sie bitte Ihre Name ein: ");
		name = s.nextLine();
		System.out.print("Geben Sie bitte Ihr Alter ein: ");
		alt = s.nextInt();
		System.out.print("Geben Sie bitte Ihre Note ein: ");
		note = s.nextDouble();
		System.out.print("Geben Sie bitte Ihre Geschlecht ein: ");
		geschlecht = s.next().charAt(0);
		
		FileWriter fw = new FileWriter("Persoenliche_Daten.txt", true);
		System.out.println("\n---------Ihre Angaben----------\n");
		fw.write("Name: "+name + "\n");
		fw.write("Alter: " + alt + "\n");
		fw.write("Note: " + note + "\n");
		fw.write("Geschlecht: "+ geschlecht + "\n\n");
		
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("Persoenliche_Daten.txt");
		int c;
		while((c = fr.read())!=-1) {
			System.out.print((char)c);
			
		}
		
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
