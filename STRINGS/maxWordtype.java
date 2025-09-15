import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 class InnermaxWordtype {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canType = true;
            for (char ch : brokenLetters.toCharArray()) {
                if (word.indexOf(ch) != -1) { 
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
    
}

public class maxWordtype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String broke = sc.nextLine();
        InnermaxWordtype i = new InnermaxWordtype();
        System.out.println(i.maxwordtyppe(s, broke));
    }
}
