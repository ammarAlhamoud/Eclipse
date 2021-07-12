package funktionale_Abstraktion_zumVerstehen;

public class PlayerPocketDemo {

	public static void main(String[] args) 
	{Player Ammar = new Player();
	Ammar.name = "Alhamoud";
	Pocket pocket = new Pocket();
	String aBigNr = "11111111111L";
	pocket.set(aBigNr);
	Ammar.leftPocket = pocket;
	Ammar.rightPocket = new Pocket("22222222222L");
	System.out.println( Ammar.name + " hat in den Taschen " +
            Ammar.leftPocket.get() + " und " + Ammar.rightPocket.get() );
	String val1 = Ammar.leftPocket.get();
	String val2 = Ammar.rightPocket.get();
	System.out.println("values 1  im linken Hand ist " + val1);
	System.out.println("Valuw 2 im richten Hand ist " + val2);
	}

}
