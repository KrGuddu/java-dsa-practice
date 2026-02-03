package Java.String;
import java.util.Scanner;

public class Solution6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // Remove leading/trailing spaces
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split using regex: one or more non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
