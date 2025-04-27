package StringProblems;

public class DuplicateWord {
    public static void main(String[] args) {
        String string = "Java is beautiful. Java is Object-Oriented. Java is Great";

        int count;

        string = string.toLowerCase();

        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");

        for(int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i] +" -> " +count);
        }
    }
}