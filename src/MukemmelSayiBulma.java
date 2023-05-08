import java.util.Scanner;
public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,top=0;

        System.out.print("Sayı Giriniz: ");
        n = inp.nextInt();

        //Koruma
        if(n>0) {

            for (int i = 1; i < n; i++) {
                if (n % i == 0) top += i;
            }
            if (top == n)
                System.out.println(n + " Bir Mükemmel Sayıdır...");
            else
                System.out.println(n + " Bir Mükemmel Sayı Değildir...");
        }else{
            System.out.println("Geçersiz bir sayı girdiniz...");
        }
    }
}
