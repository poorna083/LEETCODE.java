import java.util.*;
class SumOfTwo{
    public int [] sumoftwo(int [] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[] {i,j};
                }
            }
        }return new int[]{};
    }
}
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int [] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        SumOfTwo st = new SumOfTwo();
        st.sumoftwo(nums, target);
        sc.close();
    }
}
