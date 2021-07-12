package algorithmenV2;

public class MaximumTest {

	public static void main(String[] args) {
		MaximumSuchen	M = new MaximumSuchen(12);
		int				pos = M.suchemax();
		System.out.println("Array:");
		M.ausgeben();
		System.out.print("Größte Zahl " + M.zahlen[pos]);
		System.out.println(" an Position " + pos);
	}

}
