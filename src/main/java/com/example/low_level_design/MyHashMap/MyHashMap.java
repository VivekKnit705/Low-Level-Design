package com.example.low_level_design.MyHashMap;

public class MyHashMap<K, V>{
    private int INITIAL_CPACITY=1<<4;
    private int MAXIMUM_CAPACITY=1<<30;

    ENTRY[] hashTable;

    public MyHashMap(){
        hashTable = new ENTRY[INITIAL_CPACITY];
    }

    public MyHashMap(int capacity){
        int cap=getTableCapacity(capacity);
        hashTable = new ENTRY[cap];

    }

    private int getTableCapacity(int capacity) {
        int n=capacity-1;
        n|=n>>>1;
        n|=n>>>2;
        n|=n>>>4;
        n|=n>>>8;
        n|=n>>>16;
        return (n<0)?1:(n>=MAXIMUM_CAPACITY?MAXIMUM_CAPACITY:n+1);
    }

    class ENTRY<K, V>{
        public K key;
        public V value;
        public ENTRY<K, V> next;

        public ENTRY(K key, V value){
            this.key=key;
            this.value=value;
        }
    }

    public void put(K key, V value){
        int hashCode=key.hashCode()%hashTable.length;
        ENTRY node=hashTable[hashCode];

        if(node==null){
            node=new ENTRY(key, value);
            hashTable[hashCode]=node;
        }else{
            ENTRY temp=node;
            while(temp!=null){
                if(temp.key.equals(key)){
                    temp.value=value;
                    return;
                }
                if(temp.next==null){
                    ENTRY newNode=new ENTRY(key, value);
                    temp.next=newNode;
                    return;
                }
                temp=temp.next;
            }
        }
    }

    public V get(K key){
        int hashCode=key.hashCode()%hashTable.length;
        ENTRY node=hashTable[hashCode];

        ENTRY temp=node;
        while(temp!=null){
            if(temp.key.equals(key)){
                return (V) temp.value;
            }
            temp=temp.next;
        }
        return null;
    }

    public static void main(String[] args){
        MyHashMap<Integer , String> map=new MyHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(4, "Four");

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
    }
}