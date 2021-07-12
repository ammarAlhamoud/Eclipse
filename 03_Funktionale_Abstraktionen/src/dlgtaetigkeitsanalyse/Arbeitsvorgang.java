package dlgtaetigkeitsanalyse;

public class Arbeitsvorgang 
{private long startZeitPunkt,
			  endZeitPunkt;
private int taetigkeitsart ;
private Arbeitsvorgang next;
public void set_next(Arbeitsvorgang ss_arbeitsvorgang)
	{next = ss_arbeitsvorgang;		
	}
public Arbeitsvorgang get_next()
	{return next;
	}
public void set_StartZeitPunkt(long ss_startZeitPunkt)
	{startZeitPunkt = ss_startZeitPunkt;		
	}
public long get_StartZeitPunkt()
	{return startZeitPunkt;
	}
public void set_EndZeitPunkt(long ss_endZeitPunkt)
	{endZeitPunkt = ss_endZeitPunkt;		
	}
public long get_EndZeitPunkt()
	{return endZeitPunkt;
	}
public void set_Taetigkeitsart(int ss_taetigkeitsart)
	{taetigkeitsart = ss_taetigkeitsart;
	}
public int get_Taetigkeitsart() 
	{return taetigkeitsart;	
	}
}
