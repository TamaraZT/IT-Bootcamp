import java.util.Scanner;

public class Zadatak_1_08222019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi realni broj:");
        double prvi = sc.nextFloat();
        System.out.println("Unesi drugi realni broj:");
        double drugi = sc.nextFloat();

        pomnozi(prvi, drugi);
        min(prvi, drugi);

    }

    public static void pomnozi(double prvi, double drugi) {
        double result = prvi * drugi;
        System.out.println("Proizvod je " + result);
    }

    public static void min(double prvi, double drugi) {
        double minimum = prvi;
        if (drugi < prvi) {
            minimum = drugi;
        }
        System.out.println("Najmanji broj je " + minimum);
    }
}
