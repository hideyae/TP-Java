import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masse (kg) : ");
        double masse = sc.nextDouble();
        System.out.print("Taille (m) : ");
        double taille = sc.nextDouble();
        double imc = masse / (taille * taille);
        System.out.printf("IMC = %.2f%n", imc);
    }
}
