/* Problem Statement:Write a class MyRegex that contains a regular expression string to validate IPv4 addresses.
An IP address is considered valid if:
• It is in the form: A.B.C.D
• Each part (A, B, C, D) is a number between 0 and 255
• Each part can have 1 to 3 digits
• Leading zeros are allowed

You are given strings, and your regex will be used to check whether each string is a valid IP address.

🔹 Example:- Input:
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Output:
true
true
true
false
false
false

💡 In short: Write a regex pattern that matches only valid IPv4 addresses.


🔹 Why this works:
25[0-5] → 250–255
2[0-4][0-9] → 200–249
1[0-9]{2} → 100–199
0?[0-9]{1,2} → 0–99 with optional leading zero (e.g., 0, 00, 09, 099)
((...)\\.){3} → first three octets with dots
Last group → final octet
^ and $ → match entire string only
*/

package Java.String;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
//Write your code here
class MyRegex {
    String pattern =
        "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})\\.){3}" +
        "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|0?[0-9]{1,2})$";
}
