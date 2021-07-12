package ÜbungenV2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaerSucheTest {

	public static void main(String[] args) {
		BinaerSuche B = new BinaerSuche(12);
		BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
		int gesucht;
		int pos;
		System.out.println("Array:");
		B.ausgeben();
		System.out.print("gesuchte Zahl: ");
		try {
			gesucht = Integer.parseInt(eingabe.readLine());
			pos = B.rekursiveBSuche(gesucht);
			if(pos < 0) {
				System.out.println("Die Zahl wurde nicht gefunden! versuchen"
						+ " Sie andere Zahl eingaben");
			}else {
			System.out.println("Die gesuchte Zahl " + gesucht 
					+ " liegt an der Position " + pos);
			}
			
		}catch(Exception e) {
			gesucht = 0;
		}
	
	}

}
