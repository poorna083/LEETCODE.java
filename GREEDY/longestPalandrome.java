import java.util.Scanner;
class Solution{
    int res;
public int Answer(String a){
     res = a.length();
     return res;
}
}
public class longestPalandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Solution s = new Solution();
        s.Answer(a);
        
        
    }
}
