import java.util.*;
class InnerElementsTozero {
    public int minOperations(int[] nums) {
        var stack = new int[nums.length + 1];
        var top = 0;
        var ans = 0;
        for (var i = 0; i < nums.length; i++) {
            while (stack[top] > nums[i]) {
                top--;
                ans++;
            }
            if (stack[top] != nums[i])
                stack[++top] = nums[i];
        }
        return ans + top;
    }
    
}
public class ElementsTozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
         for(int i=0;i<size;i++) nums[i]=sc.nextInt();
         InnerElementsTozero i = new InnerElementsTozero();
         System.out.println(i.minOperations(nums));
         sc.close();
    }
    
    
}
