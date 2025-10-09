import java.util.Scanner;
class InnerlongestsubSequence {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int last = -1;
        for (int i = 0; i < words.length; i++) {
            if (groups[i] != last) {
                result.add(words[i]);
                last = groups[i];
            }
        }
        return result;
    }
}
public class longestsubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int [] words = new int[size1];
        int [] groups = new int[size2];
        for (int i = 0; i < words.length; i++) {
            array1[i]=sc.nextInt();
        }
        for (int i = 0; i < groups.length; i++) {
            array2[i]=sc.nextInt();
        }
        InnerlongestsubSequence i = new InnerlongestsubSequence();
        System.out.println(i.getLongestSubsequence(words, groups));
    }
}
