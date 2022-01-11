package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number=100;
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber;

        if (evenNumber) {
            System.out.println("evenNumber = " + evenNumber);
        }
        System.out.println("--------------------------------------------");
        int n =200;
        //positive
        if (n>0){
            System.out.println(n+" is positive");
        }
        //negative
        if (n<0){
            System.out.println(n+" is negative");
        }

        if (n == 0){
            System.out.println(n+" is zero");
        }

    }
}
