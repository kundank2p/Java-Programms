package StringProblems;

public class VowelReplacer {
    public static void main(String[] args) {
        String input = "DNA DNA DNA DNA DNA";
        String output = replaceVowelsWithPattern(input);
        System.out.println("Input String: " + input);
        System.out.println("Output String: " + output);
    }

    public static String replaceVowelsWithPattern(String input) {
        String result = ""; // Initialize an empty string for the result
        int count = 1; // Counter for `@` pattern

        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                // Append `@` 'count' times using a loop
                for (int i = 0; i < count; i++) {
                    result = result +  "@";
                }
                count++;
            } else {
                // Append the original character to the result
                result += c;
            }
        }
        return result;
    }
    public static boolean isVowel(char c) {
        // Check if the character is a vowel (case insensitive)
        c = Character.toLowerCase(c); // Convert to lowercase for simplicity
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
