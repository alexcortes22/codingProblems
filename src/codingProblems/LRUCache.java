package codingProblems;

import java.util.HashMap;

class LRUCache{
    //Properties
    //This HashMap maps a priority to the key in the cache
    HashMap <Integer, Integer> priorities = new HashMap <Integer, Integer>();
    Pair[] cache;
    int size;
    int head = -1;
    int tail = -1;
    int recentCounter;

    public LRUCache(int capacity){
        this.size = capacity;
        cache = new Pair[size];
        recentCounter = 0;
    }

    public int get(int key){
       
    }

    public void put(int key, int value){
        //check if the pair is in the array O(1)
        if(priorities.containsValue(key)){
            
        }
    }

    static class Pair {
        int key;
        int value;

        public Pair(int key, int value){
            this.key = key;
            this.value = value;
        } 
        
        public void setKey(int newKey){
            this.key = newKey;
        }

        public void setValue(int newValue){
            this.value = newValue;
        }

        public int getKey(){
            return this.key;
        }

        public int getValue(){
            return this.value;
        }
    } 
}

