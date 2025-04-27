package Collections;

import java.util.*;

class MainC {
    public static void main(String[] args) {
        String input = "Java is Great. Java is Object-Oriented. Java rocks";

        Map<String, Integer> map = new HashMap<>();

        String words[] = input.split("[.\\-\\s]+");

        int count;

        for (int i = 0; i < words.length; i++){
            count = 1;
            for (int j = i+1; j < words.length; j++){
                if (words[i].equals(words[j]) && words[j ]!=""){
                    count ++;
                    map.put(words[i], count);
                    words[j]="";
                }
            }
        }
        System.out.println(map);

        // If you want to print only duplicates:
        System.out.println("Duplicate words are:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() +" : " +entry.getValue());
            }
        }
    }
}
