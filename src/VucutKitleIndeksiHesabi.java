import java.util.Scanner;
public class VucutKitleIndeksiHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy,kilo,index;

        System.out.println("Vücut Boy-Kitle İndeksi Hesaplama Programına Hoş Geldiniz...");
        System.out.print("Boyunuzu giriniz (m): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz (kg): ");
        kilo = input.nextDouble();
        //Hesap
        index = kilo/(boy*boy);
        System.out.print("Vücut Boy-Kitle İndeksiniz: "+ index);
    }
}
