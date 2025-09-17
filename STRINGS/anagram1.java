import java.util.Scanner;
import java.util.*;
class Inneranagram1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }
}
public class anagram1 {
       public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
       }
}
