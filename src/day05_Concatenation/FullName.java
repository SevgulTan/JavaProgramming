package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String name ="Sevgul";
        String lastname ="Tanriverdi";
        int age = 36;
        String jobTitle ="SDET";
        String companyname = "Apple1";
        double salary = 100000.58;

        String fullName =name+ " "+ lastname;

        // Full name of the person is ----------

        System.out.println(" Full name of the person is "+fullName);

        // -------- is ---------years old.
        System.out.println(fullName+" is "+age+" years old.");

        //Full name is jobTitle , works at Compaany name, and Fullname' salary is -------
        System.out.println(fullName+" is "+jobTitle+" works at "+companyname+", and "+fullName+"'s salary is "+salary);

    }
}
