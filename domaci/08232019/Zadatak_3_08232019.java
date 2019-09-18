import java.util.Scanner;

public class Zadatak_3_08232019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi n za duzinu niza:");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("UNesi element " + i);
            niz[i] = sc.nextInt();
        }
        int proizvod = proizvod(niz);
        System.out.println("Proizvod neparnih je " + proizvod);
        int zbir = zbir(niz);
        System.out.println("Zbir parnih je " + zbir);

    }

    public static int proizvod(int[] niz) {

        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            if (i % 2 != 0) {
                proizvod = proizvod * niz[i];
            }
        }
        return proizvod;
    }

    public static int zbir(int[] niz) {

        int zbir = 0;
        for (int i = 0; i < niz.length; i++) {
            if (i % 2 == 0) {
                zbir = zbir + niz[i];
            }
        }
        return zbir;
    }

}
