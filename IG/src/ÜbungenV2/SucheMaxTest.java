package ÜbungenV2;

public class SucheMaxTest {

	public static void main(String[] args) {
		SucheMax S = new SucheMax(12);
		System.out.print("Array:");
		S.ausgeben();
		int pos = S.suche(6,11);
		System.out.println("der größte Wert " + S.zahlen[pos]
				+ " legt an der Position " + pos);
	}

}
