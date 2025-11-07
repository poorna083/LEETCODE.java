import java.util.Scanner;
class InnercandySwap {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        private int binarySearch(int[] arr,int target){ 

        int s = 0, e = arr.length-1;
        
        while(s <= e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) s=mid+1;
            else e = mid - 1;
        }
        return -1;
    }
    
    public int[] fairCandySwap(int[] a, int[] b) { //a = Alice , b=Bob

        int suma=0,sumb=0;
        for(int i = 0; i < a.length; i++)
            suma += a[i];
        
        for(int i = 0; i < b.length; i++)
            sumb +=b [i];
        
        int diff = (suma - sumb)/2;
        
        Arrays.sort(a);
        for(int num : b)
        {
            if (binarySearch(a, num + diff) !=-1) 
                return new int[] { num + diff, num };
        }
        
        return null;
    }
    }
    
}
public class candySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bobsize = sc.nextInt();
        int alicesize = sc.nextInt();
        int [] bob = new int[bobsize];
        int [] alice = new int[alicesize];
        for(int i=0;i<bobsize;i++) bob[i]=sc.nextInt();
        for(int i=0;i<alicesize;i++)alice[i]=sc.nextInt();
        InnercandySwap i = new InnercandySwap();
        System.out.println(i.fairCandySwap(alice, bob));
        sc.close();

    }
}
