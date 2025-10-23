import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de termes : ");
        int k = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 0; i < k; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        sc.close();
    }
}
