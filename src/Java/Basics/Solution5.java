/* You are given three lines of input:
1. An integer
2. A double
3. A string

You must print them in this exact format:
First line: String: <string>
Second line: Double: <double>
Third line: Int: <integer>
*/

// Purpose of the question: To test your understanding of Scanner input methods (nextInt(), nextDouble(), nextLine()) and how to handle input buffer issues.


import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();      // consume leftover newline. // consume leftover newline after nextInt() and nextDouble() to avoid skipping the next nextLine() [or, to clear the buffer before reading the string.]
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}