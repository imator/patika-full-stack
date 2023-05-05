import java.util.Scanner;

public class NotOrtalamaHesabi {
    /**
     * @author Ahmet ORMAN - 06 Mayıs 2023
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik Derslerinin Notlarını Değişkene alma
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notu: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notu: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notu: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = input.nextInt();

        //Ortalama Hesabı
        int ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        //Karar
        boolean sonuc = (ortalama >= 60);
        String str = sonuc ? "Geçtiniz" : "Kaldınız";

        System.out.println("Ders Durumunuz: " + str);
    }
}


