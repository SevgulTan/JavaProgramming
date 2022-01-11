package day34GarbageCollection_AccessModifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import day31_Constructors.Student;
import day33_Statics.Iphone;
import day30Custom_Class.Dog;


public class GarbageCollection {
    public static void main(String[] args) {

   /*
        String str =null;
        System.out.println(str.toUpperCase());

   */

        String str ="Wooden Spoon";  //not eligible for garbage collection
             str= null;

        System.out.println(str);

        System.out.println("----------------------------------------------");

        Dog dog1 = new Dog(); // eligible for garbage collection
        dog1.name ="Lucy";


        dog1= new Dog();// eligible for garbage collection
        dog1.name ="Max";
        System.out.println(dog1);

        String language="Pyhton";
        language="Java";

        System.out.println(language);

        System.out.println("------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1==list2);

        System.out.println("-------------------------------------");

        Student student1 = new Student("Tahir",30,'M','B',14);
         student1.grade ='A';

         Student student2= student1;
         student2.name ="Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("----------------------------------");
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2 = l1;
        l2.add("Pyhton");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

    }
}
