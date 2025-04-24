//Find the Missing Number in an Array (1 to N)
//Array contains n-1 numbers in range 1 to n. Find the missing one.

package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
       int[] input  = {1,2,3,4,5,6,7,9};
        System.out.println(findMissingNumber(input)); ;
    }

    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

}
