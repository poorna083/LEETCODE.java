import java.util.Scanner;

public class countelementofhighfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the array:");
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
    }
}
