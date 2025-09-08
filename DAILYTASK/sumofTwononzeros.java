import java.util.Scanner;

public class sumofTwononzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int [] array = new int[2];
        int [] arr = new int[2];
        for(int i=0;i<2;i++){
            array[i]=(n/2);
            array[i+1]=n-array[i];  
        }
        for (int i = 0; i < 2; i++) {
            arr[i]=array[i];
            arr[i+1]=array[i+1];
        }
        System.out.println(arr);
        sc.close();
    }
}
