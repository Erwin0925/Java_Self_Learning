// Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
// Sample Output:
//-----------------------------------------------------------------------------------//
// Divided by 3:                                                          
// 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
// , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
//-----------------------------------------------------------------------------------//                                                              
// Divided by 5:                                                          
// 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
// 95,                                                                    
//-----------------------------------------------------------------------------------//                                                                      
// Divided by 3 & 5:                                                      
// 15, 30, 45, 60, 75, 90,
//-----------------------------------------------------------------------------------//
import java.util.ArrayList;
import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div5 = new ArrayList<>();
        ArrayList<Integer> div3and5 = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("From 0 to what range ? :");
            int num1 = input.nextInt();

            for(int i=0; i<num1; i++){
                if(i%3==0 && i%5==0){
                    div3and5.add(i);
                }
                
                if(i%3==0){
                    div3.add(i);
                }

                if(i%5==0){
                    div5.add(i);
                }
            }

            System.out.println("Number that divisible by 3");
            System.out.println(div3);
            System.out.println("Number that divisible by 5");
            System.out.println(div5);
            System.out.println("Number that divisible by 3 and 5");
            System.out.println(div3and5);
            
        }catch(Exception e){
            System.out.println("Enter a valid input");   
        }



    }
}
