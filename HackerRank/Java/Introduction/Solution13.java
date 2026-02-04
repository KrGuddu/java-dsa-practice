/* Problem Statement:
You are given a money amount (double value).
Your task is to format this amount into different countries’ currency formats using Java’s NumberFormat class.

You must print the amount formatted as:
1. US currency
2. Indian currency
3. Chinese currency
4. French currency

Each on a new line.
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // US Locale
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India Locale (custom)
        Locale indiaLocale = new Locale("en", "IN");            // We use this because Java does not provide a built-in Locale constant for India like it does for Locale.US, Locale.CHINA, or Locale.FRANCE.
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // China Locale
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France Locale
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}


//---------------------------------- 2nd Approach ----------------------------------
/*
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US); 
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }    
}

*/