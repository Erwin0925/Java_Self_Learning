// Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
//-----------------------------------------------------------------------------------//
public class ques44 {
    public static int getGcd(int num1, int num2){

        if (num2 == 0 ){
            return num1;
        }
        return getGcd(num2, num1%num2);
    }
    
    public static void main(String[] args) {
        System.out.println("The GCD will be : " + ques44.getGcd(48, 18));
    }
}
