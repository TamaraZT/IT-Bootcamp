import java.util.Scanner;

public class Zadatak_3_08212019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi n za duzinu niza:");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("UNesi element " + i);
            niz[i] = sc.nextInt();
        }

        boolean rastuciNiz = true;
        for (int i = 0; i < niz.length - 1; i++) {
            if (niz[i] > niz[i + 1]) {
                rastuciNiz = false;
                break;
            }
        }
        if (rastuciNiz) {
            System.out.println("Niz je rastuci!");
        } else {
            System.out.println("Niz nije rastuci!");
        }
    }
}
