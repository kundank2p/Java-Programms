package StringProblems;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam"; // Change this for different inputs
        if (isPalindrome(str.toLowerCase())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
