package codingProblems;
import java.util.Arrays;


public class doubleSearch {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        boolean found = false;
        
        for(int i = 0; i < arr.length; i++){
            int doubleNum = arr[i] * 2;
            int result = binarySearch(arr, doubleNum, 0, arr.length - 1);
            
            if(result > 0){
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
