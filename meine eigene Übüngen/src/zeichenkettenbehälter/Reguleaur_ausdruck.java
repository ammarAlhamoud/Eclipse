package zeichenkettenbehälter;


import java.util.regex.*;

public class Reguleaur_ausdruck {

	public static void main(String[] args) 
	{String text = "<u>Ammar.43</u> and <u>Ahmad.50</u>";
		Pattern pattern = Pattern.compile("<u>([a-zA-Z]*).([0-9]*)</u>");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find())
			System.out.println(text.substring(matcher.start()+3 , matcher.end()-4));
	}

}
