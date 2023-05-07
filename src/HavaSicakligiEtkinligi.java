import java.util.Scanner;
public class HavaSicakligiEtkinligi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int havaSicakligi;

        System.out.print("Hava Sıcaklığını Giriniz: ");
        havaSicakligi = inp.nextInt();

        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */


        if (havaSicakligi < 5) {
            System.out.println("Kayak Yapabilirsin");
        }
        if (havaSicakligi >= 5 && havaSicakligi <= 15) {
            System.out.println("Sinemaya Gidebilirsin");
        }
        if (havaSicakligi >= 15 && havaSicakligi <= 25) {
            System.out.println("Piknik Yapabilirsin");
        }
        if (havaSicakligi > 25) {
            System.out.println("Yüzmeye Gidebilirsin");
        }

    }
}
