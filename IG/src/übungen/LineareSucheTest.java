package ?bungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineareSucheTest {

	public static void main(String[] args) {
		LineareSuche L = new LineareSuche(12);
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Array:");
		L.ausgeben();
		int gesucht;
		System.out.print("gesuchte Zahl:");
		try {
			gesucht = Integer.parseInt(eingabe.readLine());
		}catch(NumberFormatException | IOException e) {
			gesucht = 42;
		}
		int pos = L.rekursiveSuche(gesucht);
		System.out.print(gesucht +" wurde ");
		if(pos==-1) {
			System.out.println("nicht gefunden");
		}else {
			System.out.println("an dem Position "+ pos+" gefunden!");
		}
		
	}

}
