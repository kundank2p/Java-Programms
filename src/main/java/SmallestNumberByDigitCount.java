import java.util.Scanner;

public class SmallestNumberByDigitCount {

    public static void main(String[] args) {

        int input =355 ;
        int result = 1;

        int digits = String.valueOf(input).length();

        if (digits == 1) {
            result = 0;
        } else {
            for (int i = 1; i < digits; i++) {
                result *= 10;
            }
        }
        System.out.println("Smallest number with " + digits + " digits: " + result);

    }
}
