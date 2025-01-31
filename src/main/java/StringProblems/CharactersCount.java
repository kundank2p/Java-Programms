package StringProblems;
public class CharactersCount {
    public static void main(String[] args) {
        String input = "JAVA is Amazing";
        long count = input.chars().filter(ch -> ch == 'A' || ch == 'a').count();
       long  count1 = input.chars().filter(ch->ch=='A'|| ch == 'a').count();
        System.out.println("Number of 'A's: " + count1);

    }

}
