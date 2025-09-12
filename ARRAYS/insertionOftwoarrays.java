import java.util.Arrays;
import java.util.Scanner;
class insertionoftwo{
    public int[] insertionoftwoArray(int [] nums1,int [] nums2){
        int[] duplicate = new int[nums1.length+nums2.length];
        for (int i = 0; i < duplicate.length; i++) {
            duplicate[i]= nums1[i]+nums2[i];
        }
        Arrays.sort(duplicate);
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i+1; j < duplicate.length; j++) {
                if (duplicate[i]=duplicate[j]) {
                    
                }
            }
        }
        return duplicate;
    }
}

public class insertionOftwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1");
        int size = sc.nextInt();
        int [] nums1 = new int[size];
        System.out.println("Size of 2");
        int siz = sc.nextInt();
        int [] nums2 = new int[siz];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=sc.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=sc.nextInt();
        }
        insertionoftwo it = new insertionoftwo();
        System.out.println(it.insertionoftwoArray(nums1, nums2));
    }
}
