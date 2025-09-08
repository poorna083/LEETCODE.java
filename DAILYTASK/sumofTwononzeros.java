import java.util.Scanner;
import java.util.Arrays;

public class sumofTwononzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[2];  
        array[0] = n / 2;
        array[1] = n - array[0];
        if (array[0] == 0 || array[1] == 0) {
            array[0] = 1;
            array[1] = n - 1;
        }
        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
