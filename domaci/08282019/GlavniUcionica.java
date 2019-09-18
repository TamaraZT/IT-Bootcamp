package ucionica;

public class GlavniUcionica {

	public static void main(String[] args) {
		Polaznik p1=new Polaznik("A1","P1");
		Polaznik p2=new Polaznik("A2","B");
		Polaznik p3=new Polaznik("A13","P13");
		
		Laptop l1=new Laptop(p1,"Dell");
		Laptop l2=new Laptop(p2,"hp");
		
		System.out.println(p1.toString()+" "+l1.ispisi());
		l1.resetPolaznik();
		System.out.println(p1.toString()+" "+l1.ispisi());
		l1.setPolaznik(p3);
		System.out.println(p3.toString()+" "+l1.ispisi());
		
		l2.setPolaznik(p2);
		System.out.println(p2.toString()+" "+l2.ispisi());
	}
}
