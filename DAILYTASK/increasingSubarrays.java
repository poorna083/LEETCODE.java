import java.util.*;
class InnerIncreasingSubarrays {
    public boolean hasIncreasingSubarrays(List<Integer> list, int k) {
        int n = list.size();
        for (int a = 0; a + 2 * k <= n; a++) {
            if (isIncreasing(list, a, a + k - 1) && 
                isIncreasing(list, a + k, a + 2 * k - 1)) {
                return true;
            }
        }
        return false;
    }
    private boolean isIncreasing(List<Integer> list, int start, int end) {
        for (int i = start; i < end; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
public class increasingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter The Elements size:");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        sc.close();
        InnerIncreasingSubarrays i = new InnerIncreasingSubarrays();
        System.out.println(i.hasIncreasingSubarrays(list, k));


    }
}
