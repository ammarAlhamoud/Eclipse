package rekursion;

public class Fibonacci {

	public int fibonacci(int n) {
		int	ergebnis;
		if (n>1) ergebnis = fibonacci(n-1) + fibonacci(n-2);
		else if (n==0) ergebnis = 0;
		else ergebnis = 1;
		return ergebnis;
	}

	public static void main(String[] args) {
		Fibonacci	F = new Fibonacci();
		System.out.println(F.fibonacci(2));
		System.out.println(F.fibonacci(6));
		System.out.println(F.fibonacci(7));
		System.out.println(F.fibonacci(12));
	}
}
