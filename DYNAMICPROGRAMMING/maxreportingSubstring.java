import java.util.Scanner;
class MaxreportingSubstring{
    public int maxRepeting(String Sequence, String word){
        
            char[] seq = Sequence.toCharArray();
        
    }
}
public class maxreportingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Sequence = sc.nextLine();
        String word = sc.nextLine();
        MaxreportingSubstring i = new MaxreportingSubstring();
        System.out.println(i.maxRepeting(Sequence, word));
        sc.close();
    }
}
