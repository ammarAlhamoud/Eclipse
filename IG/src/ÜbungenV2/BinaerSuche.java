package ÜbungenV2;

public class BinaerSuche extends EinfacheSortieren {
	
	public BinaerSuche(int n) {
		super(n);
		this.sortiere();
	}
	
	public int binaersuche(int g, int a, int e) {
		int pos = -1;
		int  m;
		
		while(e>=a) {
			m = (int)((a+e)/2);
			if(this.zahlen[m] == g) {
				pos = m ;
				a = e+1;
			}else {
				if(g>this.zahlen[m]) {
					a = m+1;
				}else {
					e = m-1;
				}
			}
		}	
		return pos;
	}
	
	
	public int binaersuche(int g) {
		return this.binaersuche(g, 0, this.zahlen.length-1);
	}
	
	public int rekursiveBSuche(int g, int a, int e) {
		int m ;
		int pos = -1;
		if(a<=e) {
			m=(int)(a+e)/2;
			if(g==this.zahlen[m]) pos =  m;
			else if(g >this.zahlen[m])  pos = rekursiveBSuche(g,m+1,e);
			else pos =  rekursiveBSuche(g,a,m-1);	
		}
		return pos;
		
	}
	public int rekursiveBSuche(int g) {
		return rekursiveBSuche(g, 0,this.zahlen.length-1);
	}
}


