import java.util.*;
class InnermincostClimbingstairs {
    public int mincostclimbingStairs(int [] cost){
        int n = cost.length ;
        for(int i=2 ; i<n ; i++){
            cost[i] = Math.min(cost[i-1] , cost[i-2]) + cost[i];
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }
    
}
public class mincostClimbingstairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size:");
        int size = sc.nextInt();
        System.out.println("Enter The Elements:");
        int [] cost = new int[size];
        for(int i=0;i<size;i++){
            cost[i]=sc.nextInt();
        }
        sc.close();
        InnermincostClimbingstairs i = new InnermincostClimbingstairs();
        System.out.println(i.mincostclimbingStairs(cost));
    }
}
