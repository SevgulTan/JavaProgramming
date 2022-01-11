package day10_Nestedİf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int number = 5;
        String result = "";

        if (number == 1) {
            result = "January";
        } else if (number == 2) {
            result = "February";
        } else if (number == 3) {
            result = "March";
        } else if (number == 4) {
            result = "April";
        } else if (number == 5) {
            result = "May";
        } else if (number == 6) {
            result = "June";
        } else if (number == 7) {
            result = "July";
        } else if (number == 8) {
            result = "August";
        } else if (number == 9) {
            result = "September";
        } else if (number == 10) {
            result = "October";
        } else if (number == 11) {
            result = "November";
        } else {
            result = "December";
        }

        System.out.println(result);

        System.out.println("--------------------------------------------------------");
        int n =11;

        String nov = "Nov";
        String months = (n==1)?"Jan" : (n==2)? "Feb": (n==3)?"March" : (n==4)? "April" : (n==5)? " May"
         : (n==6)? "June" : (n==7)? "July" : (n==8)? "August" : (n==9)? "Sep" : (n==10)? "Oct"
         : (n==11)? "November" : (n==12)? "Dec" : "İnvalid";

        System.out.println(months);

    }
}