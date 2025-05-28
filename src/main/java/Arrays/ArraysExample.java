package Arrays;

import java.util.*;

public class ArraysExample {

    public static void main(String[] args) {

        // 1. String to char array
        String str1 = "hello";
        char[] charArray = str1.toCharArray();
        System.out.println("1. String to char array: " + Arrays.toString(charArray));

        // 2. Char array to string
        String fromCharArray = new String(charArray);
        System.out.println("2. Char array to String: " + fromCharArray);

        // 3. String to string array (split)
        String sentence = "Java is awesome";
        String[] words = sentence.split(" ");
        System.out.println("3. String to String array: " + Arrays.toString(words));

        // 4. String array to single string
        String joined = String.join(" ", words);
        System.out.println("4. String array to single string: " + joined);

        // 5. Remove duplicates from string array
        String[] fruits = {"apple", "banana", "apple", "orange"};
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(fruits));
        String[] uniqueFruits = uniqueSet.toArray(new String[0]);
        System.out.println("5. Remove duplicates: " + Arrays.toString(uniqueFruits));

        // 6. Sort string array
        Arrays.sort(fruits);
        System.out.println("6. Sorted fruits: " + Arrays.toString(fruits));

        // 7. Reverse a string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("7. Reversed string: " + reversed);

        // 8. Frequency of characters in a string
        String input = "programming";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("8. Character frequency: " + freqMap);

        // 9. Anagram check
        String a = "listen", b = "silent";
        boolean areAnagrams = areAnagrams(a, b);
        System.out.println("9. Are Anagrams? " + areAnagrams);

        // 10. Palindrome check
        String palin = "madam";
        boolean isPalindrome = palin.contentEquals(new StringBuilder(palin).reverse());
        System.out.println("10. Is Palindrome? " + isPalindrome);

        // 11. Remove vowels
        String withVowels = "automation";
        String noVowels = withVowels.replaceAll("[aeiouAEIOU]", "");
        System.out.println("11. Removed vowels: " + noVowels);

        // 12. Count words in a sentence
        int wordCount = sentence.trim().split("\\s+").length;
        System.out.println("12. Word count: " + wordCount);

        // 13. Int array to string
        int[] numArray = {1, 2, 3};
        String numString = Arrays.toString(numArray).replaceAll("[\\[\\], ]", "");
        System.out.println("13. Int array to String: " + numString);

        // 14. String to int array
        String strNums = "1,2,3,4";
        int[] intArray = Arrays.stream(strNums.split(",")).mapToInt(Integer::parseInt).toArray();
        System.out.println("14. String to Int array: " + Arrays.toString(intArray));

        // 15. Find duplicate characters
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }
        System.out.println("15. Duplicate characters: " + duplicates);

        // 16. Convert List<String> to String[]
        List<String> list = Arrays.asList("one", "two", "three");
        String[] listToArray = list.toArray(new String[0]);
        System.out.println("16. List to Array: " + Arrays.toString(listToArray));

        // 17. Convert String[] to List<String>
        List<String> arrayToList = Arrays.asList(listToArray);
        System.out.println("17. Array to List: " + arrayToList);

        // 18. Sum and Average of int array
        int sum = Arrays.stream(intArray).sum();
        double avg = Arrays.stream(intArray).average().orElse(0);
        System.out.println("18. Sum: " + sum + ", Average: " + avg);

        // 19. Filter even numbers
        int[] evens = Arrays.stream(intArray).filter(n -> n % 2 == 0).toArray();
        System.out.println("19. Even numbers: " + Arrays.toString(evens));

        // 20. Reverse int array
        reverseArray(intArray);
        System.out.println("20. Reversed int array: " + Arrays.toString(intArray));

        // --- Extra Functionalities ---

        int[] numbers = {5, 3, 8, 1, 9, 2};
        System.out.println("\nExtra: Original int array: " + Arrays.toString(numbers));

        // Sort
        Arrays.sort(numbers);
        System.out.println("Sorted int array: " + Arrays.toString(numbers));

        // Binary search
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);

        // Copying array
        int[] copyArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copyArray));

        // Copying a range
        int[] partialCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Partial copy (index 1 to 3): " + Arrays.toString(partialCopy));

        // Fill array
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 7);
        System.out.println("Filled array: " + Arrays.toString(fillArray));

        // Compare arrays
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {3, 2, 1};
        System.out.println("a1 equals a2? " + Arrays.equals(a1, a2));
        System.out.println("a1 equals a3? " + Arrays.equals(a1, a3));

        // Max & Min
        int max = findMax(numbers);
        int min = findMin(numbers);
        System.out.println("Max: " + max + ", Min: " + min);
    }

    // Utility: Check if two strings are anagrams
    public static boolean areAnagrams(String a, String b) {
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    // Utility: Reverse an array
    public static void reverseArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    // Utility: Find max value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    // Utility: Find min value
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }
}
