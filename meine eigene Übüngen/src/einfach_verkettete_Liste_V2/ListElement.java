package einfach_verkettete_Liste_V2;

public class ListElement 
{private double value ;
private ListElement next;

public ListElement(double d)
	{this.value = d;
	this.next = null;
	}

public ListElement (double d, ListElement next)
	{this.value = d;
	this.next = next;
	}

public double getValue()
	{return value;
	}

public void setValue(double d)
	{this.value = d;	
	}

public ListElement getNext()
	{return next;
	}
public void setNext(ListElement next) 
	{this.next = next;
	}
}
