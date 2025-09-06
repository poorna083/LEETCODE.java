import java.util.Scanner;
class Solution{
    public boolean sequence(String a,String b){
        if(a.isEmpty() || b.isEmpty()) return false;
        if (a.contains(b)) return true;
        return false;
    }
}
public class isSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Solution s = new Solution();
        System.out.println(s.sequence(a, b));
    }
}
