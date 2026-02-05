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
