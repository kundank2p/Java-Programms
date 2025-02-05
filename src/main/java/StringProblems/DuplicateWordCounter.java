package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordCounter {

    public static void main(String[] args) {
        String input = "This is a input string Input string this";
        Map<String, Integer> map = new HashMap<>();

        String[] arr = input.toLowerCase().split(" ");  // Convert to lowercase and split by spaces

        for (String word : arr) {
            map.put(word, map.getOrDefault(word,0) + 1);// Use getOrDefault to simplify logic
        }

        // Print word counts
        for (String x: map.keySet()) {
            System.out.println("Word: "  +x+ ", Count: " + map.get(x) );
        }
    }
}
