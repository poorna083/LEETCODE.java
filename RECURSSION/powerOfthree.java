import java.util.Scanner;

public class powerOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        if (n <= 0) {
            System.out.println(flag);
            return;
        }
        while (n % 3 == 0) {     
            n /= 3;
        }
        System.out.println(n == 1);
    }
}
