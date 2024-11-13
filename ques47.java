// Write a Java recursive method to find the length of a given string.
//-----------------------------------------------------------------------------------//

public class ques47 {
    public static int getLength(String str){
        if (str.isEmpty()){
            return 0;
        }
        return 1 + getLength(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("The length is : " + getLength("john is here"));
    }
    
}
