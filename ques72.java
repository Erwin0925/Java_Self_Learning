
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

// Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
//-----------------------------------------------------------------------------------//

public class ques72 {

    public static boolean isPrime(int num){
        if(num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {

        UnaryOperator <Integer> getPrimeSum = num ->{
            int sum = 0;
            for (int i = 2; i <= num; i++) {
                if (isPrime(i)){
                    sum += i;
                }
                
            }
            return sum;
        };
        System.out.println(getPrimeSum.apply(5));

        int startnum = 1;
        int endnum = 5;

        int sumofPrime = IntStream.rangeClosed(startnum, endnum).filter(num -> isPrime(num)).sum();
        System.out.println(sumofPrime);


    }
    
}
