package Extra;

public class LargestNumber {
    public static void main(String[] args) {
        int[] array = {99,108, 100, 102, 105};
        int largest = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        int temp = largest;
        System.out.println(+largest);
        while (temp > 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }
        System.out.println(+sum);
    }
}