import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
 class InnercontainsDuplicate {
    public boolean containsduplicate(int k , int[]nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                Set <Integer> s = new HashSet<>();
                for (Integer integer : s) {
                    if (s.add(integer)) {
                        if((i-j)<=k) return true;
                    }
                }
            }
        }return false;
    }
    
}

public class containsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int size = sc.nextInt();
        System.out.println("Array elements:");
        int [] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        int k = sc.nextInt();

    }
}
