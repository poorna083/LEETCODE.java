import java.util.HashMap;
import java.util.Scanner;
class Innercountelementofhighfreq {
    public int maxFrequencyElements(int[] array) {
        boolean [] visited = new boolean[array.length];
        for(int i=0;i<array.length;i++){
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
        }
    }
    
}
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
        Innercountelementofhighfreq i = new Innercountelementofhighfreq();
        System.out.println(i.maxFrequencyElements(array));
        sc.close();
    }
}
