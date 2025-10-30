import java.util.Arrays;
import java.util.Scanner;

public class ritchCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] [] array = new int[size][size];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;i++){
                array[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        
    }
}
