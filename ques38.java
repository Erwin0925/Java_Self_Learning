// Write a Java recursive method to calculate the factorial of a given positive integer.
//-----------------------------------------------------------------------------------//

import java.util.Scanner;

public class ques38 {
    public int factorial(int num){
        if (num ==0){
            return 1;
        }
        return num * factorial(num-1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for factorial : ");
        int num = input.nextInt();

        ques38 obj1 = new ques38();
        int ans = obj1.factorial(num);
        System.out.print("The factorial for " + num + " is " + ans );
    }
}

