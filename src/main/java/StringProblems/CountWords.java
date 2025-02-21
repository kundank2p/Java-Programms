package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String Str = "This is a input string for string input this is a stringx";
       Map<String,Integer> map = new  HashMap<String,Integer>();
       int count = 1;
       String array [] = Str.split(" ");
       for (int i = 0; i<array.length; i++){
           if (!map.containsKey(array[i])) {
               map.put(array[i], count);
           }   else        {
              map.put(array[i], (map.get(array[i])+1));
           }
       }
           for (String x : map.keySet())
           {
               System.out.println("The count of the word  " +x+" is " +map.get(x));
           }
       }
    }





//public class CountWords {
//    public static void main(String[] args) {
//        String str = "This is a input string used for string input input input input this is a string input";
//
//        // Convert to lowercase for case insensitivity
//        str = str.toLowerCase();
//
//        // Use a HashMap to store word counts
//        Map<String, Integer> map = new HashMap<>();
//
//        // Split the string into words
//        String[] array = str.split("\\s+"); // Splitting based on whitespace
//
//        // Counting word occurrences
//        for (String word : array) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//
//        // Printing the results
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("The count of the word '" + entry.getKey() + "' is " + entry.getValue());
//        }
//    }
//}
