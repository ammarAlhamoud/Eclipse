package ÜbungenV2;

public class Paskal {
	
	public int pas(int n, int k) {
		if (k==0 || k ==n) return 1;
		else return pas(n-1,k)+pas(n-1,k-1);
	}

}
