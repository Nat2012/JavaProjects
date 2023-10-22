package datatype;

import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Algorithm {
    public static String reverseString(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }

    public static int countOccurrence(String word, char character) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
           char current = word.charAt(i);
           if (current == character){
               counter++;
           }
        }
        return counter;
    }

    public static String eliminateOccurrence(String word, char character) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current != character) {
                result.append(current);
            }
        }
        return result.toString();
    }

    public static String replaceOccurrence(String word, char character, char replacement){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current != character) {
                result.append(current);
            }
            else {
                result.append(replacement);
            }
        }
        return result.toString();
    }

    public static int amountInString(String word){
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if(result < word.charAt(i)) {
                result++;
            }
        }
        return result;
    }

    public static double currencyConverterFromNairaToEuro(long Naira){
        return Naira * 0.001_2;
    }

    public static double currencyConverter(String Choice1 , String Choice2 , long Amount) {
        if (Choice1.equals("Dollar")) {
            if (Choice2.equals("Pound")) {
                return Amount * 0.8;
            }
            if (Choice2.equals("Euro")) {
                return Amount * 0.9;
            }
        }
        if (Choice1.equals("Pound")) {
            if (Choice2.equals("Dollar")) {
                return Amount * 1.3;
            }
            if (Choice2.equals("Euro")) {
                return Amount * 1.2;
            }
        }
        if (Choice1.equals("Euro")) {
            if (Choice2.equals("Dollar")) {
                return Amount * 1.07;
            }
            if (Choice2.equals("Pound")) {
                return Amount * 0.9;
            }
        }
        return Amount;
    }

    public static String readUsername(int length) throws IOException {
        byte[] name = new byte[length];
        System.in.read(name, 0, length); // by default, from the console
        return new String(name);
    }

    public static String readUsername2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static String readUsername3() {
        Console console = System.console();

        return console == null ? "hi" :
                console.readLine("%s", "Enter your name: ");
    }

    public static long nowPlusOneHour() {
        return System.currentTimeMillis() + 3600 * 1000L;
    }

    public static String nowPrettyPrinted() {
        return new Date(System.currentTimeMillis()).toString();
    }

    public static void windowStateChanged(WindowEvent event) {
        if (event.equals(WindowEvent.WINDOW_DEACTIVATED)) {
            System.gc(); // if it ends up running, great!
        }
    }


    public static int vowelCounter(String input) {
        int vowel = 0;
        input.toCharArray();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
                vowel++;
            }
        }
        return vowel;
    }

    public static boolean palindromeChecker(String input){
      int left = 0;
      int right = input.length() - 1;
      while (left < right){
          if (input.charAt(left) != input.charAt(right)){
              return false;
          }
          right--;
          left++;
      }
      return true;
    }


    public static double kilometerToMiles(int kilometer){
        double miles = kilometer * 0.621371;
        return miles;
    }


    public static int simpleCalculator(int x, String operator, int y){
        int ans = 0;
        if (operator == "+"){
             ans = x + y;
            return ans;
        }
        if (operator == "-"){
             ans = x - y;
            return ans;
        }
        if (operator == "*"){
             ans = x * y;
            return ans;
        }
        if (operator == "/"){
             ans = x / y;
            return ans;
        }
        return ans;
    }

    public static int fahrenheitToCelsius (int fahrenheit){
        int celsius = (fahrenheit * 5/9) - 32;
        return celsius;
    }

    public static int amountPayedBack(int P, int R, int T){
        int simpleInterest = (P * R * T) / 100;
        int Amount = simpleInterest + P;
        return Amount;
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(reverseString(""));
//        System.out.println(countOccurrence("", ''));
//        System.out.println(eliminateOccurrence("", ''));
//        System.out.println(replaceOccurrence("", '', ''));
//        System.out.println(amountInString(""));
//        System.out.println(currencyConverterFromNairaToEuro());
//        System.out.println(currencyConverter("Dollar" , "Pound"  , ));
//        System.out.println(readUsername(5));
//        System.out.println(readUsername2());
//        System.out.println(readUsername3());
//        System.out.println(nowPlusOneHour());
//        System.out.println(nowPrettyPrinted());
//        WindowsEvent windowsEvent = new WindowsEvent();
//        System.out.println(windowStateChanged(windowsEvent.WINDOW_DEACTIVATED));
//        System.out.println(vowelCounter(""));
//        System.out.println(palindromeChecker(""));
//        System.out.println(kilometerToMiles(1));
//        System.out.println(simpleCalculator(1543, "/", 200));
//        System.out.println(fahrenheitToCelsius(10));
//        System.out.println(amountPayedBack(1000, 20, 2));
    }
}


