// Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;  

public class ques7_I {
       
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList <Integer> num = new ArrayList<>();

            System.out.println("Plese enter integer 1:");
            num.add(input.nextInt());
            System.out.println("Plese enter integer 2:");
            num.add(input.nextInt());
            System.out.println("Plese enter integer 3:");
            num.add(input.nextInt());
            System.out.println("Plese enter integer 4:");
            num.add(input.nextInt());

            ArrayList <Integer> even = new ArrayList<>();
            ArrayList <Integer> odd = new ArrayList<>();

            for (int i = 0; i < num.size(); i++) {
               if(num.get(i)%2==0){
                    even.add(num.get(i));
                }else{
                    odd.add(num.get(i));
                }
            }
            Collections.sort(even);
            even.sort(Comparator.naturalOrder());
            odd.sort(Comparator.naturalOrder());
            num.clear();
            num.addAll(odd);
            num.addAll(even);

            for(int number : num){
                System.out.print(number + " ");
            }
        }catch(Exception e){
            System.out.println("Enter a valid input");   
        }
    }
        
}
