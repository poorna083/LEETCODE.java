import java.util.Scanner;
import java.util.*;
class InnerdistintElements{
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, prev = (int)-1e9;

        for (int x : nums) {
            int l = Math.max(x - k, prev + 1);
            if (l <= x + k) {
                prev = l;
                ans++;
            }
        }
        return ans;
    }
}

public class distintElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i]=sc.nextInt();
        }
        sc.close();
    }
}
