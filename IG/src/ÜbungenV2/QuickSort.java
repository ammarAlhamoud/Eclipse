package ÜbungenV2;

public class QuickSort extends Feld{
	public QuickSort(int n) {
		super(n);
	}
	
	public void quickSortiere(int anfang , int ende) {
		int p = anfang;
		int e  = ende;
		int hilf;
		while(p<e) {
			{if(this.zahlen[p]>this.zahlen[p+1]) {
				hilf = this.zahlen[p];
				this.zahlen[p] = this.zahlen[p+1];
				this.zahlen[p+1] = hilf;
				p = p+1;	
			}else {
				hilf = this.zahlen[p+1];
				this.zahlen[p+1] = this.zahlen[e];
				this.zahlen[e] = hilf;
				e = e-1;
				}	
			}
		}
		if(anfang < p-1) {
			this.quickSortiere(anfang, p-1);
		} 
		if(ende >p+1){
			this.quickSortiere(p+1, ende);
		}
	}
	
	public void quickSortiere() {
		this.quickSortiere(0, this.zahlen.length-1);
	}

}
