/* Problem Statement:- You are given:
• A string s
• Two integers start and end
So, Your task is to print the substring of s that starts at index start and ends at index end - 1 (end is not included).

Input: 
1. A string s
2. Two space-separated integers: start and end

Output: Print the substring from index start (inclusive) to end (exclusive).

Example: 
Input:
Helloworld
3 7

Output: lowo
*/

package Java.String;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Print substring from start (inclusive) to end (exclusive)
        System.out.println(s.substring(start, end));
        sc.close();
    }
}
