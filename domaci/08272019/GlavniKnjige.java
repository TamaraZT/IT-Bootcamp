package domaciCetvrta;

public class GlavniKnjige {

	public static void main(String[] args) {
		Knjige a1 = new Knjige("Naziv 1", "Autor A", 358);
		Knjige a2 = new Knjige("Naziv 2", "AutorB", 367);
		Knjige a3 = new Knjige("Naziv 3", "AutorC", 322);
		a1.setGodina(1854);
		a2.setGodina(2011);
		a3.setGodina(1993);
		System.out.println(a1.getNaziv() + ", " + a1.getAutor() + ", broj strana: " + a1.getBrStr()
				+ ", godina izdanja " + a1.getGodina());
		System.out.println(a2.getNaziv() + ", " + a2.getAutor() + ", broj strana: " + a2.getBrStr()
				+ ", godina izdanja " + a2.getGodina());
		System.out.println(a3.getNaziv() + ", " + a3.getAutor() + ", broj strana: " + a3.getBrStr()
				+ ", godina izdanja: " + a3.getGodina());

	}

}
