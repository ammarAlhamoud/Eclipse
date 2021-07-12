package übungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaerSucheTest {

	public static void main(String[] args) {
		int gesucht, pos;
		BinaereSuche B = new BinaereSuche(12);
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Array:");
		B.ausgeben();
		
		System.out.print("gesuchte Zahl: ");
		try {
		gesucht = Integer.parseInt(eingabe.readLine());
		pos = B.rekursiveBinaereS(gesucht);
		System.out.print(gesucht+" wurde ");
		if(pos == -1) System.out.println("nicht gefunden");
		else System.out.println(" an Position "+pos+" gefunden");
		}
		catch(NumberFormatException | IOException e) {
			gesucht = 42;
		}
		
	}

}
