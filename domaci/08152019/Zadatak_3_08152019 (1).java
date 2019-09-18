package vezbanje;

import java.util.Scanner;

public class Zadatak_3_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ukucaj n i m:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k<= m; k++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
