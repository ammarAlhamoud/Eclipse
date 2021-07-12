package methoden;

public class Aufruf {

	public void aendern(int x) {
		System.out.println("\tx in aendern vorher: " + x);
		x = x + 7;
		System.out.println("\tx in aendern nachher: " + x);
	}
	public static void main(String[] args) {
		Aufruf	A = new Aufruf();
		int		x = 5;
		System.out.println("x vorher: " + x);
		A.aendern(x);
		System.out.println("x nachher: " + x);
	}

}
