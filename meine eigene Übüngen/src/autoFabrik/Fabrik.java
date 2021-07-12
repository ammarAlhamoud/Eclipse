package autoFabrik;

public class Fabrik {

	public static void main(String[] args) 
	{Auto auto1 = new Auto(120, 125400 ,"Ammar","Odi");
	Auto auto2 = new Auto(0032,501487,"Anas","BMW");
	System.out.println(auto1.getNummer()+" "+ auto1.getPreis()+"  "+auto1.getInhaber()+"  " + auto1.getMarke());
	System.out.println(auto2.getNummer()+" "+ auto2.getPreis()+"  "+auto2.getInhaber()+"  " + auto2.getMarke());

	}

}
