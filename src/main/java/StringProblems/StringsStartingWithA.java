package StringProblems;


public class StringsStartingWithA {
        public static void main(String[] args) {
            // Given string
            String input = "ofo ojfeo jojewfo adjos adojjf aodfjoii goij odjg dogjoi fgoijo igdj";

            // Split the string into words
            String[] words = input.split(" ");

            // Print words starting with 'A' or 'a'
            System.out.println("Words starting with 'A' or 'a':");
            for (String word : words) {
                if (word.toLowerCase().startsWith("a")) {
                    System.out.println(word);
                }
            }
        }
    }


