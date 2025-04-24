//Maximum Product of Two Integers in an Array
//Find two numbers whose product is maximum.

package Arrays;

public class MaxProduct {

    public static int maxProduct(int[] numbers) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2, min1 * min2);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 20, 7, 8};
        int result = maxProduct(numbers);
        System.out.println("Maximum product of two integers is: " + result);
    }
}

