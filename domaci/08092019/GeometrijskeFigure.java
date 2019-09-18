import java.util.Scanner;

public class GeometrijskeFigure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tip geometrijske figure. Moguce vrednosti su: pravougaonik, krug ili kvadrat");
        String tipFigure = sc.nextLine();
        String errorMessage = "Greska pri unosu! Dozvoljeni tipovi su: pravougaonik, krug, kvadrat ";

        if (tipFigure == null) {
            System.out.println(errorMessage);
        }

        switch (tipFigure) {
            case "pravougaonik":
                double a, b, pp;
                System.out.println("Ukucaj vrednost a stranice: ");
                a = sc.nextDouble();
                System.out.println("Ukucaj vrednost b stranice: ");
                b = sc.nextDouble();

                pp = a * b;

                System.out.println("Povrsina pravougaonika je: " + pp);
                break;
            case "krug":
                double r, pk;
                System.out.println("Unesi velicinu poluprecnika: ");
                r = sc.nextDouble();
                pk = r * r * 3.15;
                System.out.println("Povrsina kruga je: " + pk);
                break;
            case "kvadrat":
                double x, pkv;
                System.out.println("Unesi velicinu stranice kvadrata: ");
                x = sc.nextDouble();
                pkv = x * x;
                System.out.println("Povrsina kvadrata je: " + pkv);

                break;
            default:
                System.out.println(errorMessage);
                break;
        }

    }
}
