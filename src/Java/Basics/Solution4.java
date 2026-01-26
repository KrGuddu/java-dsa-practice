/* Task: Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

/* How it works:
1. if (n % 2 != 0) → Checks if n is odd. Odd numbers are Weird.
2. else → Means n is even, so we check ranges:
    2 to 5 → Not Weird
    6 to 20 → Weird
    Greater than 20 → Not Weird
*/

import java.util.Scanner;

public class Solution4 {
    // private static final Scanner scanner = new Scanner(System.in);      //Ye ek single scanner object banata hai jo poori class me reuse ho sakta hai — especially Hackerrank jaise platforms pe ye default template hota hai. So isme aur Scanner scan = new Scanner(System.in); dono me se koe ek hi likhe.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if (n % 2 != 0) {
            // n is odd
            System.out.println("Weird");
        } else {
            // n is even
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
