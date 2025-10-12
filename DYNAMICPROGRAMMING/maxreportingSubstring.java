import java.util.Scanner;

class MaxRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String temp = word;
        while (sequence.contains(temp)) {
            count++;
            temp += word;
        }
        return count;
    }
}

public class maxreportingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.nextLine();
        String word = sc.nextLine();

        MaxRepeatingSubstring obj = new MaxRepeatingSubstring();
        System.out.println(obj.maxRepeating(sequence, word));

        sc.close();
    }
}
