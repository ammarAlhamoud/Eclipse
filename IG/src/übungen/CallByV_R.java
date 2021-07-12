package übungen;

public class CallByV_R {

	public static void main(String[] args) {
		CallByV_R C = new CallByV_R();
		int x = 5;
		C.ByValue(10);
		System.out.println("Ausgabe außerhalb der Methode von dem Parameter"
				+ " x:" + x);
		
		int[] a = new int[2];
		a[0] = 5;
		C.ByReference(a);
		System.out.println("Ausgabe außerhalb der Methode von dem Parameter"
				+ " a[0]:" + a[0]);
		System.out.println("reference von  Array a" + a);
		
	}
	
	public void ByValue(int x) {
		x = x+2;
		System.out.println("Ausgabe innerhalb der Methode von dem Parameter"
				+ " x:" + x);
		
	}
	
	public void ByReference(int[] b) {
		b[0] = b[0] + 2;
		System.out.println("\nAusgabe innerhalb der Methode von dem Parameter"
				+ " b[0]:" + b[0]);
		System.out.println("reference von  Array b" + b);
	}

}
