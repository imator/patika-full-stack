import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int k;
        int n1=0,n2=1,temp;
        System.out.print("Dizi eleman sayısı :");
        k = inp.nextInt();
        System.out.print("Fibonacci Dizisi: 0 1 ");
        for (int i = 1; i < k; i++) {
            temp = n2;
            n2= n2 + n1;
            n1 = temp;
            System.out.print(n2 + " ");
        }

    }
}
