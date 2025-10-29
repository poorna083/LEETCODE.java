import java.util.Scanner;
class InnersmallestNumber {
    public int smallestNumber(int n) {
        return -1 >>> Integer.numberOfLeadingZeros(n);
    }
}
public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InnersmallestNumber i = new InnersmallestNumber();
        System.out.println(i.smallestNumber(n));
    }
}
