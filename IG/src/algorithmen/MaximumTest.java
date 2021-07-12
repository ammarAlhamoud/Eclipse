package algorithmen;

public class MaximumTest {

	public static void main(String[] args) {
		int				pos;
		MaximumSuchen	M = new MaximumSuchen(12);
		/* pos = M.suchemax();
		 * pos = M.suchemaxrekursiv(); */
		M.gutesucherekursiv();
		pos = M.position;
		System.out.println("Array:");
		M.ausgeben();
		System.out.print("Größte Zahl " + M.zahlen[pos]);
		System.out.println(" an Position " + pos);
	}

}
