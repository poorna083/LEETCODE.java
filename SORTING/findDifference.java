import java.util.Scanner;

class InnerfindDifference {
    public char findTheDifference(String s, String t) {
        char result = 0; 
        for (char c : s.toCharArray()) {
            result ^= c; 
        }
        for (char c : t.toCharArray()) {
            result ^= c; 
        }
        return result;
    }
}

public class findDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        InnerfindDifference id = new InnerfindDifference();
        System.out.println(id.findTheDifference(s, t));
    }
}

