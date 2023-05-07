import java.util.Scanner;
public class BasamakSayilarinToplami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sayi,top=0;
        System.out.print("Basamkları Toplanacak Sayıları Giriniz: ");
        sayi = inp.nextInt();

        //1. Adım: a = 7328534382
        //2. Adım: b = 7328534382 % 10 =>2
        //3. Adım: top = top + b
        //4. Adım: c = a-b =>7328534380
        //5. Adım: d c/10 => 732853438
        //6. Adım: a = d;

        int a=sayi,b,c,d;
        while(a!=0){
            b = a%10;
            top += b;
            c = a - b;
            d = c/10;
            a = d;
        }
        System.out.println("Toplam: " + top);
    }
}
