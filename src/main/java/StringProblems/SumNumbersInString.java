package StringProblems;

public class SumNumbersInString {
    public static void main(String[] args) {
        String input = "iudsu111jkf2sdlkf33";
        int sum = 0;

        // Regular expression to match numbers in the string
        String[] numbers = input.split("\\D+"); // Split by non-digit characters

        for (String number : numbers) {
            sum += number.isEmpty() ? 0 : Integer.parseInt(number);
        }


        System.out.println("Output = " + sum); // Print the sum
    }
}
