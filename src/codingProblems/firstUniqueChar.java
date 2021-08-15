package codingProblems;

import java.util.HashMap;

class firstUniqChar {
    public int firstUniqChars(String s) {
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
}
