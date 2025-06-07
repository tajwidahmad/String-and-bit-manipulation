import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram_strings {
    public static void main(String[] args) {
        String str1="race";
        String str2 ="cares";
        str1=str1.replaceAll("//s", "").toLowerCase();
        str2=str2.replaceAll("//s", "").toLowerCase();
        if (str1.length()!=str2.length()) {
            System.out.println("not an anagram");
            
        }
        else{
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        System.out.println("yes its an anagrram");
        }

    }
}
