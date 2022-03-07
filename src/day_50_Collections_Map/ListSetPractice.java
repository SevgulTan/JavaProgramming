package day_50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        List<Integer> list =new ArrayList<>(set);
        System.out.println(set);

     //   List<String > names =null;
     //   System.out.println(names.size());

        System.out.println("-------------------------------");

        //pop()
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        ((Stack)chars).pop();
        System.out.println("chars = " + chars);
        //poll()
        List<String> names2 = new LinkedList<>();
        names2.addAll(Arrays.asList("James","Jimmy","Kath","Breanna","Max"));
        System.out.println(names2);
        ((LinkedList<String>)names2).poll();
        System.out.println(names2);

        ((LinkedList<String>)names2).poll();
        System.out.println(names2);


    }
}
