package codingProblems;
import java.util.Arrays;
import java.util.HashMap;


public class doubleSearch {
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> doubleNumbers = new HashMap<Integer, Integer>(arr.length);
        Arrays.sort(arr);
        boolean found = false;

        //O(n)
        for(int number : arr){
           if(doubleNumbers.get(number) == null){
               doubleNumbers.put(number, 1);
           }else{
               doubleNumbers.put(number, doubleNumbers.get(number) + 1);
           }
        }

        //O(n)
        for(int i = 0; i < arr.length; i++){
            int doubleNum = arr[i] * 2;
            int result = binarySearch(arr, doubleNum, 0, arr.length - 1);
            
            if(result >= 0 && doubleNumbers.get(doubleNum) == 1){
                found = true;
                break;
            }
        }

        return found;
    }

    public static int binarySearch(int[] arr, int target, int lowerIndex, int upperIndex){
        //calculate the middle of the search parameter by adding the difference between the upper and 
        //index to the lower index.
        int middle = (lowerIndex + upperIndex) / 2;

        if(upperIndex >= lowerIndex){
            if (arr[middle] == target){
                return middle;
            }
    
            if (target < arr[middle]){
                return binarySearch(arr, target, lowerIndex, middle - 1);
            }
    
            if (target > arr[middle]){
                return binarySearch(arr, target, middle + 1, arr.length - 1);
            }
        }
        
        return -1;    
    
    }
}
