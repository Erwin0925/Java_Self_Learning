// Static Nested Class and Static Methods:
// Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator. 
// The Calculator class should have a static method add(int a, int b) that returns the sum of a and b. 
// Call the add() method from the main method.
//-----------------------------------------------------------------------------------//
public class ques29 {
    public static void main(String[] args) {
        int sum = ques29MathUtil.Calculator.add(3, 3);
        System.out.println("total sum : " + sum);
    }   
}
