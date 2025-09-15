import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 class InnermaxWordtype {
    public int maxwordtyppe(String s,String broke){
        Set<Character> st = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
        }  
    }
    
}

public class maxWordtype {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String broke = sc.nextLine();
        InnermaxWordtype i = new InnermaxWordtype();
        i.maxwordtyppe(s, broke);
    }
}
