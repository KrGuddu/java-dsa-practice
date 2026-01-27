/* You are given an integer N.
You must print the first 10 multiples of N. Each line should be in this format:
N x i = result   => where i goes from 1 to 10.
*/

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }

}


// 2nd Method using while loop
// import java.util.Scanner;

// public class Solution6 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         scan.close();

//         int i = 1;
//         while (i <= 10) {
//             System.out.println(N + " x " + i + " = " + (N * i));
//             i++;
//         }
//     }
// }


// 3rd Method using BufferedReader
// import java.io.*;

// public class Solution6 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//         int N = Integer.parseInt(bufferedReader.readLine().trim());

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(N + " x " + i + " = " + (N * i));
//         }

//         bufferedReader.close();
//     }
// }