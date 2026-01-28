/* For each input number n, you must determine which of the following primitive integer types can store it:
Type	     Range
byte	    -128 to 127
short	    -32,768 to 32,767
int	        -2,147,483,648 to 2,147,483,647
long    	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
*/

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483648L && x <= 2147483647L)
                    System.out.println("* int");
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
