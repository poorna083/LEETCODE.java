import java.util.*;
class InnersneekyNumbers {
    public int[] getSneakyNumbers(int[] nums){
        int xor = 0;
        int n = nums.length - 2;

        for (int num : nums) xor ^= num;
        for (int i = 0; i < n; i++) xor ^= i;

        int diffBit = xor & -xor;

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & diffBit) == 0) a ^= num;
            else b ^= num;
        }
        for (int i = 0; i < n; i++) {
            if ((i & diffBit) == 0) a ^= i;
            else b ^= i;
        }

        return new int[]{a, b};
    }
}
public class sneekyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        InnersneekyNumbers i = new InnersneekyNumbers();
        System.out.println(i.getSneakyNumbers(nums));


    }
}
