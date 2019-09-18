package Njiva;

public class Njiva extends Parcela{

	private double prinosPoKvm;
	
	public Njiva(int povrsina, double prinosPoKvm) {
		super(povrsina);
		this.prinosPoKvm = prinosPoKvm;
		this.vrsta ='N';
	}

	@Override
	public char getVrsta() {
		return this.vrsta;
	}

	@Override
	public double getPrinos(int brojGod) {
		//nisam znala kako da ovde upotrebim broj godina. Pretp da treba ovo da pomnozim sa brojGod, ali nije pisalo u formuli.
		return getPovrsina()*prinosPoKvm;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Parcela:(").append(prinosPoKvm);
		return sb.toString();
	}
	
	public void setPrinosPoKvm(double prinosPoKvm) {
		this.prinosPoKvm = prinosPoKvm;
	}

}
