package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String Str = "This is a input string for string input this is a string";
       Map<String,Integer> map = new  HashMap<String,Integer>();
       int count = 1;
       String[] array = Str.split(" ");
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


