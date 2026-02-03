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
