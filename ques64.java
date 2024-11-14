// Write a Java program to implement a lambda expression to check if a given string is a palindrome.
//-----------------------------------------------------------------------------------//

import java.util.function.Predicate;

public class ques64 {
    public static void main(String[] args) {
        Predicate<String> checkPalindrome = str -> {
            str = str.toLowerCase();
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }; 

        System.out.println("Check Palindrome : " + checkPalindrome.test("John"));
        System.out.println("Check Palindrome : " + checkPalindrome.test("Level"));
    }
    
}
