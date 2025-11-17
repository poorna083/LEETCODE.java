import java.util.Scanner;
class InneronesLength {
    public boolean kLengthApart(int[] nums, int k) {
        int lastIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                if (lastIndex != -1 && i - lastIndex - 1 < k) {
                    return false;
                }
                lastIndex = i;
            }
        }

        return true;
    }
    
}
public class onesLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<size;i++)nums[i]=sc.nextInt();
        int k = sc.nextInt();
        InneronesLength i = new InneronesLength();
        System.out.println(i.kLengthApart(nums, k));

    }
}
