import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dersNotu;
        boolean gecerliNot;
        int ortToplam = 0, ortAdet = 0;

        System.out.print("Matematik Notu: ");
        dersNotu = input.nextInt();
        gecerliNot = dersNotu >= 0 && dersNotu <= 100;
        ortToplam += gecerliNot ? dersNotu : 0;
        ortAdet += gecerliNot ? 1 : 0;


        System.out.print("Fizik Notu: ");
        dersNotu = input.nextInt();
        gecerliNot = dersNotu >= 0 && dersNotu <= 100;
        ortToplam += gecerliNot ? dersNotu : 0;
        ortAdet += gecerliNot ? 1 : 0;

        System.out.print("Kimya Notu: ");
        dersNotu = input.nextInt();
        gecerliNot = dersNotu >= 0 && dersNotu <= 100;
        ortToplam += gecerliNot ? dersNotu : 0;
        ortAdet += gecerliNot ? 1 : 0;

        System.out.print("Türkçe Notu: ");
        dersNotu = input.nextInt();
        gecerliNot = dersNotu >= 0 && dersNotu <= 100;
        ortToplam += gecerliNot ? dersNotu : 0;
        ortAdet += gecerliNot ? 1 : 0;

        System.out.print("Tarih Notu: ");
        dersNotu = input.nextInt();
        gecerliNot = dersNotu >= 0 && dersNotu <= 100;
        ortToplam += gecerliNot ? dersNotu : 0;
        ortAdet += gecerliNot ? 1 : 0;

        System.out.print("Müzik Notu: ");
        dersNotu = input.nextInt();
        gecerliNot = dersNotu >= 0 && dersNotu <= 100;
        ortToplam += gecerliNot ? dersNotu : 0;
        ortAdet += gecerliNot ? 1 : 0;

        System.out.print("Dönem Ortalamanız: " + ortToplam / ortAdet);


    }
}

