import java.util.Scanner;

public class AireCercle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rayon r : ");
        double r = sc.nextDouble();
        double aire = Math.PI * r * r;
        System.out.println("Aire = " + aire);
        sc.close();
    }
}

