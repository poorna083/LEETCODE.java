import java.util.Scanner;
class Solution{
    public boolean sequence(String a,String b){
        if(a.isEmpty() || b.isEmpty()) return false;
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            }
            i++;
        }return j == b.length();
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
