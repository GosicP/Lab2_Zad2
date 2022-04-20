package revija;

public class Model {
	
	public static int id=0;
	protected Velicina velicina;
	int ID;
	public Model(Velicina oznaka) {
		velicina=oznaka;
		ID=id++;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("Model");
		sb.append(" ");
		sb.append(ID);
		sb.append(" ");
		sb.append("(");
		sb.append(velicina);
		sb.append(")");
		return sb.toString();
	}

	public int dohvId() {
		return ID;
	}

	public Velicina dohvVelicinu() {
		return velicina;
	}

	
}
