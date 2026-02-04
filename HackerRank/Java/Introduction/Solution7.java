/* QUe. You are given q queries.
Each query has three integers: a, b, n.
For each query, you must print a series of n numbers: (a+2^0⋅b),(a+2^0⋅b+2^1⋅b),…,(a+2^0⋅b+2^1⋅b+⋯+2^(n−1)⋅b)
Each series must be printed on a single line, with numbers separated by spaces.  */

/* Working:
For each query:
1. Start with sum = a
2. For each term j from 0 to n-1:
    Add 2^j * b to sum
    Print the updated sum

In Simple Words: 1st.Start with a    // 2nd. Keep adding b multiplied by powers of 2     //3rd. Print each result on the same line. */

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        // Input reading
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();                            // number of queries

        // Loop for each query => Runs once for each query.
        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();                       // Read values of a, b, and n
            int b = scan.nextInt();
            int n = scan.nextInt();

            int sum = a;                                  // Initialize sum with a
            for (int j = 0; j < n; j++) {                 // Loop to calculate each term. or, Inner loop to generate the series
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");              // use print
            }
            System.out.println();                         // print new line after each query
        }

        scan.close();                                     // Close the scanner
    }
}
