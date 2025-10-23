package tp1.Loops;
import java.util.Scanner;

public class TestDePrimalite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        boolean estPremier = n > 1;

        for (int i = 2; i * i <= n && estPremier; i++) {
            if (n % i == 0) estPremier = false;
        }

        System.out.println(n + (estPremier ? " est premier" : " n’est pas premier"));
    }
}
