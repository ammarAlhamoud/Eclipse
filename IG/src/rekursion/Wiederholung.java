package rekursion;

public class Wiederholung {

	void einfachausgeben() {
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
		System.out.println("Hallo");
	}

	void schleifeausgeben() {
		int	i = 1;
		while (i < 6) {
			System.out.println("Hallo");
			i = i + 1;
		}
	}

	void ausgeben(int zaehler) {
		System.out.println("Hallo");
		if (zaehler > 5) return;
		zaehler = zaehler + 1;
		ausgeben(zaehler);
	}

	public static void main(String[] args) {
		Wiederholung	W = new Wiederholung();
		W.ausgeben(1);
	}

}
