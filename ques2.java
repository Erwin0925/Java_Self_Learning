// Write a Java program to print the sum of two numbers.
//-----------------------------------------------------------------------------------//
// Test Data:
// 74 + 36
// Expected Output :
// 110
//-----------------------------------------------------------------------------------//


import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print( "Enter First Number :");
            int num1 = input.nextInt();
            System.out.print("Enter Second Number :");
            int num2 = input.nextInt();
            
            System.out.println("The Sum is " + (num1+num2));
        } catch(Exception e){
            System.out.println("Enter a valid Number");

        }

    }
}
