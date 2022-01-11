package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int [] numbers = {10,32,65,45,12};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min>numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println(min);
    }
}
