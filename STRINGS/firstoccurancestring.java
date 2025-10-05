import java.util.Scanner;
class Innerfirstoccurancestring {
    public int strStr(String haystack, String needle) {
  for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
}
}

public class firstoccurancestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String heystack = sc.nextLine();
        String needle = sc.nextLine();
    }
}
