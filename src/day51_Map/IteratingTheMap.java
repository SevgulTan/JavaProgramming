package day51_Map;

import com.sun.tools.javac.Main;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String, Integer> students= new HashMap<>();
        students.put("Aygun",95);
        students.put("Maria",95);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",75);
        students.put("Serkan",70);
        students.put("Andriy",98);

        System.out.println(students);

        Map<String,Integer> earlyBirds = new HashMap<>();//score >=90
        Map<String, Integer> angryBirds= new HashMap<>();//score<90

        for (String key:students.keySet()){
            Integer value =students.get(key);
            if (value>=90){
                earlyBirds.put(key,value);
            }else{
                angryBirds.put(key, value);

            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("---------------------------------");

        //max score, minScore
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score>maxScore){
                maxScore=score;
            }
            if(score<minScore){
                minScore=score;
            }

        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("-------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // how many students has the score of 95 or greater

        int count=0;
        for (Integer eachScore : students.values()) {
            if (eachScore>=95){
                count++;
            }
        }
        System.out.println("The number of score>95 = " + count);

        System.out.println("-------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
          //  System.out.println(entry);
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }


        //remove all the students whose score less than 90

        for (String eachKey: students.keySet()){
            Integer eachValue = students.get(eachKey);
            if (eachValue<90){
                System.out.println(eachKey);
            }
        }
    }
}
