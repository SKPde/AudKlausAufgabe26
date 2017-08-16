
public class Gabelstabler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeinStapel stapel = new MeinStapel();
		
		stapel.drauf(new Wert(12));
		stapel.drauf(new Wert(7));
		stapel.drauf(new Wert(5));
		stapel.drauf(new Wert(10));
		
		stapel.ausgabe();
	}

}
