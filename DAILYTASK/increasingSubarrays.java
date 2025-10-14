import java.util.*;
public class increasingSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter The Elements size:");
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        sc.close();

    }
}
