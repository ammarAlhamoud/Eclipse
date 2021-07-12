package übungen;

public abstract class ListeMitHilfsvariableTest {

	public static void main(String[] args) {
		Liste anfang = new Liste();
		Liste H = anfang;
		H.inhalt = 1;
		H.verweis = new Liste();
		H = H.verweis;
		H.inhalt = 2;
		H.verweis = new Liste();
		H = H.verweis;
		H.inhalt = 3;
		H.verweis = new Liste();
		H = H.verweis;
		H.inhalt = 5;
		H = anfang;
		while( H != null) {
			System.out.println("inhalt: " + H.inhalt);
			H = H.verweis;
		}
		
	}

}
