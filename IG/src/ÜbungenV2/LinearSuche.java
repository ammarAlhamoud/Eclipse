package ÜbungenV2;

public class LinearSuche extends Feld{
	
	public LinearSuche(int n) {
		super(n);
	}
	
	public int suche(int g) {
		int pos = -1;
		int i = 0;
		while(i<this.zahlen.length && pos<0) {
			if(this.zahlen[i] == g) {
				pos = i;
			}
			i = i+1;
		}
		return pos;
	}
	
	public int rekursivSuche(int g, int pos) {
		if(pos>=0) {
			if(this.zahlen[pos] != g) 
				pos = this.rekursivSuche(g, pos-1);
		}
		return pos;
	}
	
	public int rekursivSuche(int g) {
		return this.rekursivSuche(g, this.zahlen.length-1);
	}

}
