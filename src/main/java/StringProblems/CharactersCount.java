package StringProblems;

public class CharactersCount {
    
    public static void main(String[] args) {
<<<<<<< HEAD

        String str = "JAVA is Amazing";
        String input = str.toLowerCase();

//        long count = input.chars().filter(ch -> ch == 'A' || ch == 'a').count();

        int count1 =  input.length()-input.replaceAll("a", "").length();


        System.out.println("Number of 'A's: " +count1);
=======
        
        String input = "JAVA is Amazing";
        
        long count = input.chars().filter(ch -> ch == 'A' || ch == 'a').count();
        
       long  count1 = input.chars().filter(ch->ch=='A'|| ch == 'a').count();
        
        System.out.println("Number of 'A's: " + count1);
>>>>>>> 2515dd626ee0111c795760dc8a885492c1c02def

    }

}
