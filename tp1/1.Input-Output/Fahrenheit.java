import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Température (°C) : ");
        double c = sc.nextDouble();
        double f = c * 9 / 5 + 32;
        System.out.println("Température en °F = " + f);
        sc.close();
    }
}
