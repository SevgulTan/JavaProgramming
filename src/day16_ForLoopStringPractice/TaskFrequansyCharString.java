package day16_ForLoopStringPractice;

import java.util.Scanner;

public class TaskFrequansyCharString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String string =scan.nextLine();
        System.out.println("Enter a char");
        String ch= scan.next();
        int num =0;

        for (int i =0; i<string.length();i++){
            if (ch.charAt(0)==string.charAt(i)){
                num++;
                
            }
        }
        System.out.println(string);
        System.out.println(ch);
        System.out.println(num);

    }
}
 /*
 Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
  */