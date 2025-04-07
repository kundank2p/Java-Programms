package StringProblems;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(checkAnagram(str1,str2));
    }

    private static boolean checkAnagram(String str1, String str2) {
        if (str1.length()!= str2.length())
            return false;
        else {
            char[] arr1 =str1.toLowerCase().toCharArray();
            char[] arr2 =str2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);

        }
    }


}
