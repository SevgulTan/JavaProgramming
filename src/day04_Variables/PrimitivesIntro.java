package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // age:38 years old
        byte age = 38;
        // weihgt:160 punds
        // byte weight =160 (Hata) is out of byte range.
        short weight = 160; // 160 is within the range of short.

        // salary : 100000
        // short salary = 100000; (Hata) is out of short range.
        int salary = 100000; // prefered data type for integer number.

        // int asset = 3_333_333-333;
        long asset = 3_333_333 - 333l;// long kullanacaksan sonuna L koymalısın.

        // tax: 0,26
        float tax = 0.26F;

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        System.out.println(yesNo);


    }

}
