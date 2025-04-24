//Find All Pairs with Given Sum
//Return all unique pairs whose sum is a target.
package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPairs {
    public static List<int[]> findPairs(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> pairs = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                int small = Math.min(num, complement);
                int large = Math.max(num, complement);
                String pair = small + "," + large;
                if (!pairs.contains(pair)) {
                    result.add(new int[]{small, large});
                    pairs.add(pair);
                }
            }
            seen.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0, 2, 3, 5, 6, 3, 5, 6, 1, 4};
        int target = 6;
        List<int[]> pairs = findPairs(array, target);

        for (int[] pair : pairs) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
}
