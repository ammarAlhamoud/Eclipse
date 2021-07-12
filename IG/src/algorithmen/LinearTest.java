package algorithmen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearTest {

	public static void main(String[] args) {
		int				gesucht;
		int				position;
		LineareSuche	L = new LineareSuche(12);
		L.sortiertfuellen();
		BufferedReader	Eingabe = new BufferedReader(
									new InputStreamReader(System.in));
		System.out.println("Array:");
		L.ausgeben();
		System.out.print("Gesuchte Zahl: ");
		try {
			gesucht = Integer.parseInt(Eingabe.readLine());
		} catch (NumberFormatException | IOException e) {
			gesucht = 42;
		}
		position = L.rekursivsuchen(gesucht);
		System.out.print(gesucht + " wurde ");
		if (position == -1) {
			System.out.println("nicht gefunden");
		} else {
			System.out.println("an Position " + position + " gefunden");
		}
	}

}
