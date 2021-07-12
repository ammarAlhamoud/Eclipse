package ÜbungenV2;

public class EinfacheSortieren extends SucheMax{
	
	public EinfacheSortieren(int n) {
		super(n);
	}
	
	public void sortiere() {
		int l = this.zahlen.length;
		int m ;
		int t;
		while(l>1) {
			m = suche(0,l);
			t = this.zahlen[m];
			this.zahlen[m] = this.zahlen[l-1];
			this.zahlen[l-1]= t;
			l = l-1;
		}
	}

}
