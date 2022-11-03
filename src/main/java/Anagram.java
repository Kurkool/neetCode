import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] charS = s.toLowerCase().toCharArray();
        char[] charT = t.toLowerCase().toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        System.out.println(charS);
        System.out.println(charT);
        String sSorted = Arrays.toString(charS);
        String tSorted = Arrays.toString(charT);

        return sSorted.equalsIgnoreCase(tSorted);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
