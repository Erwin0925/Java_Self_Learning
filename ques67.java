// Write a Java program to implement a lambda expression to check if a strings contains a specific letter.
//-----------------------------------------------------------------------------------//

import java.util.function.BiPredicate;

public class ques67 {
    public static void main(String[] args) {

        BiPredicate <String, Character> checkLetter = (str, letter) ->{
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == letter){
                    return true;
                }
            }
            return false;
        };

        String word = "john";

        System.out.println(checkLetter.test(word, 'e'));
        System.out.println(checkLetter.test(word, 'h'));
        
    }
    
}
