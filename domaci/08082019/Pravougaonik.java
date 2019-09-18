import java.util.Scanner;

public class Pravougaonik {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, b, op, pp;

        System.out.println("Ukucaj vrednost a stranice: ");
        a = sc.nextDouble();
        System.out.println("Ukucaj vrednost b stranice: ");
        b = sc.nextDouble();

        op = 2 * a + 2 * b;
        pp = a * b;

        System.out.println("Povrsina pravougaonika je: " + pp);
        System.out.println("Obim pravougaonika je: " + op);


    }
}
