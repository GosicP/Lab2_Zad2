package revija;

public class Velicina {

	public enum Oznaka {S, M, L}
	Oznaka oznaka;
	
	public Oznaka dohvOznaku() {
		return oznaka;
	}

	public Velicina (Oznaka Oznaka) {
		this.oznaka=Oznaka;
	}
	
	public boolean manja(Velicina velicina) {
		if(this.oznaka.compareTo(velicina.oznaka)<0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(oznaka);
		return sb.toString();
	}

}