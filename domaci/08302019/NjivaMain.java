package Njiva;

public class NjivaMain {

	public static void main(String[] args) {
		
		Parcela[] parcele = new Parcela[5];
		parcele[0] = new Suma(100, 60, 1000.5, 2);
		parcele[1] = new Njiva(18, 150);
		parcele[2] = new Suma(300, 250, 500, 1);
		parcele[3] = new Suma(250, 240, 350, 2);
		parcele[4] = new Njiva(50, 200);
		
		for(Parcela p : parcele) {
			System.out.println(p.getPrinos(3));
		}
		
	}

}
