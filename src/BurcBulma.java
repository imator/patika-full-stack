import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int ay, gun;
        boolean validation;
        System.out.println("**** BURÇ BULMA PROGRAMINA HOŞGELDİNİZ ****");
        System.out.print("Ay (1-12): ");
        ay = inp.nextInt();

        System.out.print("Gün (1-31): ");
        gun = inp.nextInt();

        //Ay ve Gün Kontrolü
        validation = ay >= 1 && ay <= 12 &&
                (ay == 2 ? gun % 4 == 0 ? gun <= 29 : gun <= 28 : gun <= 31) &&
                (ay != 4 && ay != 7 && ay != 9 && ay != 11 || gun <= 30);

        if (validation) {
            //Koç Burcu : 21 Mart - 20 Nisan
            if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) System.out.println("Koç Burcusunuz...");

            // Boğa Burcu : 21 Nisan - 21 Mayıs
            if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) System.out.println("Boğa Burcusunuz...");

            //İkizler Burcu : 22 Mayıs - 22 Haziran
            if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) System.out.println("İkizler Burcusunuz...");

            //Yengeç Burcu : 23 Haziran - 22 Temmuz
            if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) System.out.println("Yengeç Burcusunuz...");

            //Aslan Burcu : 23 Temmuz - 22 Ağustos
            if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) System.out.println("Aslan Burcusunuz...");

            //Başak Burcu : 23 Ağustos - 22 Eylül
            if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) System.out.println("Başak Burcusunuz...");

            //Terazi Burcu : 23 Eylül - 22 Ekim
            if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) System.out.println("Terazi Burcusunuz...");

            //Akrep Burcu : 23 Ekim - 21 Kasım
            if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) System.out.println("Akrep Burcusunuz...");

            //Yay Burcu : 22 Kasım - 21 Aralık
            if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) System.out.println("Yay Burcusunuz...");

            //Oğlak Burcu : 22 Aralık - 21 Ocak
            if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) System.out.println("Oğlak Burcusunuz...");

            //Kova Burcu : 22 Ocak - 19 Şubat
            if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) System.out.println("Kova Burcusunuz...");

            //Balık Burcu : 20 Şubat - 20 Mart
            if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) System.out.println("Balık Burcusunuz...");
        }
        else {
            System.out.println("Geçersiz Bir Tarih Girdiniz...");
        }
    }
}
