package datenStrome;

import java.awt.Desktop;
import java.io.*;
import java.net.URI;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class File_mitByteArrayy {

	public static void main(String[] args) 
	{byte[] buf = new byte[10];
	int len = 0;
	FileInputStream quelle;
	FileOutputStream ziel;
	try 
		{quelle = new FileInputStream("D:\\quelle.txt");
		ziel = new 	FileOutputStream("D:\\ziel.txt");
		while ((len = quelle.read(buf))> 0)
			{ziel.write(buf,0,len);	
			}
		
		if (Desktop.isDesktopSupported())
			{Desktop desk = Desktop.getDesktop();
			File ziel2 = new File("D:\\ziel.txt");
			try 
				{desk.open(ziel2);	
				//desk.browse(new URI("http://www.java-blog-buch.de"));
				Document doc = new Document();
				PdfWriter.getInstance(doc, new FileOutputStream("D:\\ziel.pdf"));
				doc.open();
				doc.add(new Paragraph("Hallo Ammar"));
				doc.close();
				}
			finally 
				{   
	            }
			}
		quelle.close();
		ziel.close();
		
		}
	catch(Exception e)
		{
			System.out.println("Error");
		}

	}

}
