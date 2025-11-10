import java.util.Scanner;
class InnerElementsTozero {
    public int minOperations(int[] nums) {
        
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
    }
    
    
}
