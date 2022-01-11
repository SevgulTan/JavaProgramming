package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word =" cydeo";
         char thirdChar = word.charAt(2);
        System.out.println("thirdchar ="+thirdChar);

        char tenthChar = word.charAt(4); // kelime uzunluğundan fazla olmamalı sayı
        System.out.println("tenthChar = " + tenthChar);

        System.out.println("-------------------------------------------------");


        String s1 ="Batch 25 is the best batch";
       int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char LastChar =s1.charAt( totalChars-1); //(s1.lenght()-1
        System.out.println("LastChar = " + LastChar);

        System.out.println("-------------------------------------------------");

        String str =" wooden spoon";
        str =str.toUpperCase(); //WOODEN SPOON
        System.out.println(str);

        String s ="JAVA";
        s = s.toLowerCase(Locale.ROOT);
        System.out.println("s = " + s);














    }

}
