package übungen;

public class EinfacheSortierung extends SuchMax{
	
	public EinfacheSortierung(int n) {
		super(n);
	}
	
	public int sortiere() {
		int anz=0;
		int pos;
		int l=this.zahlen.length;
		int hilf;
		while(l>1) {
			pos = this.suche(0, l-1);
			hilf = this.zahlen[pos];
			this.zahlen[pos]=this.zahlen[l-1];
			this.zahlen[l-1] = hilf;
			l = l-1;
			anz = anz + 1;		
		}	
		return anz;
	}
	
	

}
