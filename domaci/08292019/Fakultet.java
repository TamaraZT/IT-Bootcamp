package fakultet;

import java.util.Arrays;
import java.util.List;

public class Fakultet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor p = new Profesor("pera","peric",1989, "profa");
		p.dodajPredmet("Eng");
		p.dodajPredmet("rus");
		p.dodajPredmet("mat");
		p.oduzmiPredmet("rus");
		System.out.println(p);
		
	}

}
