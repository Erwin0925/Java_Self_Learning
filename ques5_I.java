// Write a Java program to display the current date and time in their desire format.
//-----------------------------------------------------------------------------------//
// Sample Output:
// Now: 2017/06/16 08:52:03.066 
//-----------------------------------------------------------------------------------//

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ques5_I{
    public static void main(String[] args) {
        System.out.println("Choose the date format:");
        System.out.println("1 - 2024-10-28");
        System.out.println("2 - 2024/10/28");
        System.out.println("3 - 28 October 2024");
        System.out.println("4 - 2024-10-28 15:42:07");
        System.out.println("--------------------------------");
        System.out.print("Please enter your choice (1-4): ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        ques5_I que = new ques5_I();
        System.out.println(que.dateformat(choice));
        
    }

    private String dateformat(int datefm){

        LocalDateTime dt = LocalDateTime.now();
        String datetime;

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        


        switch (datefm) {
            case 1:
                datetime = dt.format(dtf1);
                break;
            case 2:
                datetime = dt.format(dtf2);
                break;
            case 3:
                datetime = dt.format(dtf3);
                break;
            case 4:
                datetime = dt.format(dtf4);
                break;                
            default:
                datetime = "Invalid choice. Please select a valid option.";
                break;
        }
        return datetime;
    }
}
