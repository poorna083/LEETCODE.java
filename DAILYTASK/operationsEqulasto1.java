import java.util.Scanner;
class InneroperationsEqulasto1 {
    public int minOperations(int[] nums) {
        
    }
    
}
public class operationsEqulasto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums [] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        InneroperationsEqulasto1 i = new InneroperationsEqulasto1();
        System.out.println(i.minOperations(nums));
    }
}
