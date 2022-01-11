package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {


        /*Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)

         */
        int lenght = 5; // int yerine double kullanabilirsin.
        int width = 4;
        int area = lenght*width;
        int perimeter = 2*(lenght+width);

        System.out.println("width = " + width);
        System.out.println("lenght = " + lenght);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
