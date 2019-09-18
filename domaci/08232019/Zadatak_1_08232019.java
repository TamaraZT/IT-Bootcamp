import java.util.Scanner;

public class Zadatak_1_08232019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj:");
        int n = sc.nextInt();
        int inv = inverzanBroj(n);
        System.out.println("Inverzan broj je " + inv);
    }

    public static int inverzanBroj(int n) {
        int inv = 0;
        while (n > 10) {
            inv = inv * 10 + n % 10;
            n = n / 10;
        }
        inv = inv * 10 + n;
        return inv;
    }

}
