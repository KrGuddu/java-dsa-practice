/* Problem Statement: You are given several usernames. Write a regular expression that validates whether each username follows the company’s policy.
A username is valid if:
1. It has 8 to 30 characters.
2. It contains only:
    Letters (A–Z, a–z)
    Digits (0–9)
    Underscore (_)
3. The first character must be a letter.

For each username, print:
    Valid if it follows the rules.
    Invalid otherwise.

Input:- 
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Output:-
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid    
*/

package Java.String;
import java.util.Scanner;

class UsernameValidator {
    // Write regular expression here.
    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}

public class Solution9 {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
