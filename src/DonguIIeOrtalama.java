import java.util.Scanner;
public class DonguIIeOrtalama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k,top=0,sayac=0;
        System.out.print("Bir sayı giriniz: ");
        k = inp.nextInt();
        for (int i = 1; i <= k; i++) {
            if(i%3 == 0 && i%4 == 0) {
                System.out.println(i);
                sayac++;
                top +=i;
            }
        }
        double ort = top / sayac;
        System.out.println("3 ve 4'e bölünen sayıların ortalaması = " + ort);
    }
}
