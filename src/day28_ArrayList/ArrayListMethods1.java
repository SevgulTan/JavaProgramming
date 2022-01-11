package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer > numbers = new ArrayList<>();
        numbers.add(10); //0 element ekledikten sonra //0
        numbers.add(20); //1 //0
        numbers.add(30); //2 //3
        numbers.add(40); //3 //4
        numbers.add(50); //4 //6
        numbers.add(60); //5 //7

        numbers.add(2,25);
        numbers.add(5,45);


        System.out.println(numbers);
        System.out.println(numbers.size());
        int lastindex =numbers.size()-1;
        System.out.println("lastindex = " + lastindex);
        int num =numbers.get(3);
        System.out.println("num="+num);

        System.out.println("--------------------------------------");

        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));


            System.out.println("--------------------------");
            ArrayList<String> list=new ArrayList<>();
            list.add("java");
            list.add("Phyton");
            list.add("java");
            list.add("C#");
            list.add("Ruby");

            list.set(2,"JavaScript");//replace
            list.set(3,"C++");
            System.out.println(list);

            System.out.println("------------------------------");



         }





    }
}
