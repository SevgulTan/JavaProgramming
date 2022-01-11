package day34GarbageCollection_AccessModifier;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public Circle(double radius){
        this.radius = radius;
      //  pi=3.14; do not use this way
    }
    static {
        pi=3.14;
        name="Circle";

    }




}
