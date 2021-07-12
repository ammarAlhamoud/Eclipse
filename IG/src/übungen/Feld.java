package übungen;

public class Feld {
	int[] zahlen;
	public Feld(int n) {
		this.zahlen = new int[n];
		this.ausfuellen();
	}
	
	public void ausfuellen() {
		for(int i=0;i<this.zahlen.length;i++) {
			zahlen[i]=(int)(Math.random()*100);
		}
	}
	
	public void ausgeben() {
		for(int i=0;i<this.zahlen.length;i++) {
			System.out.print("\t" + this.zahlen[i]);
			if((i+1)%6==0) System.out.println();
		}
		System.out.println();
	}

}
