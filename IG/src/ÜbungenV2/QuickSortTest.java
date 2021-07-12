package ÜbungenV2;

public class QuickSortTest {
	public static void main(String[] args) {
		
		QuickSort Q = new QuickSort(12);
		
		System.out.print("Array vor Sortieren:");
		Q.ausgeben();
		Q.quickSortiere();
		System.out.println("Array nach Sortieren:");
		Q.ausgeben();
		

	}

}
