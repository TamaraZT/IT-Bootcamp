package vezbanje;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesi n:");
		int n = scanner.nextInt();

		if (n == 0) {
			System.out.println("Greska!");
		} else {
			int prviBroj = 1;
			System.out.println(prviBroj);
			if (n > 1) {
				int drugiBroj = 1;
				System.out.println(drugiBroj);
				for (int i = 2; i < n; i++) {
					int zbir = prviBroj + drugiBroj;
					prviBroj = drugiBroj;
					drugiBroj = zbir;
					System.out.println(drugiBroj);
				}
			}
		}

	}
}
