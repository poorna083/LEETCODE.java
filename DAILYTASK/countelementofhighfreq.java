import java.util.Scanner;
class Innercountelementofhighfreq {
    public int maxFrequencyElements(int[] array) {
        
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
    }
}
