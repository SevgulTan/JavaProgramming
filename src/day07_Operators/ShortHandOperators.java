package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

     // assignment :=

     int number = 100;
        System.out.println("number = " + number); //100

        String word ="Java Programming";
        System.out.println("word = " + word);//Java Programming

        word ="Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon

        String str ="Wooden";
        str += "Spoon";

        System.out.println("str = " + str);

        double num1 =2.5;
        System.out.println("num1 = " + num1);//2.5
        num1 +=5.5;
        System.out.println("num1 = " + num1);//8.0


        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);


        //withdrawing 500$
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$. then depositing 400$
        availableBalance -=200;
        availableBalance+= 400;
        System.out.println("availableBalance = " + availableBalance);

        double salary =50000.50;
        salary *= 2;
        System.out.println("salary = " + salary);


        System.out.println("_________________________");

        double num2 = 25000.0;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        System.out.println("_________________________");

        int amount =127; //cents
        int quarters = amount/25;
        int cents =amount % 25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        int cents2 =127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);











    }
}
