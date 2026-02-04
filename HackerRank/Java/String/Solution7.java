/* You are given several strings that represent regular expressions. For each one, determine whether its syntax is valid.
A regex is considered valid if it can be successfully compiled using Java’s Pattern.compile() method.

🔹 Input:
First line: an integer N (number of test cases)
Next N lines: each line is a regex pattern

🔹 Output: For each pattern, print:
Valid → if the regex syntax is correct
Invalid → if the regex syntax is incorrect

🔹 Example: Input
3
([A-Z])
[AZ[a-z](a-z)
batcatpat(nat

Output: 
Valid
Invalid
Invalid
*/

package Java.String;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());        // Read number of test cases or // Reads the first line (number of test cases) and converts it from String to int.

        while (testCases > 0) {                          // Starts a loop that runs once for each test case.
            String pattern = in.nextLine();         // Reads one line — this is the regex pattern to be checked.
            try {
                Pattern.compile(pattern);           // Attempts to compile the regex pattern.  //If successful → regex is Valid.  // If not → throws PatternSyntaxException.
                System.out.println("Valid");        // Prints Valid if the regex compiled successfully.
            } catch (PatternSyntaxException e) {        // Catches the exception if the regex syntax is wrong.
                System.out.println("Invalid");      // Prints Invalid if the regex has a syntax error.
            }
            testCases--;                                // Decreases the test case count to avoid an infinite loop.
        }
        in.close();
    }
}


//============================= 2nd method =============================
/* 
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String pattern = sc.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
*/