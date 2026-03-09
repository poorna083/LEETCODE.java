import java.util.Arrays;
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        char[] array = new char[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.next().charAt(0);
        }
        int start = 0;
        int end = size - 1;

        while(start < end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(array));
        sc.close();
    }
}