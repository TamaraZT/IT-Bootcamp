import java.util.Scanner;

public class ParanBroj {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Broj je paran!");
        } else {
            System.out.println("Broj je neparan!");
        }
    }
}
