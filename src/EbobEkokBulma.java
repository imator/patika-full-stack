import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1,n2,ebob=1,ekok,cnt=2;


        System.out.print("1. Sayı: ");
        n1 = inp.nextInt();

        System.out.print("2. Sayı: ");
        n2 = inp.nextInt();

        //EBOB Bulma
        while(true){
            //Ortak Bölen Bulma
            if(n1%cnt == 0 && n2%cnt== 0) ebob = cnt;
            cnt++;
            if(cnt>n1 || cnt>n2) break;
        }
        //EBOB SONUÇ
        if ((ebob != 1)) {
            System.out.println("EBOB: " + ebob);
        } else {
            System.out.println("EBOBU: 1 dir");
        }

        //EKOK Bulma
        if(ebob == 1) System.out.println("EKOK: " + n1*n2);
        else {
            ekok = n2*(n1/ebob);
            System.out.println("EKOK: " + ekok);

        }

    }
}
