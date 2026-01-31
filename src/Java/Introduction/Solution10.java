/* You are given a class Solution with a main method.
Complete the code so that it outputs the area of a parallelogram with breadth B and height H using a static initialization block.

Input Format:
First line: integer B (breadth)
Second line: integer H (height)

Output Format:
If B > 0 and H > 0, print the area: B * H
         Otherwise, print: java.lang.Exception: Breadth and height must be positive
*/

import java.util.Scanner;

public class Solution10 {

    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();         // recommended to not close the Scanner, so you can leave this line   // “I avoid closing Scanner on System.in because it closes the standard input stream, which may affect further input operations.”
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}

//---------------------- 2nd Version ----------------------
// import java.util.Scanner;

// public class Solution10 {

//     static int B;
//     static int H;
//     static boolean flag = true;

//     static {
//         Scanner sc = new Scanner(System.in);
//         B = sc.nextInt();
//         H = sc.nextInt();

//         if (B <= 0 || H <= 0) {
//             flag = false;
//             System.out.println("java.lang.Exception: Breadth and height must be positive");
//         }
//         // Not closing sc intentionally to avoid closing System.in
//     }

//     public static void main(String[] args) {
//         if (flag) {
//             System.out.println(B * H);
//         }
//     }
// }


// ---------------------- Or ----------------------
// import java.util.Scanner;

// public class Solution10 {
//     static int B;
//     static int H;
//     static boolean flag = true;

//     static {
//         Scanner sc = new Scanner(System.in);
//         B = sc.nextInt();
//         H = sc.nextInt();

//         if (B <= 0 || H <= 0) {
//             flag = false;
//             System.out.println("java.lang.Exception: Breadth and height must be positive");
//         }
//     }

//     public static void main(String[] args) {
//         if (flag) {
//             int area = B * H;
//             System.out.println(area);
//         }
//     }
// }
