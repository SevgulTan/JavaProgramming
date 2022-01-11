package day25_CustomMethods_Overloading;

public class SumofNumbers {
    public static void main(String[] args) {
        int sum = sumOf2Numbers(10,20);
        int sun2 = sumOf3Numbers(10,20,30);
    }

    public static int sumOf2Numbers(int num1,int num2){
        return num1+num2;
    }
    public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
}


/*
 1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers

 */