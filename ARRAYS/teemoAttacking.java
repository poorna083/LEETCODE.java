import java.util.Scanner;
class InnerteemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            if (timeSeries[i+1] <= timeSeries[i] + duration-1) {
                total += timeSeries[i+1] - timeSeries[i];
            } else { 
                total += duration;
            }
        }
        total += duration;
        return total;
    }
    
}
public class teemoAttacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        int duration = sc.nextInt();
        InnerteemoAttacking i = new InnerteemoAttacking();
        System.out.println(i.findPoisonedDuration(nums, duration));
        sc.close();
    }
}
