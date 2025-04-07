package StringProblems;

public class SumNumbersInString {
    public static void main(String[] args) {
        String input = "Automation 1234testing";
        String output = sumNumbersInString(input);
        System.out.println("Modified String: " + output);
    }

    private static String sumNumbersInString(String str) {
        StringBuilder result = new StringBuilder();
        int sum = 0;
        boolean foundNumber = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch); // Sum up individual digits
                foundNumber = true;
            } else {
                if (foundNumber) {
                    result.append(sum); // Append the sum before the next word
                    foundNumber = false;
                    sum = 0; // Reset sum for potential new numbers
                }
                result.append(ch);
            }
        }

        if (foundNumber) { // If number is at the end, append the sum
            result.append(sum);
        }

        return result.toString();
    }
}
