/* In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/

/* Explanation:
    %-15s → Left-justifies the string in a field of 15 characters.
    %03d → Prints the integer in 3 digits, padding with leading zeros if needed.
    %n → New line.
*/

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");

        sc.close();
    }
}


/* Output: 
================================
java           100
cpp            065
python         050
================================
 */