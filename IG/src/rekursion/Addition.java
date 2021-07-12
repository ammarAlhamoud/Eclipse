package rekursion;

public class Addition {

	int f(int n) {
		if (n > 1) return f(n - 1) + n;
		else return 1;
	}

	int f2(int n) {
		int	i;
		int ergebnis = 0;
		for (i = 1; i <= n; i++)
			ergebnis = ergebnis + i;
		return ergebnis;
	}

	public static void main(String[] args) {
		Addition	A = new Addition();
		System.out.println("f(5) = " + A.f(5));
		System.out.println("f2(5) = " + A.f2(5));
	}

}
