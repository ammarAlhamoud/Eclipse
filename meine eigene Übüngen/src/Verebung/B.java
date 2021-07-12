package Verebung;

public class B extends A
{int x = 25;
public void print(int i)
	{System.out.println("unter");	
	}

public void printBoth()
	{print();               // B الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
    this.print();          // B الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
    super.print();         // A الموجودة في الكلاس print() هنا سيتم إستدعاء الدالة
	}

}
