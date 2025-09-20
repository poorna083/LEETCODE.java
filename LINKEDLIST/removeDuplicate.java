import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class Duplicate{
    int val;
    int node;
    int next ;
    
}
public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> linkedlist = new LinkedList<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            linkedlist.add(sc.nextInt());
        }
        for (int i = 0; i < size; i++) {
            if(linkedlist.get(i)==linkedlist.get(i+1)){
                linkedlist.remove(i+1);
            }
        }
        System.out.println(linkedlist);
    }
}
