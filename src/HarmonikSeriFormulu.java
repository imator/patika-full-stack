import java.util.Scanner;

public class HarmonikSeriFormulu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;
        double k = 1,sonuc = 0;

        System.out.print("Harmonik Sersinin Değerini Giriniz: ");
        n = inp.nextInt();
        while (n >= k) {
            sonuc += 1 / k;
            k++;
        }
        System.out.println("Sonuc: " + sonuc);

    }
}
