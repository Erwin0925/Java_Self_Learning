// Write a Java recursive method to reverse a given string.
//-----------------------------------------------------------------------------------//

public class ques43 {
    public static String reverse(String input){

        if(input.isEmpty() || input.length() == 1){
            return input;
        }

        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Reverse input : " + ques43.reverse("john"));
    }
}
