import java.util.Scanner;
public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int s1,s2,s3,temp;
        System.out.print("1. Sayı: ");
        s1 = inp.nextInt();
        System.out.print("2. Sayı: ");
        s2 = inp.nextInt();
        System.out.print("3. Sayı: ");
        s3 = inp.nextInt();

        if(s1>s2) {
            temp = s2;
            s2 = s1;
            s1 = temp;
        }


        if(s1>s3) {
            temp = s3;
            s3 = s1;
            s1 = temp;
        }

        if(s2>s3) {
            temp = s2;
            s2 = s3;
            s3 = temp;
        }
        System.out.println(s1 + " " + s2 + " " + s3);
    }
}
