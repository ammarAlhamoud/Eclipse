package methoden;

public class Scopes {

	int	x;

	public void tun(int y) {
		int	z;
		z = y + x;
		System.out.println("\ttun: " + y + " + " + x + " = " + z);
		x = x + 15;
		machen();
	}

	public void machen() {
		int	a = 42;
		a = a + x;
		System.out.println("\tmachen: 42 + " + x + " = " + a);
	}
	public static void main(String[] args) {
		Scopes	S = new Scopes();
		S.x = 23;
		System.out.println("x ist " + S.x);
		S.tun(1);
		System.out.println("x ist " + S.x);
		S.machen();
		System.out.println("x ist " + S.x);
	}

}
