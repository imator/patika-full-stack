import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();

        for (int k = n; k >= 1; k--) {

            for (int i = 0; i <= n-k+1; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(k-1)-1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

