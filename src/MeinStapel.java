
public class MeinStapel implements Stapel {

	private Wert oben; // verweis auf oberen wert

	@Override
	public void drauf(Wert d) {
		// TODO Auto-generated method stub
		if (oben == null) {
			oben = d;
		} else {
			d.next = oben;
			oben = d;
		}
	}

	@Override
	public Wert runter() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ausgabe() {
		Wert temp = oben;
		System.out.println("");
		while (temp != null) {
			System.out.println(temp.d);
			temp = temp.next;
		}
		System.out.println("");
	}

}
