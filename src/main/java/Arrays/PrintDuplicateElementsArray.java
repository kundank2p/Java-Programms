package Arrays;

import java.util.HashSet;

public class PrintDuplicateElementsArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 4, 5, 2, 5, 2, 5, 6, 8, 90, 9, 0};

        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Unique elements in given array: " + uniqueElements);
        System.out.println("Duplicate elements in given array: " + duplicates);
    }
}
