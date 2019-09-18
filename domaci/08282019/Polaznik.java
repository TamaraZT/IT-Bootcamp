package ucionica;

public class Polaznik {
	/*ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
	 * Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti. 
	 * Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
	 * Vozac se ispisuje u obliku: IME_PREZIME{ID}.
	 */
	private static int UID=0;
	private String ime, prezime;
	private int id;
	
	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		id=++UID;
	}
	
	public static int getUID() {
		return UID;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getId() {
		return id;
	}
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(this.getIme()).append("_").append(this.getPrezime());
		sb.append("{").append(this.getId()).append("}");
		return sb.toString();
	}
	
	
}
