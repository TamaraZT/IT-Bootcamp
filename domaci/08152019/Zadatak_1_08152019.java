package vezbanje;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		//Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih tela (kocke, kvadra, valjka, lopte).
		//Koristiti do while petlju i switch grananje. Za izlaz koristiti nulu (0)
		Scanner sc=new Scanner(System.in);
		int izbor;
		do {
			System.out.println("Choose wisely:");
			System.out.println("0-Izlaz");
			System.out.println("1-Kocka");
			System.out.println("2-Kvadar");
			System.out.println("3-Valjak");
			System.out.println("4-Lopta");
			izbor=sc.nextInt();
			double a,b,c,r;
			switch(izbor) {
			case 1: 
				System.out.println("Unesi a:");
				 a=sc.nextDouble();
				 double kocka=6*(a*a);
				System.out.println("Povrsina kocke je:"+ kocka);
				break;
			case 2:
				System.out.println("Unesi a, b i c:");
				a=sc.nextDouble();
				b=sc.nextDouble();
				c=sc.nextDouble();
				double kvadar=2*((a*b)+(a*c)+(b*c));
				System.out.println("Povrsina kvadrda je: "+kvadar );
				break;
			case 3:
				System.out.println("Unesi r i h:");
				 r=sc.nextDouble();
				 double h=sc.nextDouble();
				 double valjak= 2 *((3.14*r)*(r+h));
				System.out.println("Povrsina valjka je:"+valjak);
				break;
			case 4:
				System.out.println("Unesi r:");
				r=sc.nextDouble();
				double lopta=4*(3.14*(r*r));
				System.out.println("Povrsina lopte je:"+lopta);
				break;
			default:
				System.out.println("Los unos");
				break;
			case 0: 
				System.out.println("Izlaz iz kalkulatora");
			}
			
		}while(izbor!=0);
		
	}

}
