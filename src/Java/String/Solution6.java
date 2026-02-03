/* Problem Statement: Given a string containing letters, spaces, and punctuation, split it into “tokens” where a token is defined as one or more consecutive English letters [A-Za-z].
You need to:
1. Ignore all non-letter characters (like spaces, ! , ? . _ ' @).
2. Count the number of tokens.
3. Print each token on a new line, in the order they appear in the string.

🔹 Input: A single string s containing letters, spaces, and punctuation.
Example input: He is a very very good boy, isn't he?

🔹 Output:
First line: number of tokens
Next lines: each token
Example output: 10   He   is   a   very    very    good    boy     isn     t      he          => This all in new line not in not line.

🔹 How it works:
1. s.trim() → Removes leading/trailing spaces.
2. s.split("[^A-Za-z]+") → Splits the string wherever there are one or more non-alphabetic characters.
    ^A-Za-z → anything not a letter.
    + → one or more consecutive non-letter characters.
3. tokens.length → number of tokens.
4. Loop → print each token on a new line.
*/

package Java.String;
import java.util.Scanner;

public class Solution6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // Remove leading/trailing spaces
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split using regex: one or more non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
