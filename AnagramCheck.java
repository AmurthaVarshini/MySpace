import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s1, String s2) {
        return s1.length() == s2.length() && 
               Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));  // true
        System.out.println(isAnagram("hello", "world"));    // false
    }
