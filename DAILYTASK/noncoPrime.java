import java.util.Scanner;

public class noncoPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] A = new int[size];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
    }
}
