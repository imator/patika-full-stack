import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, select;

        System.out.print("1. Number: ");
        num1 = input.nextInt();

        System.out.print("2. Number: ");
        num2 = input.nextInt();

        System.out.println("Please Select the Operation");
        System.out.println("1:Sum \n2:Sub\n3:Mul\n4:Div");
        System.out.print("Your Select: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.print("Result: " + (num1 / num2));
                } else {
                    System.out.print("Divide by Zero Error!");
                }
                break;
            default:
                System.out.println("Sorry, Invalid Selection :(");
        }

    }
}
