package Vektoren_Addition;

public class Vektor 
{int x,
	 y,
	 z;
public Vektor()
	{this.x = 0;
	this.y= 0;
	this.z = 0;
	}
public Vektor(int ss_x ,int ss_y , int ss_z)
	{this.x = ss_x;
	this.y= ss_y;
	this.z = ss_z;
	}
public  Vektor add( Vektor ss_b)
	{Vektor ergebnis = new Vektor() ;
	ergebnis.x = this.x + ss_b.x;
	ergebnis.y = this.y + ss_b.y;
	ergebnis.z = this.z + ss_b.z;
	return ergebnis	;
	}
public String toString() 
	{return "(x, y, z) = (" + this.x + ", " + this.y + ", "+ this.z + " )";	
	}
}
