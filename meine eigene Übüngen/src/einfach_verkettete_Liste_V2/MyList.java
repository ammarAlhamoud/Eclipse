package einfach_verkettete_Liste_V2;

public class MyList 
{private ListElement first;

public MyList()
	{first = null;
	}

public void addFirst(double d)
	{first = new ListElement(d, first);		
	}

public double removeFirst() 
	{if(first == null)
		{System.out.println("Fehler: Die Liste ist leer");
		return 0;
		}
	double value = first.getValue();
	first = first.getNext();
	return value;
	}
public double get(int i)
	{ListElement e = first;
	while (e != null && i>0)
		{e= e.getNext();
		i--;
		}
	if(e == null)
		{return 0;
		}
	return e.getValue();
	}
public int size()
	{int size = 0;
	ListElement e = first;
	while (e != null)
		{e = e.getNext();
		size++;
		}
	return size;	
	}
}
