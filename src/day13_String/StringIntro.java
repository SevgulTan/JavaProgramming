package day13_String;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {

        Scanner scan;
         String name= "wooden spoon";
         String name2 ="wooden spoon";
         String name3 ="wooden spoon";
        String name4 ="wooden spoon";

        System.out.println(name== name2);//true
        System.out.println(name2== name3);
        System.out.println(name3== name4);

        System.out.println("------------------------------");

        String str1 = new String("wooden spoon");
        String str2 = new String("wooden spoon");
        String str3 = new String("wooden spoon");
        String str4 = new String("wooden spoon");

        System.out.println( str1== str2);
        System.out.println( str2 ==str3);
        System.out.println( str3== str4);

        System.out.println("--------------------------------------");

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = new String("java"); // yazılar farklı biri büyük harfla başlıyor. False
        System.out.println(s3.equals(s4));



    }
}
