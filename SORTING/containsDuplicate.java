import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Duplicate{
     public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) return true; 
        }
        return false;
    }
}
public class containsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int [] array = new int[Size];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        Duplicate D = new Duplicate();
        System.out.println(D.containsDuplicate(array));
    }
}
