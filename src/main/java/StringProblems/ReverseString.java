package StringProblems;

public class ReverseString {
    public static void main(String[] args) {
        String e = "this is a new code" ;
        String f[]= e.split(" ");
        String rev = "";
        for (int i=e.length()-1;i>=0;i--) {
            rev = rev + e.charAt(i);
        }
        System.out.println(rev);
    }
}
