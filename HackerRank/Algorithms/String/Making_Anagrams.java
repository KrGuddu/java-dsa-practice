/*# Problem Summary: Given two strings s1 and s2 (possibly different lengths), you can delete any characters from either string.
Your goal is to make both strings anagrams of each other with the minimum number of deletions.

# Key Idea: 
1. Count frequency of each character (a to z) in both strings.
2. For each character:
    Take the absolute difference between the two counts.
3. Sum all differences → that’s the total deletions needed.

# Example Walkthrough:
Input:
cde
abc

Frequency comparison:
Letter	 cde	 abc	Difference
a	      0      1	      1
b	      0      1	      1
c	      1    	 1        0
d	      1      0        1
e      	  1	     0	      1

➡ Total deletions = 4
*/

package Algorithms.String;

public class Making_Anagrams {
    public static int makingAnagrams(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Count characters in s2
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // Calculate deletions
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
            deletions += Math.abs(freq1[i] - freq2[i]);
        }

        return deletions;
    }
    
}
