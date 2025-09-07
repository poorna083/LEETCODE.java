import java.util.Random;
import java.util.Scanner;

public class uniqueIntigers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int a =0;
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < n-1; i++) {
            array[i]=r.nextInt(21)-10;
            a += array[i];
        }
        array[n-1]=(-(a));
        for(int su:array){
            sum +=su;
        }
        System.out.println(sum);
        sc.close();
    }
}
