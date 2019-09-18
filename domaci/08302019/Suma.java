package Njiva;

public class Suma extends Parcela{
	
	private int povrsinaStabala;
	private double prinosStabla;
	private int periodSazrevanja;

	public Suma(int povrsina, int povrsinaStabala,double prinosStabla, int periodSazrevanja) {
		super(povrsina);
		this.povrsinaStabala = povrsinaStabala;
		this.prinosStabla = prinosStabla;
		this.periodSazrevanja = periodSazrevanja;
		this.vrsta = 's';
	}

	@Override
	public char getVrsta() {
		return this.vrsta;
	}

	@Override
	public double getPrinos(int brojGod) {
		return getPovrsina()/povrsinaStabala * this.prinosStabla *( brojGod/this.periodSazrevanja);
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Parcela:(").append(povrsinaStabala).append(",").append(this.prinosStabla).append(",").append(this.periodSazrevanja).append(")");
		return sb.toString();
	}
}
