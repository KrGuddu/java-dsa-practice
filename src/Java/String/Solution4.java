package Java.String;

import java.util.Scanner;

public class Solution4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        String reversed = "";

        for (int i = A.length() - 1; i >= 0; i--) {
            reversed += A.charAt(i);
        }

        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
