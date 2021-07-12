package algorithmenV2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaerTest {

	public static void main(String[] args) {
		int				gesucht;
		int				position;
		BufferedReader	Eingabe = new BufferedReader(
				new InputStreamReader(System.in));
		BinaereSuche	B = new BinaereSuche(12);
		System.out.println("Sortiertes Array:");
		B.ausgeben();
		System.out.print("Gesuchte Zahl: ");
		try {
			gesucht = Integer.parseInt(Eingabe.readLine());
		} catch (NumberFormatException | IOException e) {
			gesucht = 42;
		}
		position = B.rekursivsuchen(gesucht);
		System.out.print(gesucht + " wurde ");
		if (position == -1) {
			System.out.println("nicht gefunden");
		} else {
			System.out.println("an Position " + position + " gefunden");
		}
	}

}
