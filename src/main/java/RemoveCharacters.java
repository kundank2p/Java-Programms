public class RemoveCharacters {
    public static void main(String[] args) {
        String q = "3984830n vc940c4nt8tyc49n98y 35r34cu8p934un098534m  493 puc389&*^%* *^^(*W!( 09*!*)W((! *#*";
        System.out.println(q.replaceAll("[^a-z]", ""));
    }
}
