package übungen;

public class SuchMaxTest {

	public static void main(String[] args) {
		SuchMax S = new SuchMax(12);
		System.out.println("Array:");
		S.ausgeben();
		int a=1, b=5;
		int pos = S.suche(a, b);
		System.out.println("\n Das Größe Zahl im Feld zwichen "+a+" und "+b+
				" ist: "+ S.zahlen[pos] +" in der Position: "+pos);
		pos = S.suche();
		System.out.println("\n Das Größe Zahl im ganzen Feld ist: "
				+ S.zahlen[pos] +" in der Position: "+pos);
		
	}

}
