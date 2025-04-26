package StringProblems;

public class StringExample {
    public static void main(String[] args) {
        String input = "INput String  ";
        String input2 = "Input String";

        System.out.println(input.length());
        System.out.println(input.charAt(2));
        System.out.println(input.substring(5));
        System.out.println(input.substring(1,9));
        System.out.println(input2.isEmpty());
        char [] array = input.toCharArray();
        System.out.println(array);
        System.out.println(input.equals(input2));
        System.out.println(input.equalsIgnoreCase(input2));
        System.out.println(input.startsWith("I"));
        System.out.println(input.endsWith("s"));
        System.out.println(input.contains("Str"));
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());
        System.out.println(input.trim());
        System.out.println(input.replace("IN", "In"));
        System.out.println(input.indexOf("I"));
        System.out.println(input.indexOf(" "));
        String [] words =  input.split(" ");
        System.out.println(words[1]);
        System.out.println(input.concat(input2));

    }
}
