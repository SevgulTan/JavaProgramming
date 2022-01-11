package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        //123 enter
       Scanner input = new Scanner(System.in) ;
        System.out.println("Enter your full name: ");
        String fullname = input.nextLine();

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine(); //Enter ( bunu koymayınca okul ismini yazmaya izin vermiyor.)

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();



        System.out.println("Fullname = " + fullname);
        System.out.println("Programming = " + programming);
        System.out.println("Age = " + age);
        System.out.println("SchoolName = " + schoolName);

        input.close();



    }
}
