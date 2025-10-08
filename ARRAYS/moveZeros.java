import java.util.*;

class InnerMoveZeros {
    public void moveZeros(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        InnerMoveZeros mover = new InnerMoveZeros();
        mover.moveZeros(nums);

        System.out.println("Array after moving zeros:");
        System.out.println(Arrays.toString(nums));
    }
}
