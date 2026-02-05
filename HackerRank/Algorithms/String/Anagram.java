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
