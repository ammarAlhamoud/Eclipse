package ÜbungenV2;

public class BubbleSort extends Feld{
	
	public BubbleSort(int n) {
		super(n);
	}
	
	
	public void BubbleSortiere() {
		int l = this.zahlen.length;
		int  i;
		int hilf;
		boolean m;
		do {m = false;
		i = 0;
		l = l-1;
		do {if(this.zahlen[i]> this.zahlen[i+1]) 
			{m = true;
			hilf = this.zahlen[i] ;
			this.zahlen[i] = this.zahlen[i+1];
			this.zahlen[i+1] = hilf;
			}
		i = i+1;			
		}while(i<l);
		
			
		}while(m == true);
		
	}

}
