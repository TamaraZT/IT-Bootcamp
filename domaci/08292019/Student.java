package fakultet;

public class Student extends Covek {
	private String indeks;
	private String godina;
	private double prosek;

	public Student(String ime, String prezime, int godRodj,String indeks, String godina, double prosek) {
		super(ime, prezime, godRodj);
		this.indeks=indeks;
		this.godina=godina;
		this.prosek=prosek;
	}

	public String getIndeks() {
		return indeks;
	}

	public String getGodina() {
		return godina;
	}

	public double getProsek() {
		return prosek;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getIme()).append("_").append(getPrezime()).append("[").append(getGodRodj());
		sb.append("je student").append(getGodina()).append(" godine studija, sa prosekom").append(getProsek());
		return sb.toString();
	}
	
	

}
