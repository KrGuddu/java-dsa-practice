/* Problem Statement: You are given a string A consisting of lowercase English letters.
Your task is to:
• Check whether the string is a palindrome.
• If it is a palindrome, print "Yes".
• Otherwise, print "No".

Example:- Input: madam
          Output: Yes
*/

package Java.String;

import java.util.Scanner;

public class Solution4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        String reversed = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            reversed += A.charAt(i);
        }

        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
