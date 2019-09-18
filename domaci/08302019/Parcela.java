package Njiva;

public abstract class Parcela {

	private static int uid=0;
	private int povrsina;
	private int id;
	protected Character vrsta;
	
	public Parcela(int povrsina) {
		this.povrsina = povrsina;
		id=++uid;
		}
	
	public int getUid() {
		return uid;
	}
	public int getPovrsina() {
		return povrsina;
	}
	public int getId() {
		return id;
	}
	public abstract char getVrsta();
	public abstract double getPrinos(int brojGod);
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getVrsta()).append("-").append(getId()).append("[").append(getPovrsina()).append("]");
		return sb.toString();
	}
	
	
	
	
	
	
	

}
