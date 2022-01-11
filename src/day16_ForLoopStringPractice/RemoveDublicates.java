package day16_ForLoopStringPractice;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "aabbaacc";//abc
        String result ="";

        for (int i =0; i<= str.length()-1; i++){
            String ch =""+str.charAt(i);//represent each Character

          if (!result.contains(ch)){ //karakteri içermiyorsa ekle!
              result += ch;
          }

        }
        System.out.println(result);



    }
}
/*
1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC
 */