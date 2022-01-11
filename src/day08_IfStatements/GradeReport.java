package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
     /*   System.out.println(true == !false); //true
        System.out.println(!true != false); //false
        System.out.println(!false == true); //true

        System.out.println(!!false); //false
        System.out.println(!!! true); // false

      */

   int score =95; //0~100 score 0 le 100 arası olacak

    boolean a =score>= 90 && score <=100;
    boolean b = score>=80 && score <=89; // score>=80 && !a; (diğer yolu)
    boolean c = score >= 70 && score <= 79; // boolean c = score>= 70 && !a &&!b;
    boolean d = score >=60 && score <= 69;
    boolean f = score >= 0 && score <=59; // boolean f = !a && !b && !c && !d;

       if (a){
           System.out.println("Excelent");
       }

        if (b){
        System.out.println("Great");
        }

        if (c) {
            System.out.println("Good");
        }

        if (d) {
            System.out.println("Passed");
        }
        if (f) {
            System.out.println(" Failed");
        }






    }
}
/*
90~100 ==> Excellent
80~89  ==> Great
70~79  ==> Good
60~69  ==> Passed
0~59  ==> Failed
 */