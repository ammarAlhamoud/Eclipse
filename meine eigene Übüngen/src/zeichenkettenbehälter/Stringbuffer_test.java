package zeichenkettenbehälter;

public class Stringbuffer_test {

	public static void main(String[] args) {
		StringBuffer strb = new StringBuffer("Hallo hi ");
		strb.append( true);
		char[] str = {'a','b','c'};
		strb.append(str);
		strb.setLength(5);
		System.out.println(strb);
		System.out.println(strb.equals(new StringBuffer("Hallo")));
		String str1 = "feb",
				str2 = "feb";
		boolean isstr1_str2 = str1 == str2;
		System.out.println(str1.equals("feb") && "feb".equals(str1)&&"feb".equals(new String("feb")));

		
	}

}
