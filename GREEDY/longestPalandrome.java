import java.util.Scanner;
class InnerlongestPalandrome {
   public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int result = 0;
        for (int v : count) {
            result += v / 2 * 2;
            if (result % 2 == 0 && v % 2 == 1) {
                result++;
            }
        }
        return result;
    }
    
}

public class longestPalandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        InnerlongestPalandrome l = new InnerlongestPalandrome();
        System.out.println(l.longestPalindrome(s));
        sc.close();
    }
}
