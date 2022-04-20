package revija;

public class Kombinacija {

	private Nosivo kombinacija[];
	private int maksimum;
	private int indeks=0;

	public Kombinacija(int broj) {
		maksimum=broj;
		kombinacija = new Nosivo[broj];
	}
	
	public void dodaj(Nosivo stvar) throws GDodavanje {
		if(indeks>=maksimum) {
			throw new GDodavanje();
		}else{
			kombinacija[indeks]=stvar;
			indeks++;
		}
	}
	
	public int dohvBrStvari() {
		return indeks;
	}
	
	public int dohvMaxBrStvari() {
		return maksimum;	
	}
	
	public Nosivo dohvStvar(int pozicija) throws GIndeks {
		if(pozicija>indeks) {
			throw new GIndeks();
		}else {
			return kombinacija[pozicija];
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i=0; i<indeks; i++) {
			sb.append(kombinacija[i]);
			if(i!=indeks-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
