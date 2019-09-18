package vezbanje;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Brojeve do n koji nisu deljivi sa 5
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Unesi n:");
	        int n = sc.nextInt();
	        for(int i = 0; i <= n;i++){
	            if(i % 5 != 0) {
	                System.out.println(i);
	            }
	        }
	}

}
