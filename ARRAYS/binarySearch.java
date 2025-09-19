import java.util.Scanner;
class InnerbinarySearch {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                return i;
            }
        }return -1;
    }
    
}
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the arrays");
        int [] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter The Target");
        int target = sc.nextInt();
        InnerbinarySearch ib = new InnerbinarySearch();
        System.out.println(ib.search(nums, target));
    }
}
