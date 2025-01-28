package StringProblems;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesByCollection {
    public static void main(String[] args) {
        String input = "testing is important testing";
        String[] words = input.split(" ");
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        String output = String.join(" ", uniqueWords);
        System.out.println(output);
    }
}
