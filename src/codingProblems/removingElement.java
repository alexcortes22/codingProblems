package codingProblems;

public class removingElement {
    public static int removeElement(int[] nums, int val) {
        int size = nums.length;
        int head = 0;
        
        while(head < size){
            if(nums[head] == val){
                //if the value is at the head
                if(head == 0){
                    for (int j = 1; j < size; j++) {
                        // Shift each element one position to the left
                        nums[j - 1] = nums[j];
                    }
                    nums[size - 1] = 0;
                    size--;
                    head--;
                }else if(head != 0 && head != size){
                    for (int k = head + 1; k < size; k++) {
                        // Shift each element one position to the left
                        nums[k - 1] = nums[k];
                    }
                    nums[size - 1] = 0;
                    size--;
                    head--;
                }
                    //size--;
            }
            head++;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println("Element at index " + i + ": " + nums[i]);
        }
        return size;
    }

    // public static int removeElement(int[] nums, int val) {
    //     int i = 0;
    //     int n = nums.length;
    //     while (i < n) {
    //         if (nums[i] == val) {
    //             nums[i] = nums[n - 1];
    //             // reduce array size by one
    //             n--;
    //         } else {
    //             i++;
    //         }
    //     }
    //     return n;
    // }


    // int i = 0;
    // for (int j = 0; j < nums.length; j++) {
    //     if (nums[j] != val) {
    //         nums[i] = nums[j];
    //         i++;
    //     }
    // }
    // return i;

}
