import java.util.Scanner;

public class PalindromSayilar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Request the number
        int enteredNumber,tempNumber, inverseNumber = 0;
        System.out.print("Enter the number: ");
        enteredNumber = tempNumber = inp.nextInt();

        //invers the entered number
        while (tempNumber != 0) {
            inverseNumber = inverseNumber * 10 + tempNumber % 10;
            tempNumber /= 10;
        }

        //Check Palindrom
        if(enteredNumber == inverseNumber) System.out.println("Bu bir Palindrom Sayıdır...");
        else System.out.println("Bu bir Palindrom Sayı DEğİLDİR...");

    }
}


