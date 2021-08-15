package codingProblems;

import java.util.HashMap;
class firstUniqChar {
    /*
        Given a string, find the 1st non-repeating character in it and return its index. Return -1 if there
        is no unique character

        Time Complexity: O(n) where n is the length of the string. We iterate through the string two times. 
        Space Complexity: O(n) for the hashmap
    */
    public static int firstUniqChars(String s) {
        HashMap <Character, Integer> frequencies = new HashMap<>();
        int length = s.length();
        //iterate through string and add frequencies
        for(int i = 0; i < length; i++){
            char current = s.charAt(i);
            if(frequencies.get(current) == null){
                frequencies.put(current, 1);
            }else{
                frequencies.put(current, frequencies.get(current) + 1);
            }
        }
        
        //iterate through string again and find the first instance in map
        //where freq is 1
        for(int j = 0; j < length; j++){
            char current = s.charAt(j);
            if(frequencies.get(current) == 1){
                return j;
            }
        }
        
        return -1;
    }

    public static void main(String[] args){
        String test1 = "aaabbbcdeffg";
        String test2 = "abc";
        String test3 = "aabBBbbbbbc";
        String test4 = "aAAA"; 
        int result = firstUniqChars(test1);
        int result2 = firstUniqChars(test2);
        int result3 = firstUniqChars(test3);
        int result4 = firstUniqChars(test4); //testing upper and lower cases
        System.out.println(result);//should return 6
        System.out.println(result2);//should return 0
        System.out.println(result3);//should return 10
        System.out.println(result4);//should return 0
    }
}
