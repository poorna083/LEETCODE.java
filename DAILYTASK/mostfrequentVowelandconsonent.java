import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class FrequentVowel{
    public int InnermostfrequentVowelandconsonent(String s) {
        int [] freq = new int[26];
        int maxVowel = 0; int maxConso = 0;
        for(char c : s.toCharArray()){
            int i = c - 'a';
            freq[i]++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxVowel = Math.max(maxVowel ,freq[i]);
            }
            else {
                maxConso = Math.max(maxConso, freq[i]);
            }
            return maxVowel + maxConso;
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
