package datentypen;

public class DatenTest {

	public static void main(String[] args) {
		Daten	D = new Daten();
		System.out.println("D: " + D);
		D.ID = 42;
		D.Preis = 1.23;
		System.out.println("D.ID: " + D.ID);
	}

}
