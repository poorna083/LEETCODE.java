import java.util.*;
 class InnernoncoPrime {
    public List<Integer> replaceNonCoprimes(int[] A) {
        LinkedList<Integer> res = new LinkedList();
        for (int a : A) {
            while (true) {
                int last = res.isEmpty() ? 1 : res.getLast();
                int x = gcd(last, a);
                if (x == 1) break;
                a *= res.removeLast() / x;
            }
            res.add(a);
        }
        return res;
    }
    private int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }
    
}

public class noncoPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] A = new int[size];
        for (int i = 0; i < A.length; i++) {
            A[i]=sc.nextInt();
        }
        InnernoncoPrime i = new InnernoncoPrime();
        System.out.println(i.replaceNonCoprimes(A));
    }
}
