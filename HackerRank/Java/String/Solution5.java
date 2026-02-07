/* Check whether two given strings are anagrams of each other, ignoring case.
In simple words: 
• You are given two strings.
• You need to determine if they contain the same characters in the same frequency, regardless of uppercase or lowercase letters.
• If they are anagrams, print "Anagrams", otherwise print "Not Anagrams".

Example:Input:
anagram
margana

Output: Anagrams
*/

//===================== Method 1: agar editor me Array import krne ka option aa rha ho to ye best hai =====================
// 🔹 How it works:
// Converts both strings to lowercase.
// Checks if lengths are equal.
// Sorts both strings.
// Compares the sorted versions.
// Prints "Anagrams" or "Not Anagrams" accordingly.

package Java.String;
import java.util.Arrays;
// import java.util.Scanner;

public class Solution5 {
    static boolean isAnagram(String a, String b) {
        // Remove case sensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths differ, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        // System.out.println(isAnagram(a, b) ? "Anagrams": "Not Anagrams");                // use conditional statement or use if-else statement
        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        sc.close();
    }
    
}

//===================== Method 2: agar editor me Array import krne ka option na aa rha ho to =====================
// 🔹 How This Works:
// Convert both strings to lowercase.
// Create an array count[26] for each letter of the alphabet.
// Increment counts for letters in a.
// Decrement counts for letters in b.
// If all counts are 0 → they are anagrams.


/*
import java.util.Scanner;

public class Solution5 {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] count = new int[26]; // For 26 letters

        // Count letters in 'a'
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
        }

        // Subtract letters in 'b'
        for (int i = 0; i < b.length(); i++) {
            count[b.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}

*/


//====================================== Method 3: without sorting or counting, only replace and remove method ============================
// 🔹 Idea:
// Dono strings ko lowercase karlo.
// Ek string ke har character ko dusre string me remove karte jao.
// Agar last me dusri string empty ho gayi → Anagram hai.

// 🔹 How It Works:
// "Hello" and "hello" → convert to lowercase → "hello" and "hello".
// Loop through "hello", remove each char from "hello".
// After loop, "b" is empty → Anagram.

/* 
import java.util.Scanner;

public class Solution5 {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        // Check each character of 'a' in 'b'
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            int index = b.indexOf(ch);
            if (index == -1) {
                return false; // character not found in b
            }

            // Remove that character from b
            b = b.substring(0, index) + b.substring(index + 1);
        }

        // If we removed all characters, b should be empty
        return b.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}

*/