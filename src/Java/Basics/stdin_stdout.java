/*
Task: In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format: There are  lines of input, and each line contains a single integer.
*/

/*
How it works:
1. Scanner scanner = new Scanner(System.in); – Reads input from standard input.
2. while (scanner.hasNextInt()) – Continues reading until no more integers are available.
3. scanner.nextInt() – Reads the next integer.
4. System.out.println(num); – Prints the integer on a new line.
*/

import java.util.Scanner;    // import java.util.*;

public class stdin_stdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            System.out.println(num);
        }
        scan.close();
    }
    
}
