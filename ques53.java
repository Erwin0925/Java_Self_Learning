
import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to check if a given string is empty.
//-----------------------------------------------------------------------------------//

interface stringChecker{
    boolean checkString(String str);
}
public class ques53 {

    public static void main(String[] args) {

        stringChecker sc = (str) -> str.isEmpty();
        System.out.println("Is empty ? " + sc.checkString("abc"));
        System.out.println("Is empty ? " + sc.checkString(""));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Is empty ? " + isEmpty.test("abc"));
        System.out.println("Is empty ? " + isEmpty.test(""));

    }
}
    
