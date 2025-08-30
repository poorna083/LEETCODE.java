import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return nums[i]; 
            }
        }
        return -1; 
    }
}

public class singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.singleNumber(nums));
    }
}
