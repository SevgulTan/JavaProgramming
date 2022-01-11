package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String [] names ={"Andriy Kovalchuk","Lirik Hasi","Madina Ramazanova","Muharrem Aydin","Olha Shesternyak"
                ,"Sevgul Tanriverdi","Oleksandr Pasichnyk","Serkan Guzelboylu","Furkan Tosun","Ozan Gillum","Ali Ismayilov"};


        for (String each : names) {
            String reversed ="";

            for (int i =each.length()-1; i>=0; i--){
               reversed+= each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
