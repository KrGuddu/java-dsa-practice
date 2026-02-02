/* Problem Statement:- You are given:
• A string s
• An integer k

Your task is to:
1. Find all substrings of length k from the string s.
2. Among those substrings:
    • Find the lexicographically smallest substring.
    • Find the lexicographically largest substring.
3. Print the smallest substring on the first line and the largest substring on the second line.

Example:- Input:
welcometojava
3

Substrings of length 3: wel, elc, lco, com, ome, met, eto, toj, oja, jav, ava
Lexicographically smallest: ava
Lexicographically largest: wel

Output:
ava
wel
*/

package Java.String;
import java.util.Scanner;

public class Solution3 {
   public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

