// Write a Java program to reverse a word.
//-----------------------------------------------------------------------------------//
// Sample Output:
// Input a word: dsaf
// Reverse word: fasd
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class ques6_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Enter a word :");
        sb.append(input.next());

        System.out.print(sb.reverse().toString());

    }
    
}
