// Write a Java recursive method to generate all possible permutations of a given string. (HARD)
//-----------------------------------------------------------------------------------//

public class ques48 {

    public static void generatePermutations(String str){
        generatePermutations(str.toCharArray(), 0);
    }

    public static void generatePermutations(char[] arr, int index){

        if (index == arr.length-1){
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int i = index ; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index+1);
            swap(arr, index, i); //swap back to original position
        }    
    }

    public static void swap(char[]arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        generatePermutations("ABCDEFG");
    }
    
}
