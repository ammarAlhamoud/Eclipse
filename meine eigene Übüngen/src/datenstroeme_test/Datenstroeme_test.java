package datenstroeme_test;
import java.io.*;
public class Datenstroeme_test {

	public static void main(String[] args) {
		try {// File erstellen und schreiben
			FileWriter myfile = new FileWriter("D:\\klausur.txt");
			BufferedWriter ifs = new BufferedWriter(myfile);
			ifs.write("Ammar");
			ifs.newLine();
			ifs.write("alhamoud");
			ifs.close();
			
			// File für Read erstellen und lesen
			FileReader fr = new FileReader("D:\\klausur2.txt");
			BufferedReader br = new BufferedReader(fr);
			int zeichen ;
			while((zeichen=br.read()) != -1)
			{System.out.print((char)zeichen);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
