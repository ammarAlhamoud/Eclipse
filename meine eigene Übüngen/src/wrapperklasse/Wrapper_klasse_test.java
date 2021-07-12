package wrapperklasse;

public class Wrapper_klasse_test {

	public static void main(String[] args) {
		double d =1.16;
		String dstr = "2.15" ;
		System.out.println(Double.toString(d));
		double d2 = Double.parseDouble(dstr);
		System.out.println(d2);
		double d3 = Double.valueOf(dstr);
		System.out.println(d3);
		
		String binaer = "15";
		int i_binaer = Integer.valueOf(binaer,8).intValue();
		System.out.println(i_binaer);

	}

}
