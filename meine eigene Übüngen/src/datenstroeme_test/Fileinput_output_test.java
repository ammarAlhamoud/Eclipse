package datenstroeme_test;
import java.io.*;
public class Fileinput_output_test {

	public static void main(String[] args) {
	try {	
	FileOutputStream fis = 	new FileOutputStream("D:\\klausur3.txt");
	OutputStreamWriter osw = new OutputStreamWriter(fis);
	BufferedWriter br = new BufferedWriter(osw);
	osw.write("Hier ist mein TEXT");
	osw.write("");
	osw.write("\n OKKKKKKK");
	
	String tast_input;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br2 = new BufferedReader(isr);
	tast_input = br2.readLine();
	while(tast_input.compareTo("EXIT")!=0)
		{System.out.println("name?");
		osw.write(tast_input);		
		tast_input=br2.readLine();
		}
	br.close();
	br2.close();
	osw.close();
	}
	catch(IOException e)
	{}
	}

}
