package datentypen;

public class Zeichen {

	public static void main(String[] args) {
		char	c;
		int		x;
		c = 'A';
		System.out.println("c ist " + c);
		x = 65;
		c = (char) x;
		System.out.println("c ist " + c);
		c = 0x41;
		System.out.println("c ist " + c);
		x = 'A';
		System.out.println("x ist " + x);
		x = 'Ä';
		System.out.println("x ist " + x);
	}
}
