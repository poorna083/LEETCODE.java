import java.util.*;
class InnertriangulasSumofarray {
    public int triangleSum(int nums[]){
        
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
    }
}
