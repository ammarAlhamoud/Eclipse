package übungen;

public class rekursion {

	public static void main(String[] args) {
	int z=0;
	//f(z);
	rekursion A = new rekursion();
	int i;
	int ergebnis = 0;
	int n = 10;
	for(i=1;i<=n;i++) {
		ergebnis = ergebnis +i;	
		}
	System.out.println("die Summe von 1 bis " + n + " ist: "+ ergebnis + "\titerativ");
	System.out.println("die Summe von 1 bis " + n + " ist: "+ A.summe(n) + "\trekursiv");
	i = 6;
	n = 5;
	System.out.println("die Summe von " + i + " bis " + n + " ist: "+ A.summe_zweiP(i,n) + "\trekursiv");

	
	}
	
	 void f(int z) {
		if(z<6052) {
			z=z+1;
			System.out.println("hello\t" + "z: "+z) ;
			f(z);
		}
	}
	
	 int summe(int n) {
		if(n>1 ) 
			return summe(n-1) + n;
		else
			return 1;	
		}
	
	 int summe_zweiP(int i, int n) {
		if(i<n) {
		if(n>i ) 
			return summe_zweiP(i,n-1) + n;
		else
			return i;	
		}
		else
			return 0;
	}
	


}
