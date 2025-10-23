package tp1.Loops;
import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        long n = sc.nextLong();
        int etapes = 0;

        while (n != 1) {
            System.out.print(n + " → ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            etapes++;
        }
        System.out.println("1");
        System.out.println("Nombre d’étapes : " + etapes);
    }
}
