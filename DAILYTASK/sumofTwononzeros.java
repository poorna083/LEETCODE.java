import java.util.Random;
import java.util.Scanner;

public class sumofTwononzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i=0;i<2;i++){
            array[i]=(n%10);
            array[i+1]=(n/10);    
        }
    }
}
