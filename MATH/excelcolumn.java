import java.util.Scanner;
class Innerexcelcolumn {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
public class excelcolumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sc.close();
    }
}
