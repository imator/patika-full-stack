import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, k, i = 1;
        int buyukSayi = 1, kucukSayi = 1, temp;

        System.out.print("Kaç Sayı Gireceksin: ");
        k = inp.nextInt();

        System.out.print(i + ". Girdiğiniz Sayı: ");
        n = inp.nextInt();
        temp = n;
        k--;

        if (k != 0) {
            do {
                k--; i++;
                System.out.print(i + ". Girdiğiniz Sayı: ");
                n = inp.nextInt();

                //Küçük Büyük Bulma ( ilk 2 sayı )
                if (i == 2) {
                    if (n > temp) {
                        buyukSayi = n;
                        kucukSayi = temp;
                    } else {
                        kucukSayi = n;
                        buyukSayi = temp;
                    }
                } else {
                    if (n < kucukSayi) kucukSayi = n;
                    if (n > buyukSayi) buyukSayi = n;
                }

            } while (k != 0);
            System.out.println("Küçük Sayı: " + kucukSayi);
            System.out.println("Büyük Sayı: " + buyukSayi);
        } else {
            System.out.println("Bir sayı ile Küçük büyük bulunamaz");
        }
    }
}
