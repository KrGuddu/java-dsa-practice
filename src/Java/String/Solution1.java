/* Problem Statement: You are given two strings A and B (only lowercase English letters).
You need to:
1. Print the sum of their lengths.
2. Check if string A is lexicographically greater than string B.
    If yes, print Yes
    Otherwise, print No
3. Capitalize the first letter of both strings and print them on one line separated by a space.

Input:- 
First line: String A
Second line: String B

Output:- 
Line 1: Sum of lengths of A and B
Line 2: Yes or No
Line 3: Capitalized A and B separated by a space
*/
package Java.String;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // 1. Sum of lengths
        System.out.println(A.length() + B.length());

        // 2. Lexicographical comparison                            // See in Notes.txt file
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");;
        } else {
            System.out.println("No");
        }
        
        // 3. Capitalize first letter of both strings
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

        sc.close();
    }
}
