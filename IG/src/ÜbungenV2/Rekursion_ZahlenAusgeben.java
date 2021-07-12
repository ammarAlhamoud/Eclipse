package ÜbungenV2;

public class Rekursion_ZahlenAusgeben {

	public static void main(String[] args) {
		Rekursion_ZahlenAusgeben R = new Rekursion_ZahlenAusgeben();
		R.hochzahlen(5);
	}
	
	public void runterzahlen(int n) {	
		if (n>0) {
		System.out.println(n);
		runterzahlen(n-1);
		}
	}
	
	public void hochzahlen(int n) {	
		if (n>0) {
		hochzahlen(n-1);
		System.out.println(n);
		}
	}

}
