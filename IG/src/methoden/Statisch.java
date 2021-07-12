package methoden;

public class Statisch {

	int			x = 1;
	static int	y = 42;

	public void machen() {
		int		y = 23;
		int		x = 7;
		this.x = this.x + 1;
		Statisch.y = Statisch.y + 1;
		System.out.print("this.x: " + this.x);
		System.out.print(", Statisch.y: " + Statisch.y);
		System.out.print(", lokales y: " + y);
		System.out.println(", lokales x: " + x);
	}
	public static void main(String[] args) {
		Statisch	S1 = new Statisch();
		Statisch	S2 = new Statisch();
		System.out.println("S1.x: " + S1.x);
		System.out.println("S2.x: " + S2.x);
		System.out.println("Statisch.y: " + Statisch.y);
		System.out.print("\tS1: ");
		S1.machen();
		System.out.print("\tS2: ");
		S2.machen();
		System.out.println("S1.x: " + S1.x);
		System.out.println("S2.x: " + S2.x);
		System.out.println("Statisch.y: " + Statisch.y);
	}

}
