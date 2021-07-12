package datenStrome;
import java.io.*;
public class FileWriter_test {

	public static void main(String[] args) 
	{FileInputStream  fis;
	FileWriter fr;
	try 
		{fr = new FileWriter("D:\\newText.txt");
		BufferedWriter bw = new BufferedWriter(fr);
		bw.write("gut gemacht mein Klug ");
		bw.newLine();
		bw.write("okkkkkkkkkkkk");
		bw.close();	
		fis = new FileInputStream("D:\\\\newText.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String c;
		while ((c= br.readLine()) != null)
			{System.out.println(c);	
			}
		br.close();
		
		}
	catch(Exception e)
		{
			
		}

	}

}
