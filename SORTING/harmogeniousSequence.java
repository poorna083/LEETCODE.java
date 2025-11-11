import java.util.Scanner;
import java.util.Arrays;
class InnerharmogeniousSequence {
    public int findLHS(int [] nums){
        Arrays.sort(nums);
        int l = 0, r = 1, res = 0;
        while(r < nums.length) {
            int diff = nums[r] - nums[l];
            if(diff == 1) res = Math.max(res, r - l + 1);
            if(diff <= 1) r++;
            else l++;
        }

        return res;
    }
    
}
public class harmogeniousSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<size;i++)nums[i]=sc.nextInt();
        sc.close();
        InnerharmogeniousSequence i = new InnerharmogeniousSequence();
        System.out.println(i.findLHS(nums));
    }
}
