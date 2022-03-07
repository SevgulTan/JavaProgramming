package day51_Map;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {
    public static void main(String[] args) {
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[]group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String [] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

        //pair: Id & names of students

        Map<Integer, String[]> groups = new TreeMap<>();
        groups.put(1,group1);


    }
}
