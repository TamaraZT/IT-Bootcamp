package vezbanjeTreca;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		/* Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
		Primer niza: 3 54 123 18
		Ispis: 18 123 54 3*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n = sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<a.length;i++) {
			System.out.println("Unesi element:");
			a[i]=sc.nextInt();
			
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
