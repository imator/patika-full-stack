import java.util.Scanner;

public class KdvHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double urunFiyati, kdvOrani, kdv, toplam;

        System.out.print("Aldığınız ürünün fiyatını giriniz (TL):");
        urunFiyati = input.nextFloat();

        //KDV Orani Tespiti
        kdvOrani = (urunFiyati > 1000) ? 0.8 : 0.18;

        //Kdv ve Kdv'li Hesabı
         kdv = urunFiyati * kdvOrani;
        toplam = urunFiyati + kdv;

        System.out.println("Uygulanan KDV Oranı: " + kdvOrani);
        System.out.println("KDV Değeri: " + kdv + " TL");
        System.out.println("KDV'li Toplam Fiyat: " + toplam + " TL");
    }
}
