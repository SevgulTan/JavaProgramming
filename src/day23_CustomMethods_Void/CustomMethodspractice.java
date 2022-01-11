package day23_CustomMethods_Void;

public class CustomMethodspractice {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydo5Times();
        evenNumbers();
    }





    //create a function that can print hello world  5 times
    public static void helloWorld5Times (){
        for (int i =0; i<5;i++){
            System.out.println("Hello World");
        }

    }



    //create a function that can print hello Cydeo 5  times
    public static void helloCydo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }

    //create a function that can print all the even numbers between 1-10 ==>evenNumbers
    public static void evenNumbers(){
        for (int i =2; i< 11; i+=2) {
            System.out.println(i);
        }
    }

}
