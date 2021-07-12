package übungen;

public class SuchMax extends Feld {
	
	public SuchMax(int n) {
		super(n);
	}
	
	
	public int suche(int a, int b) {
		int i = a+1;
		int pos = a;
		while(i<=b) {
			if(zahlen[i]>zahlen[pos]) {
				pos = i;
			}
			i=i+1;
		}
		return pos;
	}
	
	public int suche() {
		return suche(0,this.zahlen.length-1);
	}

}
