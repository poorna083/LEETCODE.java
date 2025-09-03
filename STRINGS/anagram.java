import java.util.Scanner;
import java.util.Arrays;
class solution{
    public boolean anagram(String s,String t){
        if(s.length()!=t.length()) return false;
        char[]sSort = s.toCharArray();
        char[]tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort,tSort);
    }
}
public class anagram {
    public static void main(String[] args) {
        solution sn = new solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sn.anagram(s, t);
    }
}
