import java.util.Scanner;

public class UcgenAlanBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        double u, alan;

        System.out.print("Üçgenin 1. kenarı: ");
        a = input.nextInt();
        System.out.print("Üçgenin 2. kenarı: ");
        b = input.nextInt();
        System.out.print("Üçgenin 3. kenarı: ");
        c = input.nextInt();

        u = (double) (a + b + c) / 2;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Girilen kenarlara göre oluşacak üçgenin alanı: " + alan + " birim^2");


    }
}
