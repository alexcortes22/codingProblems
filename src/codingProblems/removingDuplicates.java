package codingProblems;

public class removingDuplicates {
    public static int removeDuplicates(int[] nums){
        int tail = 0;
        for (int head = 0; head < nums.length; head++) {
            if(nums.length == 0)return 0;
            if (nums[head] != nums[tail]) {
                tail++;
                nums[tail] = nums[head];
            }
        }
        return tail + 1;
        //return unique;
    }
}
