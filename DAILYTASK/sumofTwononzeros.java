import java.util.Scanner;
import java.util.Arrays;

public class sumofTwononzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[2];
        if (n > 2) {
            if (n % 2 == 0) {
                array[0] = 1;
                array[1] = n - 1;
            } else {
                array[0] = 2;
                array[1] = n - 2;
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Not possible for n <= 2");
        }
        sc.close();
    }
}
