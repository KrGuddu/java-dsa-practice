/* You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
'n can range between -100 to 100 inclusive.
Sample Input: 100
Sample Output: Good job   */

/* Summary: This program:-
1. Takes an integer input.
2. Converts it to a string.
3. Verifies the conversion.
4. Prints "Good job" if correct.
*/


//--------------------------------- For hackerrank soluiton ----------------------------------
// import java.util.*;
// import java.security.*;
// public class Solution11 {
//  public static void main(String[] args) {

//   DoNotTerminate.forbidExit();

//   try {
//    Scanner in = new Scanner(System.in);
//    int n = in .nextInt();
//    in.close();
//    //String s=???; Complete this line below

//    //Write your code here
//     String s = Integer.toString(n);          // 👈 Your code here        // Integer.toString(n) converts the integer to a string.
   
//    if (n == Integer.parseInt(s)) {                                       // Integer.parseInt(s) converts it back to an integer.
//     System.out.println("Good job");                                      // If both match → "Good job".
//    } else {
//     System.out.println("Wrong answer.");
//    }
//   } catch (DoNotTerminate.ExitTrappedException e) {
//    System.out.println("Unsuccessful Termination!!");
//   }
//  }
// }

// //The following class will prevent you from terminating the code using exit(0)!
// class DoNotTerminate {

//  public static class ExitTrappedException extends SecurityException {

//   private static final long serialVersionUID = 1;
//  }

//  public static void forbidExit() {
//   final SecurityManager securityManager = new SecurityManager() {
//    @Override
//    public void checkPermission(Permission permission) {
//     if (permission.getName().contains("exitVM")) {
//      throw new ExitTrappedException();
//     }
//    }
//   };
//   System.setSecurityManager(securityManager);
//  }
// }


//------------------------------------------ Simple method -----------------------------------
import java.util.*;

public class Solution11 {                                       // Defines a public class named Solution (required by HackerRank).
    public static void main(String[] args) {                    // The main method — program execution starts here.
        Scanner sc = new Scanner(System.in);                    // Creates a Scanner object to read input from the keyboard (standard input(stdin)).
        int n = sc.nextInt();                                   // Reads an integer input and stores it in variable n.
        sc.close();                                            // Closes the Scanner to prevent resource leaks.

        String s = Integer.toString(n);                         // Converts the integer n into a String and stores it in s.

        if (s.equals(String.valueOf(n))) {                     // Checks whether the converted string s is equal to the string form of n.
            System.out.println("Good job");                   // If they are equal, prints "Good job" to indicate successful conversion.
        } else {                                              // Otherwise, prints "Wrong answer".
            System.out.println("Wrong answer");
        }
    }                                                         // Closes the main method.
}                                                             // Closes the class.
