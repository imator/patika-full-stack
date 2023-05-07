import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k,top=0;

        do{
            System.out.print("Sayı giriniz ( çıkmak için tek sayı giriniz ): ");
            k = inp.nextInt();
            if(k%4==0) top += k;

        }while(k%2!=1);
        System.out.println("Sonuc: " + top);
    }
}
