/* # Problem Summary: 
• You are given a string s.
• If its length is odd, return -1 (cannot split equally).
• Otherwise:
    • Split s into two equal halves: s1 and s2.
    • Find the minimum number of characters to change in s1 to make s1 and s2 anagrams.

# Key Idea: Count character frequencies in both halves:
• For each character 'a' to 'z':
    • If freq1[i] > freq2[i], you need to change freq1[i] - freq2[i] characters.
• Sum all such positive differences → that’s the answer.

# Example Walkthrough
Input: aaabbb
• Split → "aaa" and "bbb"
• Need to change all 3 'a' to 'b'
• Output → 3

Input: abc
• Length is odd → -1
*/

package Algorithms.String;

public class Anagram {
    public static int anagram(String s) {
        int n = s.length();
        
        // If length is odd, not possible
        if (n % 2 != 0) {
            return -1;
        }
        
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2);
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // Count frequency of each character
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }
        
        // Count required changes
        int changes = 0;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > freq2[i]) {
                changes += freq1[i] - freq2[i];
            }
        }
        
        return changes;
    }
}
