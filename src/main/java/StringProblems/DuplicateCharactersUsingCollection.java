package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersUsingCollection {
    public static void main(String[] args) {
        String str = "collection";
        char [] arr = str.toCharArray();
        Map<Character,Integer>  map = new HashMap<Character,Integer>();
        int count = 1;
        for (int i=1; i< arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        // Print word counts
        for (char x: map.keySet()) {
            System.out.println("character: "  +x+ ", Count: " + map.get(x) );
        }
    }
}
