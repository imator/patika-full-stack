import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        */

        double KGF_ARMUT = 2.14,
                KGF_ELMA = 3.67,
                KGF_DOMATES = 1.11,
                KGF_MUZ = 0.95,
                KGF_PATLICAN = 5.00;

        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican,toplamTutar;

        System.out.print("Armut Kaç Kilo: ");
        kgArmut = input.nextDouble();

        System.out.print("Elma Kaç Kilo: ");
        kgElma = input.nextDouble();

        System.out.print("Domates Kaç Kilo: ");
        kgDomates = input.nextDouble();

        System.out.print("Muz Kaç Kilo: ");
        kgMuz = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo: ");
        kgPatlican = input.nextDouble();
        ;

        toplamTutar =   KGF_ELMA * kgElma +
                        KGF_ARMUT * kgArmut +
                        KGF_DOMATES * kgDomates +
                        KGF_MUZ * kgMuz +
                        KGF_PATLICAN * kgPatlican;

        System.out.print("Sepetinizin Topla Tutarı: " + toplamTutar + " TL");
    }
}
