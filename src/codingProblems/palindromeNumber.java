package codingProblems;

public class palindromeNumber {
    public static boolean isPalindrome(int x){
        boolean result = true;
        //convert the number into a number array
        String temp = Integer.toString(x);
        char[] numbers = temp.toCharArray();
        for(char digit: numbers){
            System.out.println(digit);
        }

        //pointers to get each digit at the ends of the number
        int head = 0;
        int tail = numbers.length - 1;

        while(head < tail || head == tail){
           
            if(numbers[head] == (numbers[tail])){
                head++;
                tail--;
                result = true;
            }else{
                result = false;
                break;
            }
            
        }

        return result;

        // class Solution {
        //     public boolean isPalindrome(int x) {
        //          negative numbers are not it, neither are numbers that end in 0 
        //          since the other half would need to be 0 unless the number is 0
        //         if (x < 0 || (x % 10 == 0 && x != 0)) { 
        //             return false;
        //         }
                
        //         int revert = 0;
        //         while (x > revert) {
        //             revert = revert * 10 + x % 10;
        //             x /= 10;
        //         }
                
        //         return x == revert || x == revert/10;
        //     }
        // }
    }

}
