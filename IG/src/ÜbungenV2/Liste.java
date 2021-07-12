package ÜbungenV2;

public class Liste {
	int inhalt;
	Liste verweis;
	public static final byte VOLL = 0x1;
	public static final byte LEER = 0x0;
	
	public Liste() {
		this.inhalt = 0;
		this.verweis = null;
	}
	
	public Liste(int n) {
		this.inhalt = n;
		this.verweis = null;
	}
	
	public  Liste(int n, byte b) {
		Liste neu;
		this.inhalt = (int)(Math.random()*100*b);
		for (int i = 1; i<n; i++) {
		neu = new Liste((int)(Math.random()*100*b));	
		this.anfuegen(neu);
		}
	}
	
	public static Liste listeErzeugen(int n) {
		Liste Anfang = new Liste();
		for(int i = 1; i<n;i++) {
			Anfang.anfuegen(new Liste());
		}
		return Anfang;
		
	}
	
	public Liste letzteselement() {
		Liste letztes = this ;
		
		while(letztes.verweis != null) {
			letztes = letztes.verweis;
		}
		return letztes;
	}
	
	public Liste rekursivLetztesElement() {
		if(this.verweis != null) {
			return (this.verweis).rekursivLetztesElement();
		}
		return this;
	}
	
	public Liste rekursivLetztesElementlang(){
		Liste letztes = this;
		if(this.verweis!= null) {
			letztes = letztes.verweis;
			letztes = letztes.rekursivLetztesElementlang();
		}
		return letztes;
		
	}
	
	public void anfuegen(Liste neu) {
		Liste L = this.letzteselement();
		L.verweis = neu;
	}
	
	public void ausgeben() {
		System.out.println(this.inhalt);
	}
	
	public void alleausgeben() {
		Liste H = this;
		while(H != null) {
			H.ausgeben();
			H = H.verweis;
		}
	}
	
	public void rekursivAlleAusgeben() {
		this.ausgeben();
		if(this.verweis != null) {
			this.verweis.rekursivAlleAusgeben();
		}
	}

}
