package funktionale_Abstraktion_zumVerstehen;

public class Pocket 
	{private String Value ="Key";
	public Pocket ()
		{	}
	public Pocket (String Value)
		{this.Value = Value;		
		}
	
	public void set (String Value)
		{//Mit set() lassen sich Objekte in die Tasche setzen 
		this.Value = Value;		
		}
	
	public String get ()
		{// und über die Zugriffsmethode get() wieder auslesen.
		return Value;
		}
	
	public boolean isEmpty ()
		{return Value == null;	
		}
	
	public void Empty ()
		{Value = null;		
		}
	
	
	}
