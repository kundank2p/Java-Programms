public class RemoveDuplicatesWithoutCollections {
    public static void main(String[] args) {
        String input = "testing is important testing";
        String[] words = input.split(" ");
        String output = removeDuplicates(words);
        System.out.println(output);
    }

    public static String removeDuplicates(String[] words) {
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (!isWordPresent(result, words[i])) {
                // Add the word to the result if not already present
                result += words[i] + " ";
            }
        }
        // Trim the trailing space before returning
        return result.trim();
    }

    public static boolean isWordPresent(String result, String word) {
        // Check if the word already exists in the result string
        String[] existingWords = result.split(" ");
        for (String existingWord : existingWords) {
            if (existingWord.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
