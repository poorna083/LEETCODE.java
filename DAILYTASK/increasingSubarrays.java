import java.util.*;
class InnerincreasingSubarrays{
    public boolean hasIncreasingSubarrays(List<Integer> list ,int k){
        int size = list.size();
        
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
        InnerincreasingSubarrays i = new InnerincreasingSubarrays();
        System.out.println(i.hasIncreasingSubarrays(list, k));


    }
}
