package ?bungen;

public class LineareSuche extends Feld{
	
	public LineareSuche(int n) {
		super(n);
	}
	
	
	public int suche(int g) {
		int pos= -1;
		int i=0;
		
		while(i<this.zahlen.length && pos<0) {
			if(this.zahlen[i] == g) {
				pos = i;
			}
			i = i+1;
		}	
		return pos;
	}
	
	public int rekursiveSuche(int g,int pos) {
		if(pos>=0) {
			if(this.zahlen[pos] != g) {
				pos = rekursiveSuche(g,pos-1);
			}
		}
		return pos;
	}
	
	public int rekursiveSuche(int g) {
		return this.rekursiveSuche(g,this.zahlen.length-1);
	}

}
