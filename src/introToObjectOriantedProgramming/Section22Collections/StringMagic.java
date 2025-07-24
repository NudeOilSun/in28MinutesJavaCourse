package introToObjectOriantedProgramming.Section22Collections;

import java.util.Arrays;

public class StringMagic {
     static boolean areAnagrams(String str1, String str2) {
         if (str1 == null || str2 == null) return false;

         str1 = str1.toLowerCase();
         str2 = str2.toLowerCase();

         if (str1.length() != str2.length()) return false;

         char[] charArray1 = str1.toCharArray();
         char[] charArray2 = str2.toCharArray();

         Arrays.sort(charArray1);
         Arrays.sort(charArray2);

         return Arrays.equals(charArray1, charArray2);
     }

    public static void main(String[] args) {
         var result = areAnagrams("hello", "helol");
        System.out.println("areAnagrams - " + result);
    }
}
