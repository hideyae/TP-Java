import java.util.Scanner;

public class Somme1n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();

        int sommeFor = 0;
        for (int i = 1; i <= n; i++) sommeFor += i;
        System.out.println("Somme (for) = " + sommeFor);

        int sommeWhile = 0, i = 1;
        while (i <= n) {
            sommeWhile += i;
            i++;
        }
        System.out.println("Somme (while) = " + sommeWhile);
        sc.close();
    }
}
