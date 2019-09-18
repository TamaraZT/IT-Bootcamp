package vezbanje;

import java.util.Scanner;

public class Zadatak_2c_08132019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko
		 * konzole). Program treba da ispise zbir
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ukucaj k: ");
		int k = sc.nextInt();
		System.out.println("Ukucaj n: ");
		int n = sc.nextInt();
		int br = k;
		int sum = 0;
		if (n < k) {
			System.out.println("Los unos");
		} else {
			while (br <= n) {
				sum += br;
				br++;
			}
			System.out.println("Rezultat je: " + sum);
		}
	}

}
