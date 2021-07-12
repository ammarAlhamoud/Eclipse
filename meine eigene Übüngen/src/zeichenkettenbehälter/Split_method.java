package zeichenkettenbehälter;

import java.util.regex.Pattern;

public class Split_method {

	public static void main(String[] args) {
		String text = "amar*Ahmad*salim";
		String[] t_knoten;
		t_knoten = text.split("\\a*");
		System.out.println(t_knoten.length);
		//System.out.println("[0]: "+ t_knoten[0] );// +  "\n[1]: "+ t_knoten[1]
			//*	+ "\n[2]: "+ t_knoten[2]);
	}

}
