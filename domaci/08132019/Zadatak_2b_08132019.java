package vezbanje;

import java.util.Scanner;

public class Zadatak_2b_08132019 {

	public static void main(String[] args) {
		/*Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko konzole).  
		 Program treba da ispise zbir. */
		Scanner sc=new Scanner(System.in);
		System.out.print("Ukucaj n: ");
		int n=sc.nextInt(); 
		int br=1;
		int sum=0;
		while (n>=br) {
			sum+=br;
			br++;
		}
		System.out.println("Zbir brojeva od 1 do n je: " + sum);		

	}

}
