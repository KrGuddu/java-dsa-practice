//===================== Method 1: agar editor me Array import krne ka option aa rha ho to ye best hai =====================
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