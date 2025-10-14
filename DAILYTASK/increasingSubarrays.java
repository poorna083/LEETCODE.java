import java.util.*;
class InnerincreasingSubarrays{
    public boolean hasIncreasingSubarrays(List<Integer> list ,int k){
        int size = list.size();
        List <Integer> firsthalf = new ArrayList<>();
        List <Integer> Secondhalf = new ArrayList<>();
        for(int i=0;i<size/2;i++){
            firsthalf.add(list.get(i));
        }
        for(int i=size/2;i<size;i++){
            Secondhalf.add(list.get(i));
        }
        for(int i=0;i<k;i++){
            if(firsthalf.get(i) == k) return true;
            else return false;
        }
        for(int i=0;i<k;i++){
            if(Secondhalf.get(i) == k) return true;
            else return false;
        }
        


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
