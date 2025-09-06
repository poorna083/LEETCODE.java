import java.util.Scanner;
class Solution {
    public boolean sequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}

public class isSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Solution sol = new Solution();
        System.out.println(sol.sequence(s, t));
    }
}
