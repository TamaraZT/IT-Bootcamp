package ucionica;

public class Laptop {
	/*poseduje polaznika i marku koji se zadaju prilikom kreiranja.
	 *  Marka moze samo da se dohvati. 
	 *  Laptop takdje moze da menja polaznika ili da ostane bez polaznika.
	 *   Moze da se ispise u obliku: MARKA{POLAZNIK}
	 */
	private Polaznik polaznik;
	private String marka;

	public Laptop(Polaznik polaznik, String marka) {
		this.polaznik = polaznik;
		this.marka = marka;
	}

	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void setPolaznik(Polaznik polaznik) {
		this.polaznik=polaznik;
	}
	public void resetPolaznik() {
		polaznik = null;
	}

	public String getMarka() {
		return marka;
	}
	


	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(this.getMarka()).append("{").append(this.getPolaznik()).append("}");
		return  sb.toString();
	}

	public String ispisi() {
		String s;
		if(polaznik==null) {
			s="Nema polaznika";
		}else {
			s=polaznik.toString();
		}
		return s;
	}
	
	
	
	

}
