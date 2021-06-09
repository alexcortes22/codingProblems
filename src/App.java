import codingProblems.*;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int newNum = removingDuplicates.removeDuplicates(nums);

        System.out.println("The new length of the array: " + newNum);
    }
}
