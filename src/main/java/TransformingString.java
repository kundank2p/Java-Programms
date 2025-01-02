public class TransformingString {

    public static void main(String[] args) {
        String input = "got to nooo";
        String output = transformString(input);
        System.out.println(output);
    }

    private static String transformString(String input) {
        StringBuilder result = new StringBuilder();
        String [] words = input.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words [i];
            String transforrmedWord = word.replaceAll("[aeiou]","#");
            transforrmedWord +="#".repeat(i+1);
            result.append(transforrmedWord).append(" ");
        }
        return result.toString().trim();

    }
}
