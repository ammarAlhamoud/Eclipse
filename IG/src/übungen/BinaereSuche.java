package übungen;

public class BinaereSuche extends EinfacheSortierung{

	public BinaereSuche(int n) {
		super(n);
		this.sortiere();
	}
	
	public int suche(int g) {
		int pos = -1;
		int a=0, e=this.zahlen.length-1;
		int m;
		while(a<=e) {
		m = (a+e)/2;
		if(this.zahlen[m]==g) {
			a = e+1;
			pos = m;
			}else {
				if(this.zahlen[m]>g) 
					e = m-1;
				else 
					a = m+1;
			}		
		}
		return pos;
	}
	
	public int rekursiveBinaereS(int a, int e, int g) {
		int m , pos=-1;
		if(a<=e) {
			m = (a+e)/2;
			if(this.zahlen[m]==g) {
				pos = m;
			}else {
				if(this.zahlen[m]>g) pos=rekursiveBinaereS(a,m-1,g);
				else pos=rekursiveBinaereS(m+1,e,g);
			}
		}
		return pos;
	}
	
	
	public int rekursiveBinaereS(int g) {
		return this.rekursiveBinaereS(0, this.zahlen.length-1, g);
	}
}
