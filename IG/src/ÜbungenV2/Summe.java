package ÜbungenV2;

public class Summe {
	public int was(int k) {
		if (k >1) return k + was(k-1);
		else return 1;
	}
	
	
	public int sum(int n){
		int erg = 0;
		if (n>0) 
			erg = n + sum(n-1);
		return erg;
			
		
		
	}
	
	
	
	
	

}
