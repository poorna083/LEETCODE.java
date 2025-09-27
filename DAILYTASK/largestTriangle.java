import java.util.Scanner;

public class largestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][]array = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array[i][j] = sc.nextInt();
            }
        }
    }
}
