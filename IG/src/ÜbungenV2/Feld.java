package ÜbungenV2;

public class Feld {
	int[] zahlen;
	
	public Feld(int n) {
		this.zahlen = new int[n];
		ausfuellen();
	}
	
	public void ausfuellen() {
		for (int i=0;i<this.zahlen.length ;i++) {
		this.zahlen[i] = (int)(Math.random()*100);	
		}
	}
	
	public void ausgeben() {
		for(int i=0; i<this.zahlen.length;i++) {
			if (i % 6 == 0) System.out.println();
			System.out.print("\t"+ this.zahlen[i]);
		}
		System.out.println("\n");
	}

}
