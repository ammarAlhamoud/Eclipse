package listen;

public class ErstesErzeugen {

	public static void main(String[] args) {
		int			i;
		ErsteListe	Anfang = new ErsteListe();
		Anfang.inhalt = 1;
		ErsteListe	H = Anfang;
		for (i = 0; i < 3; i++) {
			H.Verweis = new ErsteListe();
			H = H.Verweis;
			H.inhalt = i + 2;
		}
		System.out.println("1. Element: " + Anfang.inhalt);
		System.out.println("2. Element: " + Anfang.Verweis.inhalt);
		System.out.println("3. Element: " + Anfang.Verweis.Verweis.inhalt);
		System.out.println("4. Element: " + Anfang.Verweis.Verweis.Verweis.inhalt);
		// System.out.println("5. Element: " + Anfang.Verweis.Verweis.Verweis.Verweis.inhalt);
		H = Anfang;
		i = 1;
		while (H != null) {
			System.out.println(i + ".Element: " + H.inhalt);
			H = H.Verweis;
			i = i + 1;
		}
	}

}
