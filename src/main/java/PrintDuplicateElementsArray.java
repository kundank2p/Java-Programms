import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateElementsArray {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {1,2,1,4,5,2,5,2,5,6,8,90,9,0};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(+arr[j] + " is a Duplicate Element ");
            }
        }
    }
}

//import java.util.HashSet;
//
//public class PrintDuplicateElementsArray {
//    public static void main(String[] args) {
//        // Initialize array
//        int[] arr = {1, 2, 1, 4, 5, 2, 5, 2, 5, 6, 8, 90, 9, 0};
//
//        // HashSet to store unique elements
//        HashSet<Integer> uniqueElements = new HashSet<>();
//        // HashSet to store duplicate elements
//        HashSet<Integer> duplicates = new HashSet<>();
//
//        // Iterate over the array
//        for (int num : arr) {
//            // If the element is already in uniqueElements, add to duplicates
//            if (!uniqueElements.add(num)) {
//                duplicates.add(num);
//            }
//        }
//
//        // Print the duplicate elements
//        System.out.println("Duplicate elements in given array: " + duplicates);
//    }
//}
