package day09_IfStatements;

public class EligibleForVote {
    public static void main(String[] args) {
        String name = "Ayse";
        int age = 15;
        String citizen = "USA";

        if (age>=18 && citizen== "USA"){
            System.out.println(name+" is eligible fot vote");
        } else{
            System.out.println(name+" is not eligible fot vote");
        }
    }
}
