package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String Str = "This is a input string for string input this is a string";
       Map<String,Integer> map = new  HashMap<String,Integer>();
       int count = 1;
       String[] array = Str.split(" ");

       //Enhanced for loop
        for (String s : array) {
            if (!map.containsKey(s)) {
                map.put(s, count);
            } else {
                map.put(s, (map.get(s) + 1));
            }
        }


           for (String x : map.keySet())
           {
               System.out.println("The count of the word  " +x+" is " +map.get(x));
           }
       }
    }


