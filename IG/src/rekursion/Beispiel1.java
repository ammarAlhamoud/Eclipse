package rekursion;

public class Beispiel1 {

	public void runterzaehlen(int n) {
		int		i;
		for (i = n; i > 0; i--)
			System.out.println(i);
	}

	public void hochzaehlen(int n) {
		int		i;
		for (i = 1; i <= n; i++)
			System.out.println(i);
	}

	public void rekursivrunterzaehlen(int n) {
		if (n > 0) {
			System.out.println(n);
			rekursivrunterzaehlen(n - 1);
		}
	}

	public void rekursivhochzaehlen(int n) {
		if (n > 0) {
			rekursivhochzaehlen(n - 1);
			System.out.println(n);
		}
	}


	public static void main(String[] args) {
		Beispiel1	B1 = new Beispiel1();
		B1.rekursivhochzaehlen(5);
	}

}
