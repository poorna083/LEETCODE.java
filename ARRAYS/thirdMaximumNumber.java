import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class InnerthirdMaximumNumber {
public int thirdmax(int [] nums){
   Integer[] numsObj = Arrays.stream(nums).boxed().toArray(Integer[]::new);
   Arrays.sort(numsObj, Collections.reverseOrder());
   

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
