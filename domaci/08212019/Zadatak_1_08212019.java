package vezbanjeTreca;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neko broj br. Program
		// ispisuje elemente niza deljive brojem br.
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n = sc.nextInt();
		System.out.println("Unesi broj:");
		int br = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Unesi element" + i);
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % br == 0) {
				System.out.println(a[i]);
			}
		}

	}

}
