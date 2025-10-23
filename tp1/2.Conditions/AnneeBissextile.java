import java.util.Scanner;

public class AnneeBissextile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Année : ");
        int an = sc.nextInt();

        boolean bissextile = (an % 4 == 0 && an % 100 != 0) || (an % 400 == 0);

        if (bissextile)
            System.out.println("Bissextile");
        else
            System.out.println("Non bissextile");
        sc.close();
    }
}
