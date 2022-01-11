package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
     //find the max number between 100&200
        int maxNumber = max(54,68);
        System.out.println(maxNumber);

     //multiply the max number by2
     int multiplication = maxNumber*2;
        System.out.println(multiplication);



    }
    public static int max (int a, int b){
        int result=0;
        if (a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }

}
