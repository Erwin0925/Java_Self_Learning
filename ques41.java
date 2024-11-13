// Write a Java recursive method to check if a given string is a palindrome.
// Palindrome :  word, phrase, number, or any sequence of characters that reads the same backward as forward. 
//            :  madam", "racecar", "level", "radar"
//-----------------------------------------------------------------------------------//
public class ques41 {

    public static boolean isPalindrome(String input){

        if (input.length() <= 1 ){
            return true;
        }

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length()-1);

        if (firstChar != lastChar){
            return false;
        }

        String remainchar = input.substring(1,input.length()-1);
        return isPalindrome(remainchar);
    }

    public static boolean isPalindrome2(String input){
        if(input.length() == 1){
            return true;
        }

        for (int i = 0; i < input.length()/2; i++) {
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                return false;

            }  
        }
        return true;
    }

    public static boolean isPalindrome3(String input){
        String reverse = new StringBuilder(input).reverse().toString();

        return input.equals(reverse);
    }

    public static boolean isPalindrome4(String input){
        int left = 0;
        int right = input.length()-1;

        while(left < right){
            if (input.charAt(left) != input.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ques41.isPalindrome("level"));  
        System.out.println(ques41.isPalindrome("johnj")); 

        System.out.println(ques41.isPalindrome2("level"));  
        System.out.println(ques41.isPalindrome2("johnj"));

        System.out.println(ques41.isPalindrome3("level")); 
        System.out.println(ques41.isPalindrome3("johnj"));  

        System.out.println(ques41.isPalindrome4("level")); 
        System.out.println(ques41.isPalindrome4("johnj"));  
    }
    
}
