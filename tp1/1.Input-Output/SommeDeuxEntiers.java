import java.util.Scanner;

public class SommeDeuxEntiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez a : ");
        int a = sc.nextInt();
        System.out.print("Entrez b : ");
        int b = sc.nextInt();
        System.out.println("Somme = " + (a + b));
        sc.close();
    }
}
