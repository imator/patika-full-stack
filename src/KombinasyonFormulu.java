import java.util.Scanner;

public class KombinasyonFormulu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r, result;
        int a = 1, b = 1, c = 1;
        System.out.println("Kombinasyon Formulu C(n,r)");

        System.out.print("n değişkeni: ");
        n = inp.nextInt();

        System.out.print("r değişkeni: ");
        r = inp.nextInt();

        if (n >= r) {
            for (int i = 1; i <= n; i++) {
                if (n >= i) a *= i;
                if (r >= i) b *= i;
                if (n - r >= i) c *= i;
            }
            System.out.println("Sonuc: " + a / (b * c));
        } else {
            System.out.println("Geçersiz değer girdiniz...");
        }
    }
}
