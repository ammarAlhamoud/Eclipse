package ÜbungenV2;

public class BubblesortTest {

	public static void main(String[] args) {
		BubbleSort B = new BubbleSort(12);
		System.out.print("Array vor Sortieren:");
		B.ausgeben();
		B.BubbleSortiere();
		System.out.print("Array nach Sortieren:");
		B.ausgeben();
	}

}
