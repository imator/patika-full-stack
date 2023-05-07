import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        /*
        Mesafeyi km türünden giriniz : 1500
        Yaşınızı giriniz : 20
        Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
        Toplam Tutar = 216 TL
        */

        int mesafe, yas, tip;
        double indirimOrani = 1.0, normalTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplamTutar = 0.0;

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz :");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip = inp.nextInt();

        if (mesafe > 0 && yas > 0 && (tip >= 1 && tip <= 2)) {
            /*
            Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
            Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
            İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
            Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
            Toplam Tutar = (135-27)* 2 = 216 TL
             */

            normalTutar = mesafe * 0.10;

            if (yas < 12) indirimOrani = 0.50;
            else if (yas >= 12 && yas <= 24) indirimOrani = 0.10;
            else if(yas > 65) indirimOrani = 0.30;
            else indirimOrani = 0.0;

            yasIndirimi = normalTutar * indirimOrani;

            indirimliTutar = normalTutar - yasIndirimi;

            gidisDonusIndirimi = (tip == 2) ? indirimliTutar * 0.20 : 0;

            toplamTutar = (indirimliTutar - gidisDonusIndirimi)*tip;

            System.out.println("Toplam Tutar: " + toplamTutar + " TL");

        } else {
            System.out.println("Geçersiz bir değer girdiniz !!!");
        }


    }
}
