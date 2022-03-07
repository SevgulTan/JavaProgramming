package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        Map<Integer,String > hashMap =new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(30,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");

        System.out.println("hashMap = " + hashMap);

        Map<Integer,String> LinkedHashMap = new LinkedHashMap<>();
        LinkedHashMap.put(10,"Arthur");
        LinkedHashMap.put(20,"George");
        LinkedHashMap.put(30,"Jack");
        LinkedHashMap.put(40,"Emma");
        LinkedHashMap.put(5,"Isabella");

        System.out.println("LinkedHashMap = " + LinkedHashMap);

        Map<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");

        System.out.println("treeMap = " + treeMap);


        Map<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");

        System.out.println("hashtable = " + hashtable);


    }
}
