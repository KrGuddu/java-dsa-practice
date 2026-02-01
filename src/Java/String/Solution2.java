package Java.String;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(s.substring(start, end));
        sc.close();
    }
}
