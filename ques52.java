
import java.util.function.BinaryOperator;

// Write a Java program to implement a lambda expression to find the sum of two integers.
//-----------------------------------------------------------------------------------//

interface sumCalculator{
    public int sum(int a, int b);
    
}
// Main.java
public class ques52 {
    public static void main(String[] args) {

        sumCalculator sumCalculator = (a , b) -> a + b;
        int result = sumCalculator.sum(5, 7);
        System.out.println(result);
        

        BinaryOperator <Integer> sum = (num1, num2) -> num1 * num2;
        System.out.println(sum.apply(5, 6));

    }

}
