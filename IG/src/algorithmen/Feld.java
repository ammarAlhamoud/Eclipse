package algorithmen;

public class Feld {

	int[]		zahlen;

	public Feld(int n) {
		this.zahlen  = new int[n];
		this.fuellen();
	}

	public Feld(int[] a) {
		this.zahlen = a;
	}

	public void fuellen() {
		int	i;
		for (i = 0; i < this.zahlen.length; i++) {
			this.zahlen[i] = (int) (Math.random() * 100);
		}
	}

	public void sortiertfuellen() {
		int	i;
		for (i = 0; i < this.zahlen.length; i++) {
			this.zahlen[i] = i + 1;
		}
	}

	public void ausgeben() {
		int	i;
		for (i = 0; i < this.zahlen.length; i++) {
			System.out.print("\t" + this.zahlen[i]);
			if ((i + 1) % 6 == 0) System.out.println();
		}
		System.out.println();
	}

	public int[] kopieren() {
		int		i;
		int[]	Kopie = new int[this.zahlen.length];
		for (i = 0; i < Kopie.length; i++) Kopie[i] = this.zahlen[i];
		return Kopie;
	}
}
