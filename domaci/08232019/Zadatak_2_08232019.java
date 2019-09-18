import java.util.Scanner;

public class Zadatak_2_08232019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi broj:");
        int a = sc.nextInt();
        System.out.println("Unesi drugi broj:");
        int b = sc.nextInt();
        System.out.println("Unesi treci broj:");
        int c = sc.nextInt();

        ispisiDeljive(a, b, c);
    }

    public static void ispisiDeljive(int a, int b, int c) {
        if (a % c == 0) {
            System.out.println(a);
        }
        if (b % c == 0) {
            System.out.println(b);
        }
    }

}
