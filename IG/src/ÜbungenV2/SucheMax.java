package ÜbungenV2;

public class SucheMax extends Feld{
	
	public SucheMax(int n) {
		super(n);
	}
	
	public int suche(int a, int e) {
		int pos = a;
		for(int i=a+1;i<e;i++) {
			if(this.zahlen[pos] < this.zahlen[i])
				{pos = i;
				}
		}
		return pos;
	}
	
	public int suche() {
		return this.suche(0, this.zahlen.length-1);
	}

}
