import java.util.Scanner;
class InnerkeepMultiplying {
    public int keepmultiply(int [] nums,int key){
         int bits = 0;
        for (int num : nums) {
            if (num % key != 0) continue;
            int n = num / key;
            if ((n & (n - 1)) == 0)
                bits |= n;
        }
        bits++;
        return key * (bits & -bits);
    }
    
}
public class keepMultiplying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] nums = new int[size];
        for(int i=0;i<size;i++)
        nums[i]=sc.nextInt();
        int key = sc.nextInt();
        InnerkeepMultiplying i = new InnerkeepMultiplying();
        System.out.println(i.keepmultiply(nums, key));
        sc.close();
    }
}
