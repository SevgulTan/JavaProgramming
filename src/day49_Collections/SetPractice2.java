package day49_Collections;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {
        String[] arr ={"Wooden Spoon","Book","Pen","Phone","Wooden Spoon",
        "Wooden Spoon","Wooden Spoon","Wooden Spoon","Milk","Eggs","Coke","Paper towels"};

        arr= new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
       /*

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr =set1.toArray(new String[0]);

        System.out.println(set1);

        */
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,20,30,40,30,20,10));
        list =new ArrayList<>(new LinkedHashSet<>(list)) ;
        System.out.println(list);

        System.out.println("----------------------------------------");
        String [] array ={"A","A","B","C"};
        Set<String> s =new LinkedHashSet<>();

        s.addAll(Arrays.asList("E","F","G"));
        System.out.println("----------------------------");

        String str ="eeeeeaaaabbbbcccddddeeeee";
        //eabcd
        //544345
        String result ="";//e5a4b4c3d4e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result += each+ Collections.frequency(Arrays.asList(str.split("")),each);
        }
        System.out.println(result);



    }

}
