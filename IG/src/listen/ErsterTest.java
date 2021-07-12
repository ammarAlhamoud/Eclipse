package listen;

public class ErsterTest {

	public static void main(String[] args) {
		ErsteListe	E = new ErsteListe();
		ErsteListe	E2 = new ErsteListe();
		ErsteListe	E3 = new ErsteListe();
		E.inhalt = 42;
		E2.inhalt = 23;
		E3.inhalt = 1;
		E2.Verweis = E3;
		E.Verweis = E2;
		System.out.println("E: " + E);
		System.out.println("\tE.inhalt: " + E.inhalt);
		System.out.println("\tE.Verweis: " + E.Verweis);
		System.out.println("E2: " + E2);
		System.out.println("\tE2.inhalt: " + E2.inhalt);
		System.out.println("\tE2.Verweis: " + E2.Verweis);
		System.out.println("E.Verweis.inhalt: " + E.Verweis.inhalt);
		System.out.println("E.Verweis.Verweis.inhalt: " + E.Verweis.Verweis.inhalt);
	}

}
