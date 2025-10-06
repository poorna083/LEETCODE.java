import java.util.Arrays;
import java.util.Scanner;
class InnerthirdMaximumNumber {
public int thirdmax(int [] nums){
    for(int i=nums.length;i<=1;i--){
        System.out.println(nums[i]);
    }
}
    
}
public class thirdMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        InnerthirdMaximumNumber i = new InnerthirdMaximumNumber();
        System.out.println(i.thirdmax(nums));
    }
}
