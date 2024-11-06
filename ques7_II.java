// Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;  

public class ques7_II {
       
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList <Integer> num = new ArrayList<>();

            System.out.print("Plese enter integer 1: ");
            num.add(input.nextInt());
            System.out.print("Plese enter integer 2: ");
            num.add(input.nextInt());
            System.out.print("Plese enter integer 3: ");
            num.add(input.nextInt());
            System.out.print("Plese enter integer 4: ");
            num.add(input.nextInt());

            Collections.sort(num, (a,b)->{
                if(a%2==0 && b%2!=0){
                    return 1;
                }else if (a%2!=0 && b%2==0){
                    return -1;
                }else{
                    return Integer.compare(a, b);
                }
            });

            for(int number : num){
                System.out.print(number + " ");
            }
        }catch(Exception e){
            System.out.println("Enter a valid input");   
        }
    }
        
}
