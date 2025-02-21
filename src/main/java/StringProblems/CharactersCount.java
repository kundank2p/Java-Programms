package StringProblems;

public class CharactersCount {

    public static void main(String[] args) {

        String str = "JAVA is Amazing";
        String input = str.toLowerCase();

        int count =  input.length()-input.replaceAll("a", "").length();
        System.out.println("Number of 'A's: " + count);

//        long count = input.chars().filter(ch -> ch == 'A' || ch == 'a').count();
//        System.out.println("Number of 'A's: " + count);

    }

}
