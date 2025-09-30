import java.util.*;
class InnertriangulasSumofarray {
    public int triangleSum(int nums[]){
        for(int i=0;i<nums.length;i++){
            int sum;
            for(int j=0;j<nums.length;j++){
               sum = nums[j]+nums[j+1];
            }
            return sum;
        }
        
    }
    
}
public class triangulasSumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size");
        int size = sc.nextInt();
        System.out.println("enter THE elements");
        int [] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        InnertriangulasSumofarray i = new InnertriangulasSumofarray();
        System.out.println(i.triangleSum(nums));
        sc.close();
    }
}
