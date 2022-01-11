package day10_Nestedİf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 6;

       String days = (n==1)?"Monday" :(n==2)?"Tuesday" :(n==3)? "Wednesday": (n==4)? "Thursday" : (n==5)? "Friday" : (n==6)?"sat"
        : (n==7)? "Sunday": "İnvalid";

        System.out.println(days);

    }

}
