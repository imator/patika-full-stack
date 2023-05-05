import java.util.Scanner;
public class DaireDilimAlanHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r,alfa;
        double alan,pi=3.14;

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Alanı bulunacak dilim açısını girinz: ");
        alfa = input.nextInt();

        alan = ((pi*r*r)*alfa)/360.0;
        System.out.print("Girdiğiniz yarı çap ve dilime göre alan: " + alan);
    }
}
