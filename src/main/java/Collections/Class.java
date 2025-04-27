package Collections;

import java.util.HashMap;
import java.util.Map;

class Class {
    public static void main(String[] args) {
        String input = "Java is Great. Java is Object-Oriented. Java is powerful";
        Map<String, Integer> map = new HashMap<>();

        String[] array = input.split("[.\\-\\s]+");

        for (int i = 0; i < array.length; i++) {
            int count = 1; // Start from 1 for the current word
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    count++;
                    array[j] = ""; // Mark the word as empty once counted
                }
            }
            if (!array[i].equals("")) {
                map.put(array[i].toLowerCase(), count);
            }
        }

        // Now print only the words that occurred more than once
        System.out.println("Duplicate words are:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
