import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre : ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Pair");
        else
            System.out.println("Impair");
        sc.close();
    }
}
