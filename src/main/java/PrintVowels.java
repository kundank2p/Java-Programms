public class PrintVowels {
    public static void main(String[] args) {
        String input = "This is an input string";
        char[] output = input.toCharArray();

        for (int i = 0; i < output.length; i++) {
            if (output[i] == 'a' || output[i] == 'e' || output[i] == 'i' || output[i] == 'o' || output[i] == 'u') {
                System.out.print(output[i]+" ");
            }
        }
    }
}
