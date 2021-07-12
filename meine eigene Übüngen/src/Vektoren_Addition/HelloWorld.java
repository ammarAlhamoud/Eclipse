package Vektoren_Addition;

public class HelloWorld {

	public static void main(String[] args) 
	{Vektor b = new Vektor(5,5,5);
	Vektor a = new Vektor(1,0,0);
	Vektor c = a.add(b);
	System.out.println(c.toString()); 

	}

}
