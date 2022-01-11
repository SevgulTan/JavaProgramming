package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {
    public static void main(String[] args) {

        byte a = 100;
        short b= a;

       // short b = a;
        // (short)a

        int c = b;
        // int c= (int)b

        long d= c;
        //( long) c

        float e=d;
        double f= e;

        int x=55;
        short y = (short)x; // explicit casting
        System.out.println(x+" : "+y);

        long j =1000000;
        short k =(short)j;
        System.out.println(j+" : "+k);


        double n=10.8;
        int s =(int)n; //10
        System.out.println(n+" : "+s);






    }

}
