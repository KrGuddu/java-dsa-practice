/* Problem Summary: You are given a string s written in CamelCase format.
CamelCase rules:
    The first word is all lowercase.
    Each new word starts with an uppercase letter, followed by lowercase letters.
    Words are concatenated without spaces.
-> Your task is to count how many words are present in the string.

✅ Example:- Input: saveChangesInTheEditor
Output: 5

Words are:
save
Changes
In
The
Editor

💡 Logic: The number of words = 1 + number of uppercase letters in the string.
*/

package Algorithms.String;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(camelcase(s));
        sc.close();
    }

    // this is the main logic function
    public static int camelcase(String s) {
        int count = 1;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
