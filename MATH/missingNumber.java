import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class solution{
    public int missingNumber(int[]nums,Set<Integer> set){
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)) return i;
        }return -1; 
    }
}
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <Integer> set = new HashSet<>();
        int size = sc.nextInt();
        int [] nums = new int[size];
        solution s = new solution();
        s.missingNumber(nums,set);
    }
}
