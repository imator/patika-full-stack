import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;
        int sonuc = 1;
        System.out.print("Üs alınacak sayı : ");
        n = inp.nextInt();

        System.out.print("üs değeri: ");
        r = inp.nextInt();

        for (int i = 1; i <= r; i++) {
            sonuc *= n;
        }
        System.out.println("İşlem Sonucu: " + sonuc);
    }
}
