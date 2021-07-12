package wrapperklasse;

public class Boxing_unboxing {

	public static void main(String[] args) {
		double i = 10;
		Double I = new Double(i);
		System.out.println(I);
		double i2 = I.doubleValue();
		System.out.println(i2);
		
		System.out.println(Short.MIN_VALUE + " - " + Short.MAX_VALUE);
		String strbool = "true";
		boolean b = Boolean.parseBoolean(strbool);
		System.out.println(b);
	}

}
