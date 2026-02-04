/* HackerRank Problem: The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
Hint: Java's Scanner.hasNext() method is helpful for this problem.
Input Format: Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
Output Format: For each line, print the line number, followed by a single space, and then the line content received as input.
*/
/* In Simple Word: Read input line by line from standard input until End Of File (EOF) is reached.
For each line, print: line_number <space> line_content
Input: Unknown number of lines. Each line contains a non-empty string. Input ends at EOF.
Output: For every line, print its line number (starting from 1), followed by a space, then the line itself.
*/

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineNumber = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        sc.close();
    }
}
