// Write a Java program to reverse a word.
//-----------------------------------------------------------------------------------//
// Sample Output:
// Input a word: dsaf
// Reverse word: fasd
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class ques6_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Enter a word :");
        sb.append(input.next());


        String[] letter = sb.toString().split("");
        for (int i = 0; i < letter.length/2; i++) {
            
            String temp = letter[i];
            letter[i] = letter[letter.length-1-i];
            letter[letter.length-1-i] = temp;
        }

        String letter2 = String.join("",letter);
        System.out.print(letter2);

    }
    
}
