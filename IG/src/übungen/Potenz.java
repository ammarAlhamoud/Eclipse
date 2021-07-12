package übungen;

public class Potenz {
	int pot_iterativ(int b, int n) {
		int erg = 1;
		for(int i=0;i<n;i++) {
			erg = erg * b;
		}
		return erg;
	}
	
	int pot_rekursiv(int b, int n) {
		if(n>0)
			return pot_rekursiv(b,n-1)*b;
		else
			return 1; 	
	}
	
	public static void main(String[] args) {
		Potenz P = new Potenz();
		System.out.println("Das Ergebnis von 5 hoch 4 ist: \t"+P.pot_iterativ(5, 4));
		System.out.println("Das Ergebnis von 3 hoch 5 ist: \t"+P.pot_rekursiv(3, 5));

	}

}
