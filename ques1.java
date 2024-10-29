// Write a Java program to print 'Hello' on screen and your name on a separate line.
//-----------------------------------------------------------------------------------//
// Expected Output :
// Hello
// Alexandra Abramov
// ---------------------------------------------------------------------------------//

import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter your name :");
            String name = input.next();

            System.out.println("Hello \n" + name);
            
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid name.");
        }
    }   
}

