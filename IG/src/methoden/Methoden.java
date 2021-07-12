package methoden;

public class Methoden {

	int abc(int x) {
		return x + 1;
	}
	int Abc(int x) {
		return x - 1;
	}
	int abc(int x, int y) {
		return x + y;
	}
	int abc(double x) {
		return (int) (x * 2);
	}
	public static void main(String[] args) {
		Methoden	M = new Methoden();
		System.out.println("Aufruf von abc: " + M.abc(42));
		System.out.println("Aufruf von abc: " + M.abc(42, 23));
		System.out.println("Aufruf von abc: " + M.abc(42.0));
		System.out.println("Aufruf von Abc: " + M.Abc(42));
	}

}
