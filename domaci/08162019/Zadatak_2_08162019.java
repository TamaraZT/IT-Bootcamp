package vezbanje;

import java.util.Scanner;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		// Prirodnih brojeva od 1 do n koji nisu djeljivi sa 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi n:");
        int n = sc.nextInt();
        int i = 1 ;
        while(i <= n) {
            if(i % 5 != 0) {
                System.out.println(i);
            }
            i++;
        }

	}

}
