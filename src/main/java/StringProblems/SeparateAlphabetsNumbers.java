package StringProblems;



public class SeparateAlphabetsNumbers {
    public static void main(String[] args) {
        String input = "abc123xyz456";  // Example input
        StringBuilder alphabets = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabets.append(ch);  // Add to alphabets
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);  // Add to numbers
            }
        }

        // Output
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Numbers: " + numbers);
    }
}
