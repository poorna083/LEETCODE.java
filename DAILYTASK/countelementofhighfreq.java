import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
class Innercountelementofhighfreq {
    public int maxFrequencyElements(int[] array) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : array) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : mp.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : mp.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;
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
        int result = i.maxFrequencyElements(array);
        System.out.println("Result: " + result);
        sc.close();
    }
}
