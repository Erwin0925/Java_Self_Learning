// Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
//-----------------------------------------------------------------------------------//

public class ques42 {
    public static int exponentiation(int base, int exponent){
        if (exponent == 0){
            return 1;
        }

        return base * exponentiation(base, exponent-1);


    }
    public static void main(String[] args) {

        System.out.println("Exponentiation : " + ques42.exponentiation(5, 3));
        
    }
}
