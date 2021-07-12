package notizbuch;
import java.io.*;
import java.util.ArrayList;

public class Archivar {
	FileOutputStream filewriter;
	ObjectOutputStream objectwriter;
	FileInputStream filereader;
	ObjectInputStream objectreader;

	public void write () { 		
	 	try 
	 	{	filewriter  = new FileOutputStream ("Notizbuch.txt");
		} 			 	
	 	catch (FileNotFoundException e1) 
	 	{	e1.printStackTrace();
		}
				 
		try 
		{	objectwriter = new ObjectOutputStream(filewriter);
		} 
		catch (IOException e) 
		{	e.printStackTrace();
		}
	}
				
	public void read () {			
		try 
		{	filereader = new FileInputStream ("Notizbuch.txt");
		} 
		catch (FileNotFoundException e1) 
		{	e1.printStackTrace();
		}
		
		try 
		{	objectreader = new ObjectInputStream(filereader);
		} 
		catch (IOException e) 
		{	e.printStackTrace();
		}
	}
				
	public void speichere_Object (ArrayList<Notiz> ss_Notiz) {				
		try 
		{ 	objectwriter.writeObject(ss_Notiz);
		}
		catch(Exception e)
		{	System.out.println("ERROR beim speichern");
		}
	}
		
	public ArrayList<Notiz> read_Object () {
		ArrayList<Notiz> ss_lst_notiz = null ;
		try 
		{	ss_lst_notiz = (ArrayList<Notiz>)objectreader.readObject();
		} 
		catch (ClassNotFoundException e) 
		{	e.printStackTrace();
		} 
		catch (IOException e) 
		{	e.printStackTrace();
		}	
		return ss_lst_notiz;
	}

}

