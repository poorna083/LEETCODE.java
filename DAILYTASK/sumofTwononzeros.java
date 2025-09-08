import java.util.Random;
import java.util.Scanner;

public class sumofTwononzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        Random r = new Random();
        for (int i = 0; i <2; i++) {
            array[i]=r.nextInt(n*2)-n/2;
        }
        
    }
}
