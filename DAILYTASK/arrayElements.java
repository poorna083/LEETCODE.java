import java.util.Scanner;
class InnerarrayElements {
    public int countValidSelections(int[] nums) {
        int len = nums.length, count = 0, left = 0;
        int right = Arrays.stream(nums).sum();
        for (int i = 0; i < len; i++) {
            left += nums[i];
            right -= nums[i];
            if (nums[i] != 0) continue;
            if (left == right) count += 2;
            if (Math.abs(left - right) == 1) count++;
        }
        return count;
    }
    
}
public class arrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        InnerarrayElements i = new InnerarrayElements();
        System.out.println(i.countValidSelections(array));
    }
}
