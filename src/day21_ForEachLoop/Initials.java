package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] names ={"Andriy Kovalchuk","Lirik Hasi","Madina Ramazanova","Muharrem Aydin","Olha Shesternyak"
        ,"Sevgul Tanriverdi","Oleksandr Pasichnyk","Serkan Guzelboylu","Furkan Tosun","Ozan Gillum","Ali Ismayilov"};

        for (String  each: names){
            String initials = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }
    }
}
