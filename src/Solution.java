import java.util.*;
import java.io.*;


class Solution {
    public static void main(String[] argh) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();

                System.out.println(x + " can be fitted in:");


                //byte:  -128 and a maximum value of 127
                if (x >= -128 && x <= 127) System.out.println("* byte");

                //short: -32,768 and a maximum value of 32,76
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");

                //int:  -2^31 and a maximum value of 2^31-1.
                if (x >= -Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");

                //long : -2^63 and a maximum value of 2^63-1
                if (x >= -Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");


                //Complete the code

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}



