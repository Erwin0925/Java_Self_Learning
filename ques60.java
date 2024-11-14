
import java.util.function.Predicate;

// Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
//-----------------------------------------------------------------------------------//

public class ques60 {
    public static void main(String[] args) {
        Predicate<Integer> checkPrime = num ->{
            if (num <= 1) return false;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if(num%i == 0){
                    return false;
                }
            }
            return true;
        };

        int num = 7;
        System.out.println(checkPrime.test(num));
    }
}
