package ÜbungenV2;

public class Faktor {
	
	public int faktor(int a) {
		if (a <= 1)
			return 1;
		else
			return a*faktor(a-1);
	}
	public int fac(int n) {
		if (n>0) return n * fac(n-1);
		else return 1;
	}
}
