package vezbanje;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int x=4, y=6;
		{
		//postinkrement
		
		y= x++; //uzimamo vrednost x upisujemo je za y=4,i na nju dodajemo 1  za x=5
		x= y++; // uzimamo vrednost y za x=4, a na nju dodajemo 1 i tu vrednost prepisujemo za x=5
		//predekrement
		y=--x;//smanjimo vrednost od x za 1, x=3, pa je pripsemo na y=3
		x=--y;//smanjimo vrednost y na 2, pa je pripsemo na x=2
		//postdekrement
		y=x--;//uzimamo vrednost x za y=2. pa je smanjujemo za x=1
		x=y--;//uzimamo vrednost y za x=2, pa je smanjujemo za y=1
		//preinkrement
		y=++x;//povecavamo vrednost x za 1, x=3 i pripisemo za y=3
		x=++y;//povecamo vrednost y za 1, y=4 i pripisemo za x=4
				
		
		
		}
		
		System.out.println(y);
		System.out.println(x);
		
				

	}

}
