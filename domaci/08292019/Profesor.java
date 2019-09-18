package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor  extends Covek{
	private String titula;
	private List<String> predmeti;

	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.titula = titula;
		this.predmeti = new ArrayList<>();
	}
	

	public String getTitula() {
		return titula;
	}


	public List<String> getPredmeti() {
		return predmeti;
	}
	
	public void setPredmeti(List<String> predmeti) {
		this.predmeti = predmeti;
	}
	
	public void dodajPredmet(String predmet) {
		this.predmeti.add(predmet);
	}
	
	public void oduzmiPredmet(String predmet) {
		this.predmeti.remove(predmet);
	}



	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getIme()).append("_").append(getPrezime()).append("[").append(getGodRodj()).append("]");
		sb.append(" je ").append(getTitula()).append(" koji drzi nastavu na:").append(getPredmeti()).append(".");
		
		return sb.toString();
	}
}
