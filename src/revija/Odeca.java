package revija;

public class Odeca implements Nosivo {

	private String naziv;
	private Velicina velicina;
	
	public Odeca(String ime, Velicina vel) {
		naziv=ime;
		velicina=vel;
	}

	public String dohvNaziv() {
		return naziv;
	}

	public Velicina dohvVelicinu() {
		return velicina;
	}
	@Override
	public boolean odgovara(Model model) {
		if(model.dohvVelicinu().manja(this.velicina)==true || model.velicina.oznaka.compareTo(velicina.oznaka)==0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("odeća");
		sb.append(" ");
		sb.append(naziv);
		sb.append(" ");
		sb.append(velicina);
		return sb.toString();
	}



}
