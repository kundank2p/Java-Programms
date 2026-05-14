// Find the Last Non-Repeating Element
// Return the last element that does not repeat.

package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeatingInteger {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 7, 8, 1, 3, 5, 9};

        System.out.println(lastNonRepeating(arr));
    }

    public static int lastNonRepeating(int[] arr) {

        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        // Store frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int lastNonRepeat = -1;

        // Find last element with frequency 1
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                lastNonRepeat = num;
            }
        }

        return lastNonRepeat;
    }
}
