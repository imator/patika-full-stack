import java.util.Scanner;

public class ArtikYilHesabi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int year;
        System.out.print("Yıl Giriniz :");
        year = inp.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
        } else {
            if ((year % 4 == 0)) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }
        }
    }


}
