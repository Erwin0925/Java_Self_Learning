
import java.util.function.UnaryOperator;

// Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
//-----------------------------------------------------------------------------------//

public class ques75 {

    public static boolean isPrime(int num){
        if(num<2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ( num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        UnaryOperator <Integer> getLargestPrimeFactor = num -> { 
            for (int i=(int)Math.sqrt(num); i > 2; i--) {
                if(num%i == 0 && isPrime(i)){
                    return i;
                }    
            }
            return isPrime(num) ? num : null;
        };

        System.out.println(getLargestPrimeFactor.apply(176));
        

    }
    
}
