import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 class InnermaxWordtype {
    public int maxwordtyppe(String s,String broke){
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            if(s.contains(broke));
            count ++;
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
        i.maxwordtyppe(s, broke);
    }
}
