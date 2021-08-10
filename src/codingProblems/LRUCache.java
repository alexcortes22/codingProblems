package codingProblems;

import java.util.HashMap;

class LRUCache{
    HashMap<Integer, Node> cache = new HashMap<Integer, Node>();
    Node head, tail;
    int size;
    int capacity;

    class Node{
        int key;
        int value;
        Node next;
        Node prev;
    }

    private void addNode(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node){
        Node previous = node.prev;
        Node next = node.next;
        previous.next = next;
        next.prev = previous;
    }

    private void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }

    private Node removeTail(){
        Node res = tail.prev;
        removeNode(res);
        return res;
    }

    public LRUCache(int capacity){
        this.size = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
    }

    public int get(int key){
       Node result = cache.get(key);
       if(result == null){
           return -1;
       }
       return result.value;
    }

    public void put(int key, int value){
        Node result = cache.get(key);
        if(result == null){
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            addNode(newNode);
            size++;

            if(size > capacity){
                Node tail = removeTail();
                cache.remove(tail.key);
                --size;
            }
        }else{
            result.value = value;
            moveToHead(result);
        }
    }

}

