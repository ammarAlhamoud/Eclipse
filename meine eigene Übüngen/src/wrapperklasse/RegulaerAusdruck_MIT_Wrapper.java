package wrapperklasse;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegulaerAusdruck_MIT_Wrapper {

	public static void main(String[] args) {
		String str = "mein Nummer ist <w>15.3</w> mit schönen Name <w>Ammar</w> , oh noch eine <w>1.5</w>";
		Pattern pattern = Pattern.compile("<w>.*?</w>");
		Matcher matcher = pattern.matcher(str);
		Pattern pattern_digit = Pattern.compile("<w>([0-9]*).([0-9]*)</w>");
		Double d = 0d;
		while (matcher.find())
		{//System.out.println(matcher.group());
		Matcher matcher_digit = pattern_digit.matcher(matcher.group());
		String digit;
		
		if (matcher_digit.find())
			{
			digit = str.substring(matcher.start()+3, matcher.end()-4);	
			 d += Double.valueOf(digit).doubleValue();			
			}

		}
		System.out.println(d);

		
		
	}

}
