public class MissingNumber {
    public static void main(String[] args) {
        int total = 9; // Total number of elements expected (1 to 9)
        int[] numbers = new int[]{1, 2, 3, 8, 9, 7, 4, 6}; // Missing 5 in this case

        // Calculate the expected sum of numbers from 1 to total
        int expected_sum = total * (total + 1) / 2;

        // Calculate the sum of numbers in the array
        int actual_sum = 0;
        for (int num : numbers) {
            actual_sum += num;
        }

        // Missing number is the difference between the expected and actual sums
        int missingNumber = expected_sum - actual_sum;
        System.out.println("Missing Number: " + missingNumber);
    }
}
