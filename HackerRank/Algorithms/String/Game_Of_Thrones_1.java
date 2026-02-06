/* # Problem Summary: 
You are given a string s.
You must check whether its characters can be rearranged to form a palindrome.

# Rule:
For a string to be rearranged into a palindrome:
    • At most one character can have an odd frequency.
    • All other characters must have even frequency.

# Example Walkthrough
Input: aaabbbb
    Frequencies:
        a → 3 (odd)
        b → 4 (even)
    Only 1 odd → ✔ Palindrome possible → YES

Input: cdefghmnopqrstuvw
All characters appear once → many odds → ❌ NO

Input: cdcdcdcdeeeef
Only one odd frequency → ✔ YES    

## Interview Tip: 
This problem checks:
    • Frequency counting
    • Understanding palindrome properties
    • Optimization using arrays or hash maps
*/

package Algorithms.String;

public class Game_Of_Thrones_1 {
    public static String gameOfThrones(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Count how many characters have odd frequency
        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // Palindrome possible if at most one odd frequency
        return (oddCount <= 1) ? "YES" : "NO";
    }
}
