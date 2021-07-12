package übungen;

public class ListeTest {

	public static void main(String[] args) {
		Liste H = new Liste();
		H.inhalt = 100;
		System.out.println("H1");
		System.out.print("Adresse H1:" + H + "\tH1.inhalt: " + H.inhalt);
		System.out.println("\t H1.verweis: " + H.verweis );
		System.out.println();
		H.verweis = new Liste();
		H.verweis.inhalt = 150;
		System.out.println("H2:");
		System.out.println("H1.verweis: " + H.verweis);
		System.out.print("Adresse H2:" + H.verweis + "\tH2.inhalt: " + H.verweis.inhalt);
		System.out.println("\t H2.verweis: " + H.verweis.verweis );
		System.out.println();

		H.verweis.verweis = new Liste();
		H.verweis.verweis.inhalt = 200;
		System.out.println("H3:");
		System.out.println("H2.verweis: " + H.verweis.verweis);
		System.out.print("Adresse H3:" + H.verweis.verweis + "\tH2.inhalt: " + H.verweis.verweis.inhalt);
		System.out.println("\t H3.verweis: " + H.verweis.verweis.verweis );
		

	}

}
