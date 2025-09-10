import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class InnercontainsDuplicate {
    public boolean containsduplicate2(int k, int[] nums) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true; 
            }
            window.add(nums[i]);
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}

public class containsDuplicate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Size:");
        int size = sc.nextInt();
        
        System.out.println("Array elements:");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Enter k:");
        int k = sc.nextInt();
        
        InnercontainsDuplicate checker = new InnercontainsDuplicate();
        System.out.println(checker.containsduplicate2(k, nums));
    }
}
