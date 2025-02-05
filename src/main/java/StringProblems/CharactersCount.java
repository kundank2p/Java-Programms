package StringProblems;

public class CharactersCount {

    public static void main(String[] args) {

        String str = "JAVA is Amazing";
        String input = str.toLowerCase();

//        long count = input.chars().filter(ch -> ch == 'A' || ch == 'a').count();

        int count1 =  input.length()-input.replaceAll("a", "").length();


        System.out.println("Number of 'A's: " +count1);

    }

}