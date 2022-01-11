package day16_ForLoopStringPractice;

import java.util.Scanner;

public class TaskMultiplication {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter 2  positive numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result =0;

        if (num1>=1 && num2>=1){
            for (int i =0; i<=(num1)-1; i++){
                result+=num2;

        }
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            System.out.println("result = " + result);

          }else{
            System.out.println("İnvalid Number");
            
        }


        
    }
}
