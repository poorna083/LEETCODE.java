import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class FrequentVowel{
    public int InnermostfrequentVowelandconsonent(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.get(s);
        }
    }
}

public class mostfrequentVowelandconsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        FrequentVowel f = new FrequentVowel();
        f.InnermostfrequentVowelandconsonent(s);
    }
}
