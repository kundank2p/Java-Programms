package Extra;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "interesting";
        int count = input.length() - input.replace("e", "").length();
        System.out.println("Number of 'e': " + count);
    }


}
