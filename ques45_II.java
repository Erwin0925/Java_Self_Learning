// Write a Java recursive method to count the number of occurrences of a specific element in an array.
//-----------------------------------------------------------------------------------//

public class ques45_II {

    public static <T> int getOccurrences(T[] arr,T target){
        return getOccurrences(arr, target,0);
    }

    public static <T> int getOccurrences(T[] arr,T target, int index){

        if(index == arr.length){
            return 0;
        }

        int count = getOccurrences(arr, target, index+1);
        if (arr[index].equals(target)){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] num = {1, 2, 5, 5, 2, 3, 4, 5, 5, 5, 8, 7, 6, 4, 5, 5, 5, 4};
        System.out.println("Total occurrences : " + getOccurrences(num, 5));

        String[] str = {"apple", "apple", "banana", "apple","coconut"};
        System.out.println("Total occurrences : " + getOccurrences(str, "apple"));

        Character[] charArray = {'a', 'b', 'c', 'a', 'd', 'a'};
        System.out.println("Total occurrences : " + getOccurrences(charArray, 'a'));
    }
    
}
