// Write a Java program to display the current date and time in their desire format.
//-----------------------------------------------------------------------------------//
// Sample Output:
// Now: 2017/06/16 08:52:03.066 
//-----------------------------------------------------------------------------------//

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class ques5_II {
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

        ques5_II que = new ques5_II();
        System.out.println(que.dateformat(choice));
        
    }

    private String dateformat(int datefm){

        HashMap<Integer,DateTimeFormatter> Dateformat = new HashMap<>();
        String datetime;

        Dateformat.put(1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Dateformat.put(2, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        Dateformat.put(3, DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        Dateformat.put(4, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = Dateformat.get(datefm);
        
        return dtf != null ? dt.format(dtf) : "Invalid option";
    }
}
