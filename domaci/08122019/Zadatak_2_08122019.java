package vezbanje;

import java.util.Scanner;

public class Zadatak_2_08122019 {

	public static void main(String[] args) {
		// Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n. 
		//Koristiti jednu petlju
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n=sc.nextInt();
		int br=0;
		int sump=0;
		int sumn =1;
		while (br<n) {
			
			if(br%2==0) {
				sump+=br; 
			} else {
				sumn*=br;
			}
			br+=1;
		}
		System.out.println("Suma parnih je:"+sump);
		System.out.println("Proizvod neparnih je:" +sumn);
	}
}
	

		




