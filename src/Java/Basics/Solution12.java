/* Problem Statement
You are given a date in the format month, day, year.
Your task is to determine the day of the week for that date.

Function to Complete: String findDay(int month, int day, int year)

Input:- A single line containing: MM DD YYYY
Output:- Return the day of the week in capital letters. 
ex: Input: 08 14 2017    =>  Output: MONDAY
*/

//-------------------------------------- Simple Java solution --------------------------------------
import java.util.Calendar;

public class Solution12 {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        
        // Months are 0-based in Calendar (Jan = 0)
        cal.set(year, month - 1, day);

        // Get the day of week
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Convert to string
        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
            "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[dayOfWeek - 1];
    }
}


//-------------------------------------- HackerRank based solution --------------------------------------
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

// class Result {

//     /*
//      * Complete the 'findDay' function below.
//      *
//      * The function is expected to return a STRING.
//      * The function accepts following parameters:
//      *  1. INTEGER month
//      *  2. INTEGER day
//      *  3. INTEGER year
//      */

//     public static String findDay(int month, int day, int year) {
//         Calendar cal = Calendar.getInstance();
    
//         // Months are 0-based in Calendar (Jan = 0)
//         cal.set(year, month - 1, day);

//         int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

//         String[] days = {
//         "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
//         "THURSDAY", "FRIDAY", "SATURDAY"
//         };

//         return days[dayOfWeek - 1];
//     }

// }

// public class Solution12 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//         int month = Integer.parseInt(firstMultipleInput[0]);

//         int day = Integer.parseInt(firstMultipleInput[1]);

//         int year = Integer.parseInt(firstMultipleInput[2]);

//         String res = Result.findDay(month, day, year);

//         bufferedWriter.write(res);
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }
