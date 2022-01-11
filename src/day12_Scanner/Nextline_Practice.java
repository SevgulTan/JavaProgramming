package day12_Scanner;

import java.util.Scanner;

public class Nextline_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt(); //19

        input.nextLine(); // bunu koymayınca ismi yazdırmıyor.

        System.out.println("Enter your full name");
        String fullname = input.nextLine();

        System.out.println("enter your gpa");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("enter your school name");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);

        input.close();
    }


}

/*
1. ask enter the age (nextInt)
2. ask the full name (nextLine)
 */