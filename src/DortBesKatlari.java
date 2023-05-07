import java.util.Scanner;
public class DortBesKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k,us4=1,us5=1;
        System.out.print("Bir sayı giriniz: ");
        k= inp.nextInt();
        do{
            us4 *= 4;
            if(us4>k) break;
            System.out.println(us4);


            us5 *= 5;
            if(us5>k) break;
            System.out.println(us5);

        }while(true);
    }
}
