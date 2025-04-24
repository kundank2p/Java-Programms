//Find the First Non-Repeating Element
//Return the first element that does not repeat.

package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingInteger {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7,8,1,3, 9};
        System.out.println(firstNonRepeating(arr));
    }
    public static int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1; // if no unique element
    }

}
