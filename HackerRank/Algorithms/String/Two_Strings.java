/* # Problem Statement: Given two strings, determine if they share a common substring. A substring may be as small as one character.
# Example
s1 = "and", s2 = "art" → Output: YES (common substring: "a")
s1 = "be", s2 = "cat" → Output: NO

# Function Description: Complete the function twoStrings.
Parameters:
    string s1: first string
    string s2: second string
Returns:
    "YES" if they share a common substring
    "NO" otherwise

# Input Format:
First line: integer p (number of test cases)
Next p pairs of lines:
    • First line: string s1
    • Second line: string s2

# Constraints
1 ≤ p ≤ 10
Strings contain only lowercase English letters (a-z)

# Sample Input
2
hello
world
hi
world

# Sample Output
YES
NO
*/

package Algorithms.String;
import java.util.HashSet;
import java.util.Set;

public class Two_Strings {
     public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();

        // Add all characters of s1 to set
        for (char c : s1.toCharArray()) {
            set.add(c);
        }

        // Check if any character of s2 is in the set
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }
}
