package StringProblems;

import java.util.HashMap;

public class CharactersCountUsingCollection{
    
    public static void main(String[] args) {
        
        String input = "MADAM";
        HashMap<Character,Integer> frequencyMap = new HashMap<Character,Integer>();
        char[] inputArray = input.toCharArray();
        
        for (char x : inputArray ) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
        }
        
        for (char c : frequencyMap.keySet()){
            System.out.println(c+" "+frequencyMap.get(c));
        }

    }
}
