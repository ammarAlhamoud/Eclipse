package einfach_verkettete_Liste_V2;

public abstract class Test {

	public static void main(String[] args) 
	{MyList Ammar = new MyList();
	for (int i = 0; i< 10 ; i++)
		{Ammar.addFirst(i*100+i*10+i);
		}
	while (Ammar.size()>0)
		{System.out.println(Ammar.removeFirst());
		}
	}

}
