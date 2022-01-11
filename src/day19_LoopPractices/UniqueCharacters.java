package day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str ="aabccdeef";
        String  result ="";


         char ch ='a';
         int count =0;// represent the frequency of the ch

         for (int i =0; i<str.length(); i++){
             char each =str.charAt(i);

             if (ch== each){
                 count++;
             }
         }

        System.out.println(count);

    }
}
/*
Write a program that can find the unique characters from a string without using
 index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the
            remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique


 */