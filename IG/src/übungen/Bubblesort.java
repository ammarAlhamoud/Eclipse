package ?bungen;

public class Bubblesort extends Feld{

	public Bubblesort(int n) {
		super(n);
	}
	
	public void sortiere_aufstiegend() {
		boolean m;
		int i , l=this.zahlen.length, hilf;
		do {
			l=l-1;
			i=0;
			m = false;
			do {
				if(this.zahlen[i]>this.zahlen[i+1]) {
					m= true;
					hilf = this.zahlen[i];
					this.zahlen[i]=this.zahlen[i+1];
					this.zahlen[i+1]=hilf;
				}
				i=i+1;
				
			}while(i<l);
			
		}while(m == true);
	}
	
	
	public void sortiere_abstiegend() {
		boolean m;
		int i ,a=0, hilf;
		do {
			a=a+1;
			i=this.zahlen.length-1;
			m = false;
			do {
				if(this.zahlen[i]>this.zahlen[i-1]) {
					m= true;
					hilf = this.zahlen[i];
					this.zahlen[i]=this.zahlen[i-1];
					this.zahlen[i-1]=hilf;
				}
				i=i-1;				
			}while(i>=a);
			
		}while(m == true);
		
	}

}
