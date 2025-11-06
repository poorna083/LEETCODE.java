import java.util.Scanner;
class InnerarrayPartation {
    public int arrayPairSum(int[] nums) {
            
        int sum = 0;
        Arrays.sort(nums);
            
        for(int i=0; i<nums.length; i=i+2) 
            sum += nums[i];
        
        return sum;
    }
    
}
public class arrayPartation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        InnerarrayPartation i = new InnerarrayPartation();
        System.out.println(i.arrayPairSum(nums));
    }
}
