package utilities;

import java.util.Arrays;

public class StringUtility {

  // prints each characters of the given string
    public static void printEachChar(String str){
        for(int i =0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }


    //Reverses the given string and returns the reversed string "Java"   "avaj"
    public static String reverse(String str){
        String result = "";
        for (int i =str.length()-1; i>=0; i--) {
          result+=str.charAt(i);
        }
        return result;
    }

    // Checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str){
       return  reverse(str).equalsIgnoreCase(str);
    }
    //checks if the given string is anagram, returns boolean
    public static boolean anagram(String str1, String str2){ //"acb","bca"
        char [] ch1= str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);



    }

    //removes the dublicates from given string, returns String.  "aaaabbbbcccc" ==>"abc"
    public static String removeDublicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each =str.charAt(i); // aaaabbbbbcccc

            if (result.contains(""+each)){
                result+=each;
            }
        }
        return result;
    }









}
